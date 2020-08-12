package stacksAndQueues;

import java.util.Scanner;

public class NextNumber {


	public static class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public LinkedListNode(T data) {
			this.data = data;
		}
	}
	static Scanner s = new Scanner(System.in);

	public static LinkedListNode<Integer> takeInput() {
		LinkedListNode<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}


	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head)
	{
		LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> last = null;
		
		while(curr.next != null)
		{
			if(curr.data != 9)    //2-3-4-5
			{
				last = curr;
			}
			curr = curr.next;
		}
		
		//last = new LinkedListNode<Integer>(1);
		//last.next = head;
		
//		while(head != null)
//		{
//			head.data = 0;
//			head = head.next;
//		}
//		head = last;
//		
//		last.data++;
//		last = last.next;
		
		while(last != null)
		{
			last.data = 0;
			last = last.next;
		}
		if(curr.data != 9)
		{
			curr.data++;
			return head;
		}
		
		if(last == null)   //9-9-9-9....
		{
			last = new LinkedListNode<Integer>(0);
			 last.data = 0;
			 last.next = head;
			 head = last;
		}
		
		last.data++;
		last = last.next;
		
		while(last != null)
		{
			last.data = 0;
			last = last.next;
		}
		return head;
	}

	public static void print(LinkedListNode<Integer> head){
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		LinkedListNode<Integer> head = takeInput();
		head = nextLargeNumber(head);
		print(head);

	}

}