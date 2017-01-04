class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


public class Solution {

	public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        
        //Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preP1 = dummy;
        ListNode p1 = dummy.next;
        ListNode p2 = p1.next;
        
        //dummy.next & dummy.next.next
        while(p2 != null) {
            if (p1.val == p2.val) {
                while(p1.val == p2.val) {
                    p1.next = p2.next;
                    p2 = p2.next;
                }
                preP1.next = p1.next;
                p1 = p2;
                p2 = p2.next;
            }else{
                preP1 = p1;
                p1 = p2;
                p2 = p2.next;
                
            }
            
        }
        return dummy.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(-14);
		ListNode node2 = new ListNode(-13);
		node1.next = node2;
		ListNode node3 = new ListNode(-12);
		node2.next = node3;
		ListNode node4 = new ListNode(-12);
		node3.next = node4;
		ListNode node5 = new ListNode(-11);
		node4.next = node5;
		ListNode node6 = new ListNode(-11);
		node5.next = node6;
		ListNode node7 = new ListNode(-11);
		node6.next = node7;
		ListNode node8 = new ListNode(-11);
		node7.next = node8;
		ListNode node9 = new ListNode(-11);
		node8.next = node9;
		ListNode node10 = new ListNode(-12);
		node3.next = node4;
		ListNode node5 = new ListNode(-11);
		node4.next = node5;
		ListNode node6 = new ListNode(-11);
		node5.next = node6;
		ListNode node7 = new ListNode(-11);
		node6.next = node7;
		

	}

}
