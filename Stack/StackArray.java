package Stack;

import java.util.Scanner;

public class StackArray {
    int[] stack;
    int top;
    int capacity;

    // Constructor to initialize stack
    StackArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // Push method
    public void push(int data)  {
        
            stack[++top] = data;
       
    }

    // Pop method
    public int pop() {
        
            return stack[top--];
        
    }

    // Peek method
    public int peek()  {
       
            return stack[top];
        
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Display method
    public void display() {
        System.out.println("Stack elements (top to bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    // Get size of the stack
    public int size() {
        return top + 1;
    }

    // Search method
    public boolean search(int data) {
        for (int i = 0; i <= top; i++) {
            if (stack[i] == data) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        int size = sc.nextInt();
        StackArray sa = new StackArray(size);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Peek");
            System.out.println("4: Check if Empty");
            System.out.println("5: Get Size");
            System.out.println("6: Search Element");
            System.out.println("7: Display");
            System.out.println("8: Exit");

            int ch = sc.nextInt();
            try {
                switch (ch) {
                    case 1:
                    	 if (sa.top == sa.capacity - 1) {
                             throw new StackEmptyException("Stack is full to push");
                         }
                        System.out.print("Enter the data: ");
                        int value = sc.nextInt();
                        sa.push(value);
                        System.out.println(value + " pushed to stack");
                        break;

                    case 2:
                    	if (sa.top == -1) {
                            throw new StackEmptyException("Stack is Empty to Pop");
                        }
                        System.out.println("Popped: " + sa.pop());
                        break;

                    case 3:
                    	if (sa.top ==  - 1) {
                            throw new StackEmptyException("Stack is Empty to peek");
                        }
                        System.out.println("Peeked element is: " + sa.peek());
                        break;

                    case 4:
                        System.out.println("Is stack empty? " + sa.isEmpty());
                        break;

                    case 5:
                        System.out.println("Size of the stack: " + sa.size());
                        break;

                    case 6:
                    	if (sa.top == - 1) {
                            throw new StackEmptyException("Stack is Empty to search");
                        }
                        System.out.print("Enter the element you want to search: ");
                        int ele = sc.nextInt();
                        System.out.println("Element found: " + sa.search(ele));
                        break;

                    case 7:if (sa.top ==  - 1) {
                        throw new StackEmptyException("Stack is Empty to Display");
                    }
                        sa.display();
                        break;

                    case 8:
                        System.out.println("Exiting...");
                        sc.close();
                        return; // Exit the loop and end the program

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 8.");
                        break;
                }
            } catch (StackEmptyException | StackOverflowError e) {
                System.out.println(e);
            }
        }
    }
}



