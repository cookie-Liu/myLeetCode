package Q328_oddEven;


public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode listNode1=new ListNode(1);
		ListNode listNode2=new ListNode(2);
		ListNode listNode3=new ListNode(3);
		ListNode listNode4=new ListNode(4);
		ListNode listNode5=new ListNode(5);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		listNode5.next = null;
		ListNode node = solution.oddEvenList(listNode1);
		while(node != null){
			System.out.println(node.val);
			node = node.next;
			
		}
	}

	public ListNode oddEvenList(ListNode head) {
		if(head == null)
			return null;
		ListNode odd = head;
		ListNode oddt = head;
		ListNode even = head.next;
		ListNode event = head.next;
		while(oddt.next != null && event.next != null){
			oddt.next = event.next;
			oddt = oddt.next;
			event.next = oddt.next;
			event = event.next;
		}
		oddt.next = even;
		return odd;
	}
}
