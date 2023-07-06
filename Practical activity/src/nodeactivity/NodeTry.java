package nodeactivity;

public class NodeTry {
	static class Node {
		int data;
		Node next;
	}
	
	static void printList(Node n) {
		System.out.print("LinkList: ");
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	
	static void printListDel (Node n) {
		if (n != null) {
			Node deleteNode = n;
			n = n.next;
		}
		System.out.print("Delete start: ");
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		Node head = null;
		Node one = null;
		Node two = null;
		
		head = new Node();
		one = new Node();
		two = new Node();
		
		head.data = 1;
		head.next = one;
		
		one.data = 2;
		one.next = two;
		
		two.data = 3;
		two.next = null;
		
		printList(head);
		printListDel(head);
	}
}
