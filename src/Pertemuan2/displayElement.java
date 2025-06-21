package Pertemuan2;

public class displayElement {
	Node HEAD;
	public void displayElement() {
		Node curNode = HEAD;
		while (curNode != null) {
			System.out.println(curNode.getData()+ " ");
			curNode = curNode.getNext();
		}
	}

}
