package Pertemuan2;

public class Node {
	private int data;
	private Node next;
	
	/** Inisialisasi atribut Node */
	
	public Node(int data) {
		this.setData(data);
	}
	
	/** setter & getter */

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
