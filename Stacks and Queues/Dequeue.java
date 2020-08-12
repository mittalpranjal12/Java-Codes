package stacksAndQueues;

import java.util.Scanner;

public class Dequeue {

	public class Dequeue1
	{
		int arr[];
		int front;
		int rear;
		int size;
		
		public Dequeue1(int size)
		{
			front = -1;
			rear = 0;
			this.size = size;
			arr = new int[size];
		}
		
		Dequeue1()
		{
			front = -1;
			rear = 0;
			this.size = 10;
			arr = new int[size];
		}
		
		boolean isFull()
		{
			return (front == (rear+1)%size);
		}
		
		boolean isEmpty()
		{
			return front == 1;
		}
		
		void insertFront(int data)
		{
			if(isFull())
				//System.out.println(-1);
				return;
			
			if(front == -1)
			{
				front = 0;
				rear = 0;
			}
			else
			{
				front = ((front-1)% size + size)% size;
			}
			arr[front] = data;
		}
		
		void insertRear(int data)
		{
			if(isFull())
			{
				System.out.println(-1);
				return;
			}
			
			if(front == -1)
			{
				front = 0;
				rear = 0;
			}
			else
			{
				rear = (rear+1) % size;
			}
			arr[rear] = data;
		}
		
		void deleteFront()
		{
			if(isEmpty())
			{
				System.out.println(-1);
				return;
			}
			
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}
			else
			{
				front = (front+1) % size;
			}
		}
		
		void deleteRear()
		{
			if(isEmpty())
			{
				System.out.println(-1);
				return;
			}
			
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}
			else
			{
				rear = ((rear-1)% size + size) % size;
			}
		}

		int getFront()
		{
			if(isEmpty())
				return -1;
			return arr[front];
		}
		
		int getRear()
		{
			if(isEmpty() || rear < 0)
			{
				return -1;
			}
			return arr[rear];
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Dequeue1 dq = new Dequeue1(10);

		while(true){
			int choice = s.nextInt(),input;
			switch (choice) {
			case 1:
				input = s.nextInt();
				dq.insertFront(input);
				break;
			case 2:
				input = s.nextInt();
				dq.insertRear(input);
				break;
			case 3:
				dq.deleteFront();
				break;
			case 4:
				dq.deleteRear();
				break;
			case 5:
				System.out.println(dq.getFront());
				break;
			case 6:
				System.out.println(dq.getRear());
				break;
			default:
				return ;
			}  
		}
	}
}
