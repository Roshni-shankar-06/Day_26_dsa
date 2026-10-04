class Solution {
    public int getDecimalValue(ListNode head) {
        int decimalValue = 0;
        
        while (head != null) {
            // Shift the accumulated value to the left by 1 and add the current node's value
            decimalValue = (decimalValue << 1) | head.val;
            head = head.next;
        }
        
        return decimalValue;
    }
}
