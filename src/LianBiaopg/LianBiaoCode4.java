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
        while (one != null && two != null){


        }


        return list1;

    }



}
