package ds.stack;

public class MainBasicStack {

    private static BasicStack<String> stack = new BasicStack<String>();

    public static void main(String[] args){
        stack.push("Rahul");
        stack.push("Ajay");
        stack.push("Uday");
        stack.push("Adarsh");
        stack.push("Ankit");

        String val = stack.pop();
        System.out.println("Popped value is " + val);

        String searchString = "Jay";
        boolean res = stack.contains(searchString);
        System.out.println("Result of searching " + searchString + " is " + res);

        int size = stack.size();
        System.out.println("Size of the stack is " + size);

    }
}
