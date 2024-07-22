package LinkedList;

public class linkedList {
	
	Node start;
    
    public linkedList() {
        this.start = null;
    }
	
    public void add(int value) {
        Node node = new Node(value);
        if (start == null) {
            start = node;
        } else {
            Node current = start;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    } 
    
    public void remove(int value) {
    	Node current = start;
    	Node previous = null;
    	
    	while(current != null) {
    		if(current.value == value) {
    			break;
    		} else {
    			previous = current;
    			current = current.next;
    		}
    	}
    	previous.next=previous.next.next;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = start;
        while (current != null) {
            sb.append(current.value).append("  ");
            current = current.next;
        }
        return sb.toString();
    }
        
    
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.toString());
    }
}