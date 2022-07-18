package LianBiaopg;

public class LianBiaoCode4 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int a = list1.val;
        int b = list2.val;
        // one 是 开头 小的
        ListNode one = a >= b ? list2 : list1;
        ListNode two = a <= b ? list2 : list1;
        ListNode one_cur = one;
        ListNode two_cur = two;
        one_cur.next = two_cur;
        one_cur = one_cur.next;

        while (one_cur != null && two_cur != null) {
            if (one_cur.val <= two_cur.next.val){
                two_cur.next = one_cur;
                two_cur = two_cur.next;
            } else {
                two_cur = two_cur.next;
            }


        }


        return one;

    }


}
