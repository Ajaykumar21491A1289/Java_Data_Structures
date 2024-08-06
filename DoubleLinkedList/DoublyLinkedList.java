package DoubleLinkedList;
import java.util.*;
class Node{
	int data;
	Node prev;
	Node next;
	Node(int data){
		this.data= data;
		this.prev = null;
		this.next = null;
	}
}

public class DoublyLinkedList {
private Node head;
private Node tail;
public DoublyLinkedList() {
	this.head = null;
	this.tail = null;
}


//Insertion at Begining
public void insertAtBeg(int data) {
	Node newNode = new Node(data);
	if(head == null) {
		head = tail = newNode;
	}
	else {
	head.prev = newNode;
	newNode.next = head;
	head  = newNode;
}
}


//Insertion at end

public void insertAtEnd(int data) {
	Node newNode = new Node(data);
	if(head == null) 
		head = tail= newNode;
	else {
		tail.next = newNode;
		newNode.prev  = tail;
		tail = newNode;
	}
}


//Insertion at Specific Position

public void insertAtpos(int data, int pos) {
	if(pos<0)return;
	Node newNode = new Node(data);
	if(pos == 0) {
		newNode.next =head;
		head.prev= newNode;
		head = newNode;
		return;
	}
	Node temp =head;
	int i=1;
	while(temp != null && i<pos-1) {
		temp = temp.next;	
		i++;
	
	}
	if (temp == null) {
        insertAtEnd(data);
    } else {
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode; // Update tail if inserted at the end
        }
    }
}


//Deletion from Begining

public void deleteAtBeg() {
    if (head == null) return;
    if (head.next == null) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
}


//Deletion at end

public void deleteAtEnd() {
	if(head == null)return;
	if(head.next == null) {
		head = tail = null;
		return;
	}
	else {
	tail = tail.prev;
	tail.next = null;
}
}


//Delete At Specific Position

public void deleteAtPosition(int pos) {
    if (head == null || pos < 0) return;
    if (pos == 0) {
        deleteAtBeg();
        return;
    }

    Node temp = head;
    int i = 0;
    while (temp != null && i < pos - 1) {
        temp = temp.next;
        i++;
    }

    if (temp == null || temp.next == null) return;

    Node nodeToDelete = temp.next;
    temp.next = nodeToDelete.next;
    if (nodeToDelete.next != null) {
        nodeToDelete.next.prev = temp;
    }
    if (nodeToDelete == tail) {
        tail = temp; // Update tail if deleting the last node
    }
}


//TRAVERSAL

public void printList() {
	Node temp = head;
	while(temp != null) {
		System.out.println(temp.data);
		temp = temp.next;
	}
}


//SEARCHING

public boolean search(int data) {
    Node temp = head;
    while (temp != null) {
        if (temp.data == data) return true;
        temp = temp.next;
    }
    return false;
}

//Reverse the List

public void reverse() {
	while(tail != null) {
		System.out.println(tail.data);
		tail = tail.prev;
	}
}

	public static void main(String[] args) {
		DoublyLinkedList list  = new DoublyLinkedList();
		Scanner sc = new Scanner(System.in);
		while (true) {
            System.out.println("1. INSERT AT BEGINNING");
            System.out.println("2. INSERT AT END");
            System.out.println("3. INSERT AT SPECIFIC POSITION");
            System.out.println("4. PRINT THE LIST");
            System.out.println("5. SEARCH AN ELEMENT");
            System.out.println("6. DELETE AT BEGINNING");
            System.out.println("7. DELETE AT END");
            System.out.println("8. DELETE AT SPECIFIC POSITION");
            System.out.println("9. REVERSE THE LIST");
            System.out.println("10. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter element to insert at Beginning: ");
                    int b = sc.nextInt();
                    list.insertAtBeg(b);
                    break;
                case 2:
                    System.out.print("Enter Element to insert at End: ");
                    int e = sc.nextInt();
                    list.insertAtEnd(e);
                    break;
                case 3:
                    System.out.print("Enter Element to Insert at specific Position: ");
                    int ele = sc.nextInt();
                    System.out.print("Enter The position: ");
                    int pos = sc.nextInt();
                    list.insertAtpos(ele, pos);
                    break;
                case 4:
                    System.out.println("The List is:");
                    list.printList();
                    break;
                case 5:
                    System.out.print("Enter an element to search: ");
                    int elem = sc.nextInt();
                    System.out.println("Element found: " + list.search(elem));
                    break;
                case 6:
                    list.deleteAtBeg();
                    System.out.println("Deleted at beginning.");
                    break;
                case 7:
                    list.deleteAtEnd();
                    System.out.println("Deleted at end.");
                    break;
                case 8:
                    System.out.print("Enter position to delete: ");
                    int delPos = sc.nextInt();
                    list.deleteAtPosition(delPos);
                    System.out.println("Deleted at position " + delPos);
                    break;
                case 9:
                    list.reverse();
                    System.out.println("List reversed Try to Display");
                    break;
                case 10:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Wrong Input");
            }
        }


	}

}
