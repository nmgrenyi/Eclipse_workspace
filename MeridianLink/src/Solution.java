class Node {
	//**** LINK TO THE NEXT NODE *****//
	public int value;
    public Node next;
    
    public Node (int value) {
    	this.value = value;
    }

    //**** CONTENT OF THIS NODE *****//
    //private BigContent content1;
    //private BigContent content2;
    // ... there are many more members here
}

public class Solution {

	static public Node Remove(Node head, int[] removalRequests, int removalRequest_Length) {
		
		//check input data
		if (head == null) {
			return head;
		}
		
		if (removalRequests == null || removalRequests.length == 0) {
			return head;
		}
		
		if (removalRequests.length != removalRequest_Length) {
			return null;
		}
		
		if (removalRequests[0] == 0) {
			return null;
		}
		
		//use dummy node(Robostness, what if the node be removed include the first node in future)
		Node dummy = new Node(0);
		dummy.next = head;
		
		int indexOfNodeArray = 0;
		int indexOfRemovalRequest = 0;
		Node preNode;
		
		//remove node
		while (head != null) {
			preNode = head;
			head = head.next;
			indexOfNodeArray++;
			if (removalRequests[indexOfRemovalRequest] == indexOfNodeArray) {
				preNode.next = head.next;
				indexOfRemovalRequest++;
				if (removalRequest_Length <= indexOfRemovalRequest) {
					break;
				}
			}
		}
		
		return dummy.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n0 = new Node(0);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		n0.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		Node res = Remove(n0, new int[]{1, 2, 3}, 3);
		int length = 0;
		while (res != null) {
			System.out.println(res.value);
			res = res.next; 
			length++;
		}
		//System.out.println(length);
	}

}
