package Q445_addTwoNumbers;

import java.util.Stack;


public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode listNode1=new ListNode(7);
		ListNode listNode2=new ListNode(2);
		ListNode listNode3=new ListNode(4);
		ListNode listNode4=new ListNode(3);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = null;
		
		ListNode node1 =new ListNode(5);
		ListNode node2 =new ListNode(6);
		ListNode node3 =new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = null;
		
		ListNode head = solution.addTwoNumbers(listNode1, node1);
		while(head != null){
			System.out.println(head.val);
			head = head.next;
			
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null)
			return null;
		if((l1 == null && l2 != null) || l1.val == 0)
			return l2;
		if((l2 == null && l1 != null) || l2.val == 0)
			return l1;
		ListNode preNode = new ListNode(0);
		ListNode node = preNode;
		
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		while(l1 != null && l2 != null){
			stack1.push(l1.val);
			stack2.push(l2.val);
			l1 = l1.next;
			l2 = l2.next;
		}
		if(l1 != null){
			while(l1 != null){
				stack1.push(l1.val);
				l1 = l1.next;
			}
		}
		else if(l2 != null){
			while(l2 != null){
				stack2.push(l2.val);
				l2 = l2.next;
			}			
		}
		int add = 0;
		while(!stack1.isEmpty() || !stack2.isEmpty() || add != 0){
			int val1 = stack1.isEmpty()? 0:stack1.pop();
			int val2 = stack2.isEmpty()? 0:stack2.pop();
			int val = add + val1 + val2;
			if(val < 10){
				add = 0;
			}			
			if(val >= 10){
				val = val - 10;
				add = 1;
			}
			ListNode newNode = new ListNode(val);
			node.next = newNode;
			node = newNode;						
		}
		ListNode tail = preNode.next;
		ListNode lastNode = null;
		while(tail != null){
			ListNode tmp = tail.next;
			tail.next = lastNode;
			lastNode = tail;
			tail = tmp;
		}
		return lastNode;
	}
}
