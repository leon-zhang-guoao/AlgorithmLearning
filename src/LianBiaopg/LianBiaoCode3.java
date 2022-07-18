package LianBiaopg;

public class LianBiaoCode3 {


    public int length(LianBiaopg.SingIntLianBiao head) {
        int i = 0;
        while (head != null) {
            System.out.println("waimian: " + head);
            head = head.next;
            i++;
        }
        SingIntLianBiao singIntLianBiao = new SingIntLianBiao();
        head = singIntLianBiao;
        System.out.println(head);

        return i;

    }


    public static void main(String[] args) {



    }
}
