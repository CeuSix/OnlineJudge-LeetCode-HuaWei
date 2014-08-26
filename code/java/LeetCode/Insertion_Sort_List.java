package LeetCode;

import OrdinaryStructure.ListNode;

public class Insertion_Sort_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode ls;
		ListNode head = new ListNode(5);
		head.next=new ListNode(4);
		head.next.next=new ListNode(3);
		ls=insertionSortList(head);
		while (ls.next!=null) {
			System.out.println(ls.val);
		}
	}
	public static ListNode insertionSortList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode newHead = new ListNode(head.val);
		ListNode pointer = head.next;
		// loop through each element in the list
		while (pointer != null) {
			// insert this element to the new list
 
			ListNode innerPointer = newHead;
			ListNode next = pointer.next;
			
			//头指针的情况
			if (pointer.val <= newHead.val) {
				ListNode oldHead = newHead;
				newHead = pointer;
				newHead.next = oldHead;
			} 
			else {
				while (innerPointer.next != null) {
 
					if (pointer.val > innerPointer.val && pointer.val <= innerPointer.next.val) {
						ListNode oldNext = innerPointer.next;
						innerPointer.next = pointer;
						pointer.next = oldNext;
					}
 
					innerPointer = innerPointer.next;
				}
 
				if (innerPointer.next == null && pointer.val > innerPointer.val) {
					innerPointer.next = pointer;
					pointer.next = null;
				}
			}
 
			// finally
			pointer = next;
		}
 
		return newHead;
    }

}
