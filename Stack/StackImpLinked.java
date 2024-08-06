package Stack;

import java.util.Scanner;


// Node class for the linked list
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack implementation using a linked list
public class StackImpLinked {
    Node head;

    StackImpLinked() {
        this.head = null;
    }

    // Push method
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Pop method
    public void pop()  {
       
        head = head.next;
    }

    // Peek method
    public void peek()  {
        
            System.out.println("Top element: " + head.data);
        
    }

    // Display method
    public void display()  {
   
            Node temp = head;
            System.out.println("Stack elements (top to bottom):");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            
        }
    }

    // Search method
    public void search(int data) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == data) {
                    System.out.println("Element found");
                    return; // Exit after finding the element
                }
                temp = temp.next;
            }
            System.out.println("Element not found");
        }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackImpLinked s = new StackImpLinked();

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Peek");
            System.out.println("4: Search Element");
            System.out.println("5: Display");
            System.out.println("6: Exit");

            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter value to push: ");
                        int value = sc.nextInt();
                        s.push(value);
                        System.out.println(value + " pushed to stack");
                        break;

                    case 2:
                    	 if (s.head == null) {
                             throw new StackEmptyException("Stack is empty to pop");
                         }
                        s.pop();
                        System.out.println("Element popped from stack");
                        break;

                    case 3:
                    	 if (s.head == null) {
                             throw new StackEmptyException("Stack is empty to peek");
                         }
                        s.peek();
                        break;

                    case 4:
                    	 if (s.head == null) {
                             throw new StackEmptyException("Stack is empty to search");
                         }
                        System.out.print("Enter element to search: ");
                        int searchValue = sc.nextInt();
                        s.search(searchValue);
                        break;

                    case 5:
                    	if (s.head == null) {
                            throw new StackEmptyException("Stack is empty to display");
                        }
                        s.display();
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        sc.close();
                        return; // Exit the loop and end the program

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                        break;
                }
            } catch (StackEmptyException e) {
                System.out.println(e);
            }
        }
    }
}
