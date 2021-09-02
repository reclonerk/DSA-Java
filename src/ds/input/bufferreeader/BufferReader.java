package ds.input.bufferreeader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReader {

    public void myBufferReader(){
        try{
            // Buffer reader solve the problem of nextLine() taking input the enter as input.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter an integer");
            int a = Integer.parseInt(br.readLine());

            System.out.println("Enter a String");
            String b = br.readLine();

            System.out.printf("You have entered:- " + a + " and name as " + b);
        } catch (Exception e){
            System.out.println(e);
        }

    }

    /**
     * It still shows the same error :
     *  Not taking the string input after any integer input.
     */
    public void myScannner(){
        try{
            // Buffer reader solve the problem of nextLine() taking input the enter as input.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer");
            int a = scanner.nextInt();

            System.out.println("Enter a String");
            String b = scanner.nextLine();

            System.out.printf("You have entered:- " + a + " and name as " + b);
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
