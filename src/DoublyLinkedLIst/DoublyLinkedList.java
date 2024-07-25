package DoublyLinkedLIst;

public class DoublyLinkedList {
	Node head;
	Node tail;
	
	public DoublyLinkedList() {
		this.head = head;
		this.tail = tail;
	}
	
	
	public void insertAtEnd(int value) {
		Node node = new Node(value);
		
		if(head == null) {
			head = node;
			tail = node;
		} else {
			tail.next=node;
			node.previous = tail;
			tail = node;
		}
	}
	
	public void insertAtStart(int value) {
		Node node = new Node(value);
		
		if(head == null) {
			head = node;
			tail = node;
		} else {
			head.previous=node;
			node.next = head;
			head = node;
		}
	}
	
	public void insertAtIndex(int index, int value) {
		Node node = new Node(value);
		int i = 0;
		Node current = head;
		while(current != null) {
			if(i == index) {
				node.previous = current.previous;
				node.next = current;
				current.previous.next = node;
				current.previous = node;
				
			} else {
				current = current.next;
			}
			i++;
		}
	}
	
	public static void print(DoublyLinkedList list) {
		Node current = list.head;
		while(current != null) {
			System.out.print(current.value + " ");
			current = current.next;
		}
	}
	
	 @Override
	 public String toString() {
	    StringBuilder sb = new StringBuilder();
	    Node current = head;
	        
	    while (current != null) {
	       sb.append(current).append(" ");
	       current = current.next;
	    }
	        
	       return sb.toString();
	    }
	
	 public static void main(String[] args) {
		 DoublyLinkedList list = new DoublyLinkedList();
			list.insertAtEnd(12);
			list.insertAtEnd(2);
			list.insertAtEnd(20);
			list.insertAtEnd(25);
			list.insertAtEnd(22);
			list.insertAtEnd(29);
			list.insertAtEnd(23);

			
			print(list);
			
			list.insertAtIndex(3, 90);
			System.out.println();
			System.out.println("after adding at specific index");
			print(list);
			
		
		}
	

}