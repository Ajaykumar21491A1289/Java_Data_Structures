package Queue;
import java.util.Scanner;
public class CircularQueueUsingArray {
public static final int n=5;
public static int[] queue = new int[n];
public static int front=-1,rear =-1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("The Following are queue operations");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enetr the data you want to insert");
				int data = sc.nextInt();
				enqueue(data);
				break;
			
			case 2:
				dequeue();
				break;
			case 3:
				peek();
				break;
			case 4:
				display();
				break;
			case 5:
				System.out.println("Exiting");
				sc.close();
				break;
			default:
				System.out.println("Invalid Input");
		}
		}

	}
public static void enqueue(int x) {
	if((rear+1)%n == front)
		System.out.println("OVERFLOW");
	else if(front ==-1 && rear == -1)
	{
		front=rear=0;
	    queue[rear]=x;
	}
   else {
	   rear=(rear+1)%n;
	   queue[rear]=x;
   }
	
}
public static void dequeue() {
	if(front == -1 && rear == -1) 
		System.out.println("Queue is empty");
	
	else if(front==rear) 
		front = rear =-1;
	else
		front=(front+1)%n;
}
public static void peek() {
	if(front == -1 && rear ==-1)
		System.out.println("Queue is empty");

else 
	System.out.println(queue[front]);
	

}
public static void display() {
	int temp=front;
	if(front == -1 && rear == -1)
		System.out.println("queue is empty");
	else {
		while(temp!=rear){
			System.out.println(queue[temp]);
			temp = (temp+1)%n;
		}
		System.out.println(queue[rear]);
	}
}

}
