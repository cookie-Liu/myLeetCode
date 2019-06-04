package Q83_RemoveDuplication;


public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode listNode1=new ListNode(1);
		ListNode listNode2=new ListNode(1);
		ListNode listNode3=new ListNode(2);
		ListNode listNode4=new ListNode(3);
		ListNode listNode5=new ListNode(3);
		ListNode listNode6=new ListNode(3);
		ListNode listNode7=new ListNode(4);
		ListNode listNode8=new ListNode(4);
		ListNode listNode9=new ListNode(4);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		listNode5.next = listNode6;
		listNode6.next = listNode7;
		listNode7.next = listNode8;
		listNode8.next = listNode9;
		listNode9.next = null;
		ListNode head = solution.deleteDuplicates(listNode1);
		while(head != null){
			System.out.println(head.val);
			head = head.next;
		}
	}

//	public ListNode deleteDuplicates(ListNode head) {
//		if(head == null)
//			return null;
//		ListNode headNode = new ListNode(0);
//		ListNode node = headNode;
//		while(head != null){
//			if(head.next != null){
//				if(head.val != head.next.val){
//					node.next = head;
//					node = node.next;			
//				}
//			}else{
//				node.next = head;					
//			}	
//			head = head.next;
//		}
//		return headNode.next;
//	}
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null)
			return null;
		ListNode node = head;
		
		
		
		while(node.next != null){
			if(node.val == node.next.val){
				node.next = node.next.next;
			}else 
				node = node.next;
		}
		return head;
	}
}
