package Stack;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListStack {

    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an operation:");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Peek");
            System.out.println("4: Check if Empty");
            System.out.println("5: Get Size");
            System.out.println("6: Display Stack");
            System.out.println("7: Exit");

            int choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter value to push: ");
                        int value = scanner.nextInt();
                        ls.push(value);
                        System.out.println(value + " pushed to stack");
                        break;

                    case 2:
                        if (ls.isEmpty()) {
                            throw new StackEmptyException("Stack is empty. Cannot pop.");
                        }
                        System.out.println("Popped: " + ls.pop());
                        break;

                    case 3:
                        if (ls.isEmpty()) {
                            throw new StackEmptyException("Stack is empty. Cannot peek.");
                        }
                        System.out.println("Top element: " + ls.peek());
                        break;

                    case 4:
                        System.out.println("Is stack empty? " + ls.isEmpty());
                        break;

                    case 5:
                        System.out.println("Size of stack: " + ls.size());
                        break;

                    case 6:
                        display(ls);
                        break;

                    case 7:
                        System.out.println("Exiting...");
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                        break;
                }
            } catch (StackEmptyException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    // Method to display elements of the stack
    public static void display(LinkedList<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements (top to bottom):");
        for (Integer item : stack) {
            System.out.println(item);
        }
    }
}
