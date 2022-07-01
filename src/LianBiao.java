public class LianBiao {

    public static class Node {
        public int a;
        public Node next;


        public Node(int a) {
            this.a = a;
        }

        public Node() {
        }
    }


    public static void main(String[] args) {
        Node a = new Node();
        System.out.println(a.a);
        a.next = new Node();
    }
}
