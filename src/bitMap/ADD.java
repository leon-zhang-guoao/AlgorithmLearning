package bitMap;

//用二进制实现加法
public class ADD {
    public static int add1(int a, int b) {
        int sum = 0;
        while (b != 0) {
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;

    }

    public static void main(String[] args) {
        int i = add1(11, 33);
        System.out.println(i);

    }

}
