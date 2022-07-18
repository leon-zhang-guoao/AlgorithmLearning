public class test {

    public testpojo aa(testpojo a) {
        a.b = new StringBuffer("ddd");

        return a;
    }

    public static void main(String[] args) {
        test test = new test();
        testpojo testpojo = new testpojo();
        System.out.println(test.aa(testpojo).b);
        testpojo.b = new StringBuffer("aaa");
        System.out.println(test.aa(testpojo).b);
        testpojo.b = new StringBuffer("aaa");
        System.out.println(testpojo.b);

    }
}
