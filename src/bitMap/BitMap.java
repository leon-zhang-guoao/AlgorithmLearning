package bitMap;

public class BitMap {
    private long[] bits;

    public BitMap(int max) {
        bits = new long[(max + 64) >> 6];
    }

    public void add(int num) {
        bits[num >> 6] |= (1L << (num & 63));
    }

    public void delete(int num) {
        bits[num >> 6] &= ~(1L << (num & 63));
    }

    public boolean contains(int num) {
        return (bits[num >> 6] & (1L << (num & 63))) != 0;
    }

    public static void main(String[] args) {
        long[] a = new long[2];
        a[0] = 1;
        a[1] = 2;
        System.out.println(a[0]);
    }

}
