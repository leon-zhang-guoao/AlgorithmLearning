package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class compara {
    public static class Student {
        public int id;
        public String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    //比较器 返回 正数 认为第二个参数排前面 ， 返回负数 认为第一个参数排前面
    public static class Compare implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {

            if (o1.id > o2.id) {
                return 1;
            } else if (o1.id < o2.id) {
                return -1;
            } else {
                return 0;
            }
        }
    }
    public static void printS(Student[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].id);
        }
    }

    public static void main(String[] args) {
        Student a1 = new Student(1, "zzz");
        Student a2 = new Student(5, "zzz");
        Student a3 = new Student(0, "zzz");
        Student a4 = new Student(3, "zzz");
        Student[] aa = {a1,a2,a3,a4};
        Arrays.sort(aa,new Compare());
        printS(aa);
    }
}
