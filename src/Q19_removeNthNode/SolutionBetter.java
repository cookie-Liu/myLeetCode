package Q19_removeNthNode;

public class SolutionBetter {
	public static void main(String[] args) {
		SolutionBetter solutionb = new SolutionBetter();
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
		ListNode node = solutionb.removeNthFromEnd(listNode1, n);
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
        for(int i=0;i<n;i++){
        	if(head != null)
        		head = head.next;
        	else
        		return null;
        }
        while(head.next != null){
            head = head.next;
            node = node.next;
        }
        node.next = node.next.next;
        return nodeHead.next;
	}
}
