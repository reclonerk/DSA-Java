package ds.output.formatter;

public class MyOutputFormatter {

    public void printfInJava(){

        int x = 100;
        System.out.printf("Printing simple integer: x = %d\n", x);

        // this will print it upto 2 decimal places
        System.out.printf("Formatted with precision: PI = %.2f\n", Math.PI);

        // automatically appends zero to the rightmost part of decimal
        float n = 5.2f;
        System.out.printf("Formatted to specific width: n = %.4f\n", n);

        // here number is formatted from right margin and occupies a
        // width of 20 characters
        n = 2324435.3f;
        System.out.printf("Formatted to right margin: n = %20.4f\n", n);

        /**
         * Output :
         * Printing simple integer: x = 100
         * Formatted with precision: PI = 3.14
         * Formatted to specific width: n = 5.2000
         * Formatted to right margin: n =         2324435.2500
         */
    }
}
