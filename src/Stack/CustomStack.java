package Stack;


import java.util.ArrayList;

public class CustomStack<T> {
    private ArrayList<T> list;
    
    // Constructor to initialize the stack
    public CustomStack() {
        list = new ArrayList<>();
    }
    
    // Push an element onto the stack
    public void push(T value) {
        list.add(value);
    }
    
    // Pop an element from the stack
    public void pop() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Stack is empty"); 
        }
        System.out.println("Top value in stack is : " +list.get(list.size()-1));
        list.remove(list.size() - 1);
    }
    
    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    // Get the number of elements in the stack
    public int size() {
        return list.size();
    }
    
    // Print the contents of the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack contents (top to bottom):");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i)); 
        }
    }
    
    // pop element will go to 1st indext
    public void popToStart() {
    	 if (list.isEmpty()) {
             throw new IllegalStateException("Stack is empty"); 
         }
    	 int i = list.size() - 1;
    	 T top = list.get(i);
    	 while(i>0) {
    		 list.set(i,list.get(i-1));
    		 i--;
    	 }
    	 if(i == 0) {
    		 list.set(i, top);
    	 }
         System.out.println("Stack after removel");
    	 printStack();
    }
    
    // Main method to test the CustomStack
    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        stack.printStack(); 
        stack.popToStart();
        stack.popToStart();
        stack.popToStart();
        stack.popToStart();


    }
}

