public class Radmo {
    public static int f1() {
        return (int) (Math.random() * 5) + 1;
    }

    // 把数组 均分 前一半 返回0 后一半返回 1 中间的重做
    public static int f2() {

        int ans = 0;
        do {
            ans = f1();
        } while (ans == 3);
        return ans < 3 ? 0 : 1;
    }

    // 二进制位 做到 0 到 7 等概率  因为 000是0 111 是7
    public static int f3() {
        return (f2() << 2 + (f2() << 1) + (f2() << 0));
    }
//由于 f3 是 0到7 所以 遇到 7 重做 就得到 0到6的等概率生成器
    public static int f4() {
        int num = -1;
        do {
             num = f3();
        } while (num == 7);
        return num;
    }

    public static void main(String[] args) {
        System.out.println("dsa");

    }
}
