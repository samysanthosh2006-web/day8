class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int length = 1;
        while(curr.next != null){
            curr = curr.next;
            length++;
        }

        if(length  == 1) return null;
        if(length == n) return head.next;
        
        int k = length - n;
        ListNode temp = head;
        while(k-- > 1){
           temp = temp.next;
        }

        if(temp.next != null){
            temp.next = temp.next.next;
        }
        return head;
    }
}