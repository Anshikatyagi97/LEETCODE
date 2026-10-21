
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode current = head;
        int count = 0;

        // Check whether k nodes are available
        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        // Reverse only if k nodes are available
        if (count == k) {

            current = reverseKGroup(current, k);

            // Reverse the current group
            while (count > 0) {
                ListNode nextNode = head.next;
                head.next = current;
                current = head;
                head = nextNode;
                count--;
            }

            head = current;
        }

        return head;
    }
}
