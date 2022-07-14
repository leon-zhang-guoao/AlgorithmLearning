package LianBiaopg;

public class DoubleLianBiao {


    public static class DoubleNode<V> {
        private V value;
        private DoubleNode laster;
        private DoubleNode next;

        public DoubleNode(V value) {
            this.value = value;
            this.laster = null;
            this.next = null;
        }


    }


    public static class DoubleLian<V> {

        private DoubleNode<V> head;
        private DoubleNode<V> tail;
        private int count;

        public DoubleLian() {
            this.head = null;
            this.tail = null;
            this.count = 0;
        }


        public void addHead(V v) {

            DoubleNode<V> vDoubleNode = new DoubleNode<V>(v);

            if (head == null) {

                head = vDoubleNode;
                tail = vDoubleNode;
            } else {

                vDoubleNode.next = head;
                head.laster = vDoubleNode;
                head = vDoubleNode;
            }
            count++;

        }

        public void poll_head() {
            V ans = null;
            if (head == null) {
                System.out.println(ans);
            }
            ans = head.value;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.laster = null;
            }
            System.out.println(ans);
        }

        public void poll_tail() {
            V ans = null;
            if (tail == null) {
                System.out.println(ans);
            }
            ans = tail.value;
            if (head == tail) {

                head = null;
                tail = null;
            } else {

                tail = tail.laster;
                tail.next = null;
            }
            System.out.println(ans);

        }
    }

    public static void main(String[] args) {
        DoubleLian doubleLian = new DoubleLian();
        doubleLian.addHead("a");
        doubleLian.addHead("b");
        doubleLian.addHead("c");
        doubleLian.addHead("d");
        doubleLian.poll_tail();
        doubleLian.poll_tail();
        doubleLian.poll_tail();
        doubleLian.poll_tail();
        doubleLian.poll_tail();

    }
}
