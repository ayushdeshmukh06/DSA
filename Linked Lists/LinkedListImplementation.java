import java.util.*;


class Node {
	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class LinkedListImplementation {
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);

		while(head != null){
			System.out.print(head.data + " -> ");
			head = head.next;
		}

		// Another way using inbuilt collection class
		// Methods :- add(element); addFirst(element); addLast(element); removeFirst(); removelast(); add(<index>, element); remove(index);
		// 			  remove(object) i.e. myList.remove(String.valueOf("BMW")); removeAll();  
		
		LinkedList<String> myList = new LinkedList<String>();

		myList.add("BMW");
		myList.add("Mercedes");
		myList.add("Volkswagen");
		myList.add("Toyota");
		myList.add("Tata");

		System.out.println();
		System.out.println(myList);
	}
}