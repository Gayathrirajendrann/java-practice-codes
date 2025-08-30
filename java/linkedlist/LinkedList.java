class Node {
	int data;
	Node next;

	public Node() {
	}

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node(data);
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node(data);
		node.data = data;
		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data) {
		Node node = new Node(data);
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
	}

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.insert(10);
		list.insert(20);
		list.insert(30);
		System.out.println("After inserting elements:");
		list.show();

		list.insertAtStart(5);
		System.out.println("\nAfter inserting at the start:");
		list.show();

		list.insertAt(2, 15);
		System.out.println("\nAfter inserting at index 2:");
		list.show();

		list.deleteAt(3);
		System.out.println("\nAfter deleting element at index 3:");
		list.show();
	}
}