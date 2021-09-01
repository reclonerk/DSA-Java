package ds.input.commandline;

public class Main {
    public static void main(String[] args) { // array of strings - argument form
        if (args.length > 0)
        {
            System.out.println("The command line arguments are:");

            // iteration of command line arguments.
            for (String val : args)
                System.out.println(val);
        }
        else
            System.out.println("No command line arguments found.");
    }
}
