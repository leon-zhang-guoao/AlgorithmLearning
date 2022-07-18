package LianBiaopg;

public class LianBiaoCode4 {

    //https://leetcode.cn/problems/merge-two-sorted-lists/
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
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        int a = list1.val;
        int b = list2.val;
        // one 是 开头 小的
        ListNode one = a >= b ? list2 : list1;
        ListNode cur2 = a < b ? list2 : list1;
        //ListNode cur2 = one == list1 ? list2 : list1;
        ListNode cur1 = one.next;
        ListNode pre = one;
        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {

                pre.next = cur1;
                cur1 = cur1.next;
            } else {
                pre.next = cur2;
                cur2 = cur2.next;

            }
            pre = pre.next;

        }
        pre.next = cur1 == null ? cur2 : cur1;


        return one;
    }


}
