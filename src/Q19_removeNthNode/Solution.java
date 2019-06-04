package Q19_removeNthNode;


public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode listNode1=new ListNode(1);
		ListNode listNode2=new ListNode(2);
//		ListNode listNode3=new ListNode(3);
//		ListNode listNode4=new ListNode(4);
//		ListNode listNode5=new ListNode(5);
		listNode1.next = listNode2;
		listNode2.next = null;
//		listNode3.next = listNode4;
//		listNode4.next = listNode5;
//		listNode5.next = null;
		int n=2;
		ListNode node = solution.removeNthFromEnd(listNode1, n);
		while(node != null){
			System.out.println(node.val);
			node = node.next;
			
		}
		
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
		//ListNode node = new ListNode(head.val);
		if(head == null || head.next == null)
			return null;
		ListNode node = head;
		ListNode nodeHead = new ListNode(0);
		nodeHead.next = node;
        for(int i=0;i<n-1;i++){
        	if(head.next != null)
        		head = head.next;
        	else
        		return null;
        }
        if(head.next == null)
        	return node.next;
        while(head != null && head.next != null && head.next.next != null){
            head = head.next;
            node = node.next;
        }
        if(node.next.next != null)
        	node.next = node.next.next;
        else
        	node.next = null;
        return nodeHead.next;
	}
	
}
