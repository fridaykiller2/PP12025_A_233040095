package Pertemuan2;

public class StrukturList {
	Node HEAD;
	public void addTail(int data) 
	{
		Node posNode=null, curNode=null;
		
		Node newNode = new Node(data);
		if (HEAD == null)
		{
			HEAD = newNode;
		}
		else
		{
			curNode = HEAD;
			while (curNode != null)
			{
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext(newNode);
		}
	}
	public void display() {
		
		
	}
	
}
