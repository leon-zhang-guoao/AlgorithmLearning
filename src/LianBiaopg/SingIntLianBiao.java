package LianBiaopg;

public class SingIntLianBiao {

    public int value;
    public SingIntLianBiao next;

    public SingIntLianBiao(int value) {
        this.value = value;
        this.next = null;
    }

    public SingIntLianBiao() {

    }

    public static class DoIntLianBiao {

        public SingIntLianBiao head;
        public SingIntLianBiao tail;
        private int length;

        public DoIntLianBiao() {
            this.head = null;
            this.length = 0;
            this.tail = null;

        }

        public void add(int i) {

            SingIntLianBiao singIntLianBiao = new SingIntLianBiao(i);

            if (head == null) {

                head = singIntLianBiao;
            } else {
                tail.next = singIntLianBiao;

            }
            tail = singIntLianBiao;
            length++;
        }

        public void printAll() {

            SingIntLianBiao cur = head;


            while (head != null) {

                System.out.print(head.value);
                System.out.print(" ");
                head = head.next;

            }
            System.out.println();
            head = cur;
        }

        public int length() {
            int i = 0;
            while (head != null) {
                System.out.println("limian: " + head);
                head = head.next;
                i++;
            }
            return i;

        }
    }
}
