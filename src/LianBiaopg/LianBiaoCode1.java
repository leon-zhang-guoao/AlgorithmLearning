package LianBiaopg;

public class LianBiaoCode1 {

    //给一个 k 值 要求一个链表在 k值为一组的 范围内 翻转 不满k值一组的 不操作
    // https://leetcode.cn/problems/reverse-nodes-in-k-group/
    public class ListNode {
        public int value;
        public ListNode next;
    } 


    public static ListNode fin(ListNode head, int k) {
        ListNode start = head;
        ListNode end = getlastFromK(head, k);
        if (end == null) {

            return head;
        }
        head = end;
        fanZhuan(start, end);
        ListNode lastEnd = start;
        while (lastEnd.next != null) {
            start = lastEnd.next;
            end = getlastFromK(start, k);
            if (end == null) {
                return head;
            }
            fanZhuan(start, end);
            lastEnd.next = end;
            lastEnd = start;


        }

        return head;
    }

    public static ListNode getlastFromK(ListNode n, int k) {
        while (--k != 0 && n != null) {

            n = n.next;


        }
        return n;
    }

    public static void fanZhuan(ListNode head, ListNode last) {
        last = last.next;
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        while (cur != last) {

            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        head.next = last;


    }


    public static void main(String[] args) {
        int a = 5;
        int b =6 ;
        while (a-- != 0 && b != 0) {
            System.out.println(b);
            b--;

        }

    }
}
