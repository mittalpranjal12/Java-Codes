package stacksAndQueues;

import java.util.Scanner;

public class NextNum2 {

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
		
		public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head)
		{
			LinkedListNode<Integer> curr = head;
			LinkedListNode<Integer> prev = null;
			LinkedListNode<Integer> temp;
			
			while(curr != null)
			{
				temp = curr.next;
				curr.next = prev;
				prev = curr;
				curr = temp;
			}
			return prev;
		}
		
		public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head)
		{
			head = reverse_I(head);
			int carry = 1,num;
			
			LinkedListNode<Integer> ptr = head,prev = null;
			
			while(ptr != null)
			{
				num = ((ptr.data) + carry)%10;
				
				carry = ((ptr.data)+carry)/10;
				
				ptr.data = num;
				prev = ptr;
				ptr= ptr.next;
			}
			if(carry == 1)
			{
				LinkedListNode<Integer> tail = new LinkedListNode<Integer>(carry);
				
				prev.next = tail;
			}
			return reverse_I(head);
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
