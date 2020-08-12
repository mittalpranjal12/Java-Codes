package stacksAndQueues;

import java.util.Scanner;

public class QueueUsing_LL {

	public static class Node<T> {
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	class QueueEmptyException extends Exception{
		
	}
	
	class QueueFullException extends Exception{
		
	}	
	
	public class Queue<T> {

		private Node<T> front;
		private Node<T> rear;
		int size;
		
		public Queue()
		{
			front = null;
			rear = null;
			size = 0;
		}

		public void enqueue(T data) 
		{
			Node<T> temp = new Node<T>(data);
			
			if(rear == null)
			{
				front = temp;
				rear = temp;
			}else {

				rear.next = temp;
				rear = temp;
			}
			size++;
		}

		public int size()
		{
			return size;
		}

		public boolean isEmpty() 
		{
			return size == 0;
		}

		public T dequeue() throws QueueEmptyException {
			if(size == 0)
				throw new QueueEmptyException();
			
			T temp = front.data;
			front = front.next;
			
			if(size == 1)
			{
				rear = null;
			}
			size--;
			return temp;
		}

		public T front() throws QueueEmptyException {
			if(size == 0)
				throw new QueueEmptyException();
			
			return front.data;
		}
	}

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);

			Queue<Integer> st = new Queue<Integer>();

			int choice = s.nextInt();
			int input;

			while (choice !=-1) {
				if(choice == 1) {
					input = s.nextInt();
					st.enqueue(input);
				}
				else if(choice == 2) {
					try {
						System.out.println(st.dequeue());
					} catch (QueueEmptyException e) {
						System.out.println(-1);
					}
				}
				else if(choice == 3) {
					try {
						System.out.println(st.front());
					} catch (QueueEmptyException e) {
						System.out.println(-1);
					}
				}
				else if(choice == 4) {
					System.out.println(st.size());
				}
				else if(choice == 5) {
					System.out.println(st.isEmpty());
				}
				choice = s.nextInt();
			}
		}
	}