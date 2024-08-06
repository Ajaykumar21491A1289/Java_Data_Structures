package Stack;

import java.util.Stack;
import java.util.Scanner;

public class StackBuiltin {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an operation:");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Peek");
            System.out.println("4: Check if Empty");
            System.out.println("5: Get Size");
            System.out.println("6: Search Element");
            System.out.println("7: Exit");
            
            int choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter value to push: ");
                        int value = scanner.nextInt();
                        s.push(value);
                        System.out.println(value + " pushed to stack");
                        break;
                        
                    case 2:
                        if (s.isEmpty()) {
                            throw new StackEmptyException("Stack is empty. Cannot pop.");
                        }
                        System.out.println("Popped: " + s.pop());
                        break;
                        
                    case 3:
                        if (s.isEmpty()) {
                            throw new StackEmptyException("Stack is empty. Cannot peek.");
                        }
                        System.out.println("Top element: " + s.peek());
                        break;
                        
                    case 4:
                        System.out.println("Is stack empty? " + s.isEmpty());
                        break;
                        
                    case 5:
                        System.out.println("Size of stack: " + s.size());
                        break;
                        
                    case 6:
                        System.out.print("Enter element to search: ");
                        int searchValue = scanner.nextInt();
                        int position = s.search(searchValue);
                        if (position == -1) {
                            System.out.println(searchValue + " not found in stack.");
                        } else {
                            System.out.println(searchValue + " found at position: " + position);
                        }
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
}
