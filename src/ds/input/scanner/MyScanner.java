package ds.input.scanner;

import java.util.Scanner;

public class MyScanner {

    public void testScanner(){
        Scanner sc = new Scanner(System.in);

//        // Inputting values
//
//        String name = sc.next();
//        char gender = sc.next().charAt(0);
//        int age = sc.nextInt();
//        long mobileNo = sc.nextLong();
//        double cgpa = sc.nextDouble();
//
//        // Printing values.
//        System.out.println("Name: "+name);
//        System.out.println("Gender: "+gender);
//        System.out.println("Age: "+age);
//        System.out.println("Mobile Number: "+mobileNo);
//        System.out.println("CGPA: "+cgpa);


        int cnt = 0;
        int sum = 0;
        while (cnt < 5){
            int val = sc.nextInt();
            sum = sum + val;
            cnt++;
        }
        System.out.println("Sum of the values is " + sum);
    }
}
