public class LianBiaoCode1 {

    //给一个 k 值 要求一个链表在 k值为一组的 范围内 翻转 不满k值一组的 不操作
    public class Node {
        public int value;
        public Node next;
    }

    public static Node getlastFromK(Node n, int k) {
        while (k > 0) {
            if (n != null) {
                n = n.next;
            }
            k--;
        }
        return n;
    }

    public static void fanZhuan(Node head, Node last) {
        last = last.next;
        Node pre = null;
        Node cur = head;
        Node next = null;
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
        while (a >= 0) {
            System.out.println(a);
            a--;
        }

    }
}
