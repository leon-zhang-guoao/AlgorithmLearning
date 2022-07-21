package bitMap;

//用二进制实现加法
public class ADD {
    //加法
    public static int add1(int a, int b) {
        int sum = 0;
        while (b != 0) {
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;

    }

    //负数
    public static int negNum(int a) {
        return add1(a, 1);
    }

    //减法
    public static int neg(int a, int b) {

        return add1(a, negNum(b));


    }

    public static int mulite(int a, int b) {
        int res = 0;
        while (b != 0) {
            if ((b & 1) != 0) {
                res = add1(res, a);
            }
            a <<= 1;
            b >>>= 1;
        }
        return res;
    }

    public static int l(int a, int b) {
        return a * b;

    }

    public static void main(String[] args) {
        int a = 99;
        int b = 99;

        long l1 = System.nanoTime();

        mulite(a,b);

        long d1 = System.nanoTime();

        System.out.println("wo de :" + (d1 - l1));

        long l2 = System.nanoTime();

        l(a,b);

        long d2 = System.nanoTime();

        System.out.println("xi tong :" + (d2 - l2));

    }

}
