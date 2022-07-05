public class LianBiao {

    public static class SingNode<V> {
        public V value;
        public SingNode next;

        public SingNode(V value) {
            this.value = value;
            this.next = null;
        }

        public SingNode() {
        }
    }

    public static class MySingQueue<V> {
        private SingNode<V> head;
        private SingNode<V> tail;
        private int size;

        public MySingQueue(SingNode singNode) {
            head = null;
            tail = null;
            size = 0;
        }

        public MySingQueue() {

        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void add(V value) {
            SingNode<V> vSingNode = new SingNode<>(value);
            if (tail == null) {
                head = vSingNode;
            } else {
                tail.next = vSingNode;
            }
            tail = vSingNode;
            size++;

        }

        public V poll() {
            V ans = null;

            if (head != null) {
                ans = head.value;
                head = head.next;
                size--;
            } else {
                tail = null;
            }
            return ans;
        }

    }


    public static void main(String[] args) {


        MySingQueue mySingQueue = new MySingQueue();
        mySingQueue.add(1);
        mySingQueue.add("dsadsa");
        mySingQueue.add("dsadsaz22");
        System.out.println(mySingQueue.poll());
        System.out.println(mySingQueue.poll());
        System.out.println(mySingQueue.poll());

    }
}
