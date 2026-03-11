class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class MiddleElement {
	public static int getMiddleElement(Node head){
		Node slow = head;
		Node fast = head;

		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.data;
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);

		int result = getMiddleElement(head);
		System.out.println(result);
	}
}