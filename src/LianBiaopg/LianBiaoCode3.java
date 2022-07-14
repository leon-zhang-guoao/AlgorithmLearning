package LianBiaopg;

public class LianBiaoCode3 {


    public int length(LianBiaopg.SingIntLianBiao head) {
        int i = 0;
        while (head != null) {
            head = head.next;
            i++;
        }

        return i;

    }


    public static void main(String[] args) {
        SingIntLianBiao.DoIntLianBiao doIntLianBiao = new SingIntLianBiao.DoIntLianBiao();
        doIntLianBiao.add(1);
        doIntLianBiao.add(2);
        doIntLianBiao.add(3);
        LianBiaoCode3 lianBiaoCode3 = new LianBiaoCode3();
        System.out.println(lianBiaoCode3.length(doIntLianBiao.head));
        doIntLianBiao.printAll();
        doIntLianBiao.printAll();

    }
}
