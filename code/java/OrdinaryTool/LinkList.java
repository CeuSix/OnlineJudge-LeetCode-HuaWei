package OrdinaryTool;

import java.awt.HeadlessException;
import java.util.LinkedList;

import OrdinaryStructure.ListNode;

public class LinkList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(4);
		ListNode n2 = new ListNode(19);
		ListNode n3 = new ListNode(14);
 
		ListNode n4 = new ListNode(5);
		ListNode n5 = new ListNode(-3);
		ListNode n6 = new ListNode(1);
		
		ListNode n7 = new ListNode(8);
		ListNode n8 = new ListNode(5);
 
		ListNode n9 = new ListNode(11);
		ListNode n10 = new ListNode(12);
 
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n1 = insertionSortList(n1);
		printList(n1);
	}
	public static ListNode insertionSortList(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode resultLn= new ListNode(head.val);
		//异常处理
		
		ListNode point = head.next;
		
		//插入排序主体
		while(point != null){
			ListNode temp_result= resultLn;
    		ListNode temp_preresult=resultLn;
    		ListNode swap_point;
    		ListNode head_nextpoint= point.next;
			if(point.val < resultLn.val)
			{
			    swap_point=resultLn;
			    resultLn=point;
			    resultLn.next=swap_point;
			}
			else{
			    while(temp_result != null){
			    	//System.out.println(point.val);
    				if(temp_result.val > point.val){
    					swap_point =temp_result;
    					temp_preresult.next=point;
    					point.next=swap_point;
    					break;
    				}
    				if(temp_result.val <= point.val && temp_result.next == null)
    				{
    					temp_result.next=point;
    					point.next=null;
    					break;
    				}
    				temp_preresult=temp_result;
    				temp_result = temp_result.next;
    			}
    			
    		}
    		point = head_nextpoint;
		}
		
		return resultLn;
	}
	public static void printList(ListNode ln){
		while(ln!= null){
			System.out.print(ln.val + ", ");
			ln=ln.next;
		}
	}

}
