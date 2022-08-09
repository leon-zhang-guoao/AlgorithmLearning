package bitMap;

import java.lang.reflect.Array;
import java.util.Arrays;

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
        return add1(~a, 1);
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

    public static boolean isNeg(int a) {

        return a < 0;
    }

    public static int div(int a, int b) {

        int x = isNeg(a) ? negNum(a) : a;
        int y = isNeg(b) ? negNum(b) : b;
        int res = 0;
        for (int i = 30; i >= 0; i = add1(i, 1)) {
            if ((x >> i) >= y) {
                res |= (1 << i);
                x = neg(x, y << i);

            }

        }

        return isNeg(a) ^ isNeg(b) ? negNum(res) : res;


    }


    public static void main(String[] args) {

        int[] arr = {1,4,2,5,0,86,4,23,4343,5};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }

}
