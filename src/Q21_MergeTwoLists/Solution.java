package Q21_MergeTwoLists;


public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode listNode11=new ListNode(1);
		ListNode listNode12=new ListNode(2);
		ListNode listNode13=new ListNode(4);
		ListNode listNode21=new ListNode(1);
		ListNode listNode22=new ListNode(3);
		ListNode listNode23=new ListNode(4);
		listNode11.next = listNode12;
		listNode12.next = listNode13;
		listNode13.next = null;
		listNode21.next = listNode22;
		listNode22.next = listNode23;
		listNode23.next = null;
		ListNode head = solution.mergeTwoLists(listNode11,listNode21);
		while(head.next != null){
			System.out.println(head.val);
			head = head.next;
		}
	}
	
//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode node1 = l1;
//        ListNode node2 = l2;       
//        ListNode head = new ListNode(0);
//        ListNode node = head;
//        int flag=0;
//        while(node1 != null || node2 != null){
//            if(node1 == null){
//                node.next = node2;
//                break;
//            }
//            if(node2 == null){
//            	node.next = node1;
//            	break;
//            }
//            if(node1 != null && node2 != null){
//                if(node1.val <= node2.val){
//                    node.next = node1;
//                    node = node.next;
//                    node1 = node1.next;
//                }               
//                else{
//                    node.next = node2;
//                    node = node.next;
//                    node2 = node2.next;
//                }
//            }
//        }
//        return head.next;
//    }  
	

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode curr = head;
		while(l1 != null && l2 != null){
			if(l1.val <= l2.val){
				curr.next = l1;
				curr = curr.next;
				l1 = l1.next;
			}               
			else{
				curr.next = l2;
				curr = curr.next;
				l2 = l2.next;
			}			
		}
		if(l1 == null){
			curr.next = l2;
		}else{
			curr.next = l1;
		}
		return head.next;
	}
}
