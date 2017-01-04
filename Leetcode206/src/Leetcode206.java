
public class Leetcode206 {

	public ListNode reverseList(ListNode head) {  
        if(head==null) return null;  
        if(head.next==null) return head;  
          
        ListNode p = head.next;  
        ListNode n = reverseList(p);  
          
        head.next = null;  
        p.next = head; 
        System.out.println(n.val);
        return n;  
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leetcode206 lc = new Leetcode206();
		ListNode ln0 = new ListNode(0);
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ln0.next = ln1;
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		
		lc.reverseList(ln0);
	}

}
