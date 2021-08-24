package ds.stack;

public class BasicStack <X> {
    private X[] data;
    private int stackPointer;

    // CONSTRUCTOR
    public BasicStack(){
        data = (X[]) new Object[1000];
        stackPointer = 0;
    }

    // PUSHING
    public void push(X newItem){
        data[stackPointer++] = newItem;
    }

    // POPPING
    public X pop() {
        if(stackPointer == 0){
            throw new IllegalStateException("No more items in stack");
        }
        return data[--stackPointer];
    }

    // SEARCHING
    public boolean contains(X item){
        boolean found = false;
        for(int i = 0;  i < stackPointer; i++){
            if(data[i].equals(item)){
                found = true;
                break;
            }
        }
        return found;
    }

    public X access(X item){
        while (stackPointer > 0){
            X tmpItem = pop();
            if(item.equals(tmpItem)){
                return tmpItem;
            }
        }
        throw new IllegalStateException("Couldn't find element" + item);
    }

    public int size(){
        return stackPointer;
    }

}
