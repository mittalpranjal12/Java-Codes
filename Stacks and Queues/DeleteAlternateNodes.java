package stacksAndQueues;

import java.util.Scanner;

public class DeleteAlternateNodes {

	public static class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;

		public LinkedListNode(T data) {
			this.setData(data);
			this.next = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

	}
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		LinkedListNode<Integer> list = input();
		deleteAlternateNodes(list);
		print(list);
	}
	
	public static void deleteAlternateNodes(LinkedListNode<Integer> head)
	{
//		if(head == null)
//			return;
//		LinkedListNode<Integer> temp = head;
//		
//		int count = 0;
//		
//		if(count % 2 == 0)
//		{
//			temp = temp.next;
//			count++;
//			//continue;
//		}
//		else if(count % 2 != 0)
//		{
//			temp = temp.next;
//			head.next = temp;
//			count++;
//		}
		
		if(head != null)
		{
			LinkedListNode<Integer> prev = head;
			LinkedListNode<Integer> now = head.next;
			
			while(prev != null && now != null)
			{
				prev.next = now.next;
				now = null;
				prev = prev.next;
				if(prev != null)
				{
					now = prev.next;
				}
			}
		}
	}

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
	}

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();

		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
}