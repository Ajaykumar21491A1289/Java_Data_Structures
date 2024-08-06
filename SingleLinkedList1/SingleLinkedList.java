package SingleLinkedList1;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList {
    private Node head;

    public SingleLinkedList() {
        this.head = null;
    }
    
    
    
    
    
    
    

    // INSERTION AT BEGINNING
    public void insertAtBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    
    
    
    
    
    
    // INSERTION AT END
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    
    
    
    
    
    
    

    // INSERTION AT SPECIFIC POSITION
    public void insertAtPos(int data, int pos)  {
        if (pos < 0) return;
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int i = 1;
        while (i < pos-1 && temp != null) {
            temp = temp.next;
            i++;
        }
        if (temp == null) return; // Position out of bounds
        newNode.next = temp.next;
        temp.next = newNode;
    }

    
    
    
    
    
    
    
    // DELETION
    public void deleteAtBeg() {
        if (head != null) {
            head = head.next;
        }
    }
    
    
    
    
    

    // DELETION AT END
    public void deleteAtEnd() {
        if (head == null) return;//when there is no element
        if (head.next == null) { // when there is one element
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    
    
    
    
    
    
    

    // DELETION AT SPECIFIC POSITION
    public void deleteAtPosition(int pos) {
        if (head == null || pos < 0) return;  //when there is no element
        if (pos == 0) {    //delete from begining
            head = head.next;
            return;
        }
        Node temp = head;
        int i = 1;
        while (i < pos-1 && temp.next != null) {
            temp = temp.next;
            i++;
        }
        if (temp.next == null) return; // Position out of bounds
        temp.next = temp.next.next;
    }

    
    
    
    
    
    
    
    // TRAVERSAL
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    
    
    
    
    
    
    
    // SEARCHING
    public boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    
    
    
    
    
    // REVERSING THE LIST
    public void reverse() {
        Node previousnode = null;
        Node currentnode = head;
        Node nextnode = head;
        while (nextnode != null) {
            nextnode = nextnode.next;
            currentnode.next = previousnode;
            previousnode = currentnode;
            currentnode = nextnode;
        }
        head = previousnode;
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
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
                    list.insertAtPos(ele, pos);
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
