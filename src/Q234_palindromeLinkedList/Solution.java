package Q234_palindromeLinkedList;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode listNode1=new ListNode(1);
		ListNode listNode2=new ListNode(2);
		ListNode listNode3=new ListNode(1);
		ListNode listNode4=new ListNode(1);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = null;
		
		boolean flag = solution.isPalindrome(listNode1);
		System.out.println(flag);
	}

	public boolean isPalindrome(ListNode head) {
		ListNode newHead = new ListNode(0);
		ListNode preNode = newHead;
		ListNode node = head;
		while(node != null){
			preNode.next = new ListNode(node.val);
			preNode = preNode.next;
			node = node.next;
		}
		ListNode rnode = reverse(newHead);
		while(head != null){
			if(head.val == rnode.val){
				head = head.next;
				rnode = rnode.next;
			}else{
				return false;
			}				
		}
		return true;
	}
	
	public ListNode reverse(ListNode node){
		ListNode curr = node;
		ListNode preNode = null;
		while(curr != null){
			ListNode tmp = curr.next;
			curr.next = preNode;
			preNode = curr;
			curr = tmp;
		}
		return preNode;
	}
}
