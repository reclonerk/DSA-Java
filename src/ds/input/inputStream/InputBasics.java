package ds.input.inputStream;

import java.io.*;

public class InputBasics{

    /**
     * We are going to read a text file from the system char by char.
     */

    public void readFileFromSystem() throws IOException {
        // Step-1 - Initialise
        FileReader textFileReader = new FileReader("/Users/Z007J96/IdeaProjects/DSA-Java/src/ds/input/ajay.txt");;

        // Step-2 - Reading file character by character
        int temp;
        while ((temp = textFileReader.read()) != -1) { // Returns the ASCII Value of the character.
            System.out.print((char) temp);
        }

        // Step 3 - Closing the file reader.
        textFileReader.close();
    }


    public void readFileFromSystemUsingTryAndCatch() {

        try {
            // Step-1 - Initialise
            FileReader textFileReader = new FileReader("/Users/Z007J96/IdeaProjects/DSA-Java/src/ds/input/ajay.txt");;

            // Step-2 - Reading file character by character
            int temp;
            while ((temp = textFileReader.read()) != -1) { // Returns the ASCII Value of the character.
                System.out.print((char) temp);
            }

            // Step 3 - Closing the file reader.
            textFileReader.close();
        } catch (Exception e){
            System.out.println("Something bad occured!");
        }

    }


    /**
     * Reading byte by byte in Java
     */

    public void readFileByteByByteUsingTryCatch(){


        try
        {
            FileInputStream sourceStream = null;
            FileOutputStream targetStream = null;
            sourceStream = new FileInputStream("src/ds/input/textfiles/ajay.txt");
            targetStream = new FileOutputStream ("src/ds/input/textfiles/rahul.txt");

            int temp;
            while ((temp = sourceStream.read()) != -1) {
                System.out.println((byte) temp);
                targetStream.write((byte) temp);
            }

            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }
        catch (Exception e){
            System.out.println("Very Bad Exception");
        }
    }

}