package Pertemuan6;

import org.w3c.dom.Node;

public class strukturList {
    private node HEAD;

    public boolean isEmpty(){
        return HEAD == null;
    }

    public void addTail(int data){
        node posNode = null, currNode = null;
        
        node newNode = new node(data);
        if (isEmpty()){
            HEAD = newNode;
        }

        else{
            currNode = HEAD;
            while (currNode != null){
                posNode = currNode;
                currNode = currNode.getNext();
            }
            posNode.setNext(newNode);
        }
        
    }

    public void displayElement(){
        node curNode = HEAD;
        while(curNode != null){
            System.out.printf(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }

    public void addHead(int data){
        node newNode = new node(data);
        
        if (isEmpty()){
            HEAD = newNode;
        }
        else{
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    public void addMid(int data, int position) {
        node newNode = new node(data);
        node curNode = HEAD;
        node posNode = null;
        int i = 1;

        if (HEAD == null) {
            HEAD = newNode;
            return;
        }
        else{
            curNode = HEAD;
            if (position == 1) {
                newNode.setNext(HEAD);
                HEAD = newNode;
                return;
            }
        }

        while ( curNode != null && i < position - 1) {
            posNode = curNode;
            curNode = curNode.getNext();
            i++;
        }

        newNode.setNext(curNode.getNext());
        curNode.setNext(newNode);
    }

    public void dispose(node temp) {
        temp = null;
    }

   public void removeHead() {
    if (isEmpty()) {
        System.out.println("List kosong");
    }
    else {
        node temp = HEAD;
        HEAD = HEAD.getNext();
        dispose(temp);
        } 
    }

    public void removeTail() {
        if (HEAD != null) {
            
            if (HEAD.getNext() == null) {
                node temp = HEAD;
                HEAD = null;
                dispose(temp);
            } else {
                node preNode = null;
                node lastNode = HEAD;
    
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }

                preNode.setNext(null);
                dispose(lastNode);
            }
        }
    }

    public void removeMid(int e) {
        node preNode = new node(0);
        node tempNode;
        int i;
        boolean ketemu;
    
        if (isEmpty()) {
            System.out.println("Elemen list kosong");
        } else {
            ketemu = false;
            i = 1;
            tempNode = HEAD;
            while (tempNode.getNext() != null && !ketemu) {
                if (tempNode.getNilai() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }
    
            if (ketemu == true) {
                if (i == 1)
                    HEAD = null;
                else {
                    preNode.setNext(tempNode.getNext());
                    dispose(tempNode);
                }
            }
        }
    }
    
    
    

}