package Pertemuan2;

public class addHead {
	Node HEAD;
	public void addHead (int data) {
		Node newNode = new Node(data);
		if (HEAD == null){
			HEAD = newNode;
		}
		else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}

}
