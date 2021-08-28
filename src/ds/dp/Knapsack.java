package ds.dp;

/*

    Input :
    weight[] = {1,3,4,5}
    value[] = {1,4,5,7}
    W = 7 : Capacity of bag.

    Output :
    Maximum Profit

 */

public class Knapsack {

    int KnapsackRecursive(int[] weight, int[] value, int n, int W){
        // Base Condition - Smallest valid input
        if(n == 0 || W == 0){
            return 0;
        }

        // Logic - selection of choice
        if(weight[n-1] <= W){

            int choice1 = value[n-1] + KnapsackRecursive(weight, value, n-1, W-weight[n-1]);
            int choice2 = KnapsackRecursive(weight, value, n-1, W);
            return Integer.max(choice1, choice2);

        } else {
            int choice = KnapsackRecursive(weight, value, n-1, W);
            return choice;
        }
    }

    // Size of t[n+1][W+1]
    int[][] dp = new int[100][100];
    int KnapsackMemoized(int[] weight, int[] value, int n, int W){
        // Base Condition - Smallest valid input
        if(n == 0 || W == 0){
            return 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }

        // Logic - selection of choice
        if(weight[n-1] <= W){

            int choice1 = value[n-1] + KnapsackMemoized(weight, value, n-1, W-weight[n-1]);
            int choice2 = KnapsackMemoized(weight, value, n-1, W);
            return dp[n][W] = Integer.max(choice1, choice2);

        } else {
            int choice1 = KnapsackMemoized(weight, value, n-1, W);
            return dp[n][W] = choice1;
        }
    }

    void knapsackMemoizedTest(){
        int n = 10;
        int W = 50;

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= W; j++){
                dp[i][j] = -1;
            }
        }
    }

    /*

        Drawback of memoized : Function stack can be filled completely.
        Stackoverflow error.

        Top down approach

     */

    int knapsackTopdown(int[] weight, int[] value, int n, int W){
        int[][] dp = new int[n+1][W+1];
        // Initialisation
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= W; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        // Logic
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= W; j++){
                if(weight[i-1]  <= j){
                    int choice1 = value[i-1] + dp[i-1][j-weight[i-1]];
                    int choice2 = dp[i-1][j];
                    dp[i][j] = Integer.max(choice1, choice2);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][W];
    }


    /*
        Similar to knapsack.
        Problem Name : Subset Sum Problem
        Problem Statement : Is there any subset having sum equals to target.

        Input :
        arr[] = {2, 3, 7, 8, 10};
        target = 11;

        Output : true/false
     */

    boolean subsetSumProblem(int[] arr, int n, int target){
        int W = target;
        boolean[][] dp = new boolean[n+1][W+1];

        // Initialisation
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= W; j++){

                if(i == 0){
                    dp[i][j] = false;
                }
                // It will also include true for i == 0 && j == 0
                if(j == 0){
                    dp[i][j] = true;
                }
            }
        }

        // Logic
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= W; j++){
                if(arr[i-1]  <= j){
                    boolean choice1 = dp[i-1][j-arr[i-1]];
                    boolean choice2 = dp[i-1][j];
                    // Taking or of two choices.
                    dp[i][j] = choice1 | choice2;
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][W];
    }


    /*
        Problem Name : Equal Sum Partition Problem
        Can we divide in two subsets such that both subsets have equal sum.

        Input :
        arr[] = {2, 3, 7, 8, 10};
        target = 11;

        Output : true/false

     */

    boolean equalSumPartitionProblem(int[] arr, int n){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        if(sum%2 != 0){
            return false;
        }

        int target = sum / 2;

        return subsetSumProblem(arr, n, target);
    }

    /*
        Problem : Count of subsets having a given sum.

        Input :
        arr[] = {2, 3, 5, 6, 8, 10};
        target = 10;

        Output : 3 ( A number) = count of subset.

     */

    int countSubsetSum(int[] arr, int n, int sum){
        int W = sum;
        int[][] dp = new int[n+1][W+1];

        // Initialisation
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= W; j++){

                if(i == 0){
                    dp[i][j] = 0;
                }
                // It will also include true for i == 0 && j == 0
                if(j == 0){
                    dp[i][j] = 1;
                }
            }
        }

        // Logic
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= W; j++){
                if(arr[i-1]  <= j){
                    int choice1 = dp[i-1][j-arr[i-1]];
                    int choice2 = dp[i-1][j];
                    // Taking addition of two choices.
                    dp[i][j] = choice1 + choice2;
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][W];
    }
}
