package LinkedList;

public class ReverseLinkedList {
	
	private linkedList list;
	
	public ReverseLinkedList() {
		this.list=list;
	}
	
	public linkedList reverseList(linkedList list) {
		Node current = list.start;
		Node previous = null;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		list.start = previous;
		return list;
	}

}
