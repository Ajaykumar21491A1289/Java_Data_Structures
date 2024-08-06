package Stack;
import java.util.Deque;
import java.util.Scanner;
import java.util.ArrayDeque;
public class ArrayDeque1 {

	public static void main(String[] args) {
		Deque<Integer> d = new ArrayDeque<Integer>();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Choosea an Operation");
			System.out.println("1: push");
			System.out.println("2: pop");
			System.out.println("3: peek");
			System.out.println("4: check if Empty");
			System.out.println("5: Get Size");
			System.out.println("6: Exit");
			
			int ch = sc.nextInt();
			try {
				switch(ch) {
				case 1:
					System.out.println("Enter the element you want to enter");
					int value = sc.nextInt();
					d.push(value);
					System.out.println(value+ " pushed to stack");
					break;
				case 2:
					if(d.isEmpty()) {
						throw new StackEmptyException("Stack is empty. cannot pop");
					}
					System.out.println("popped "+d.pop());
					break;
				case 3:
					 if (d.isEmpty()) {
                         throw new StackEmptyException("Stack is empty. Cannot peek.");
                     }
                     System.out.println("Top element: " + d.peek());
                     break;
				case 4:
                    System.out.println("Is stack empty? " + d.isEmpty());
                    break;
                    
                case 5:
                    System.out.println("Size of stack: " + d.size());
                    break;
      
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                    break;  
				}
			}
				catch(StackEmptyException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}


