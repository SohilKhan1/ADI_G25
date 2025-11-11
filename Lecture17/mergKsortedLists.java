package Lecture17;

public class mergKsortedLists {
//	class Solution {
//	    public ListNode mergeKLists(ListNode[] lists) {
//	        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val - b.val);
//	        ListNode res = new ListNode(-1);
//	        ListNode dummy = res;
//	        for(ListNode l: lists){
//	            if(l != null) pq.add(l);
//	        }
//	        while(pq.isEmpty()==false){
//	            ListNode node = pq.poll();
//	            if(node.next != null) pq.add(node.next);
//	            dummy.next = node;
//	            dummy = dummy.next;
//	        }
//	        return res.next;
//	    }
//	}
}
