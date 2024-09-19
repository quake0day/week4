// src/test/java/Problem2Test.java
import org.junit.Test;
import static org.junit.Assert.*;

public class Problem2Test {
    @Test
    public void testInsertMiddle() {
        ListNode list = createList(new int[]{1, 2, 3, 4});
        list = Problem2.insert(list, 5, 3);
        assertEquals("1 -> 2 -> 5 -> 3 -> 4", listToString(list));
    }

    @Test
    public void testInsertBeginning() {
        ListNode list = createList(new int[]{1, 2, 3, 4});
        list = Problem2.insert(list, 0, 1);
        assertEquals("0 -> 1 -> 2 -> 3 -> 4", listToString(list));
    }

    @Test
    public void testInsertEnd() {
        ListNode list = createList(new int[]{1, 2, 3, 4});
        list = Problem2.insert(list, 5, 10);
        assertEquals("1 -> 2 -> 3 -> 4 -> 5", listToString(list));
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