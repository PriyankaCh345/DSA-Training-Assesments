
class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class reverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;

        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }

        return prev;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(12);
        head.next = new ListNode(14);
        head.next.next = new ListNode(16);

        reverseLinkedList obj = new reverseLinkedList();

        ListNode ans = obj.reverseList(head);

        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
