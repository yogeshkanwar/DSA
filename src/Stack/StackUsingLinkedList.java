package Stack;

import LinkedList.Node;

public class StackUsingLinkedList {
	int value;
	Node top;
	
	public StackUsingLinkedList() {
		this.top = null;
	}
	
	// Push an element onto the stack
    public void push(int value) {
    	Node node = new Node(value);

    	if(top == null) {
    		top = node;
    	} else {
    		node.next = top;
    		top = node;		
    	}
    }
    
    public void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty"); 
        } else {
        	top = top.next;
        }
        System.out.println("Stack after pop is : ");
        printStack();    
    }
    
    
    // Print the contents of the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack contents (top to bottom):");
        Node current = top;
        while(current != null) {
        	System.out.print(current.value + " ");
        	current = current.next;
        }
    }
    
 // pop element will go to 1st index
    public void popToStart() {
    	 if (isEmpty()) {
             throw new IllegalStateException("Stack is empty"); 
         }
    	 Node current = top;
    	 Node temp = top;
    	 top = temp.next;

    	 while(current != null) {
    		 if(current.next == null) {
    			 current.next = temp;
    			 temp.next = null;
    	    	 break;
    		 } else {
        		 current = current.next;
    		 }
    	 }
         System.out.println("\nStack after removel");
    	 printStack();
    }
    
    
    private boolean isEmpty() {
		return top == null;
	}


	
	

}
