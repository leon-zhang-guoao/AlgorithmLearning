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
                res = add1(res,a);
            }
            a <<= 1;
            b >>>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int i = mulite(3, 7);
        System.out.println(i);

    }

}
