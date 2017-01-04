
public class Solution {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){return l2;}
        if (l2 == null){return l1;}
        if (l1.val >= l2.val){
        	ListNode node1 = new ListNode(l2.val);
            node1.val = l2.val;
            l2 = l2.next;
        }else{
            ListNode node1 = new ListNode(l1.val);
            node1.val = l1.val;
            l1 = l1.next;
        }
        ListNode head = node1;
        while (l1 != null && l2 != null){
            if (l1.val >= l2.val){
                node1.next = l2;
                l2 = l2.next;
                node1 = node1.next;
            }else{
                node1.next = l1;
                l1 = l1.next;
                node1 = node1.next;
            }
        }
        if (l1 == null && l2 != null){
            node1.next = l2;
        }else if (l1 != null && l2 == null){
            node1.next = l1;
        }
        return head;
    }
	
	public void printList(ListNode node){
		if(node != null){
			System.out.println(node.val);
			node = node.next;
			printList(node);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(4);
		ListNode l11 = new ListNode(2);
		ListNode l21 = new ListNode(5);
		ListNode l12 = new ListNode(3);
		ListNode l22 = new ListNode(6);
		l1.next = l11;
		l2.next = l21;
		l11.next = l12;
		l21.next = l22;
		l12.next = null;
		l22.next = null;
		Solution lc21 = new Solution();
		lc21.printList(lc21.mergeTwoLists(l1, l2));
	}

}
