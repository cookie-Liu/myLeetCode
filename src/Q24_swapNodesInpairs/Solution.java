package Q24_swapNodesInpairs;


public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode listNode1=new ListNode(1);
		ListNode listNode2=new ListNode(2);
		ListNode listNode3=new ListNode(3);
		ListNode listNode4=new ListNode(4);
		ListNode listNode5=new ListNode(5);
		ListNode listNode6=new ListNode(6);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		listNode5.next = listNode6;
		listNode6.next = null;
		ListNode node = solution.swapPairs(listNode1);
		while(node != null){
			System.out.println(node.val);
			node = node.next;
			
		}
	}

	public ListNode swapPairs(ListNode head) {
		ListNode node = new ListNode(-1);
		node.next = head;
		ListNode pre = node;
		while (pre.next != null && pre.next.next != null) {
			ListNode l1 = pre.next, l2 = pre.next.next;
			ListNode next = l2.next;
			l1.next = next;
			l2.next = l1;
			pre.next = l2;

			pre = l1;
		}
		return node.next;
	}
}
