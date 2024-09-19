// src/test/java/Problem1Test.java
import org.junit.Test;
import static org.junit.Assert.*;

public class Problem1Test {
    @Test
    public void testConcatenate() {
        ListNode l1 = createList(new int[]{2, 3, 1});
        ListNode l2 = createList(new int[]{4, 5});
        ListNode result = Problem1.concatenate(l1, l2);
        assertEquals("2 -> 3 -> 1 -> 4 -> 5", listToString(result));
        // Test that l2 is not modified
        assertEquals("4 -> 5", listToString(l2));
    }

    @Test
    public void testConcatenateWithEmptyList() {
        ListNode l1 = null;
        ListNode l2 = createList(new int[]{1, 2, 3});
        ListNode result = Problem1.concatenate(l1, l2);
        assertEquals("1 -> 2 -> 3", listToString(result));
        assertEquals("1 -> 2 -> 3", listToString(l2));
    }

    private ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    private String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append(" -> ");
            head = head.next;
        }
        return sb.toString();
    }
}
