package Q234_palindromeLinkedList;

public class Solution2 {
	public static void main(String[] args) {
		Solution2 solution2 = new Solution2();
		ListNode listNode1=new ListNode(1);
		ListNode listNode2=new ListNode(2);
		ListNode listNode3=new ListNode(1);
		ListNode listNode4=new ListNode(1);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = null;
		
		boolean flag = solution2.isPalindrome(listNode1);
		System.out.println(flag);
	}

	private boolean isPalindrome(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		slow = reverse(slow.next);
		while(slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
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
