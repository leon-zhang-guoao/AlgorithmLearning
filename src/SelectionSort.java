public class SelectionSort {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void SSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minValue = i;
            for (int j = i + 1; j < arr.length; j++) {
                minValue = arr[j] < arr[minValue] ? j : minValue;
            }
            swap(arr, minValue, i);


        }
        printArr(arr);
    }

    public static void bubbldSory(int[] arr) {
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }

            }
        }
        printArr(arr);

    }

    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {

            while (i - 1 >= 0 && arr[i] < arr[i - 1]) {
                swap(arr, i, i - 1);
                i--;
            }

        }
        printArr(arr);
    }

    public static int[] randomArr(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);

        if (len < 2) {
            len += 1;
        }
        int[] b = new int[len];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * maxValue);

        }
        return b;
    }

    //arr有序 >= num 最左
    public static int findNumIndexLeft(int[] arr, int num) {
        int l = 0;
        int r = arr.length - 1;
        int t = -1;
        while (l <= r) {

            int mid = (l + r) / 2;

            if (arr[mid] >= num) {

                t = mid;
                r = mid - 1;

            } else {

                l = mid + 1;


            }
        }


        return t;
    }

    public static int findNumIndexRit(int[] arr, int num) {
        int l = 0;
        int r = arr.length - 1;
        int t = -1;

        while (l <= r) {

            int mid = (l + r) / 2;
            if (arr[mid] >= num) {
                t = mid;
                l = mid + 1;
            } else {

                r = mid - 1;
            }
        }

        return t;

    }

    public static void main(String[] args) {
        int[] aa = {1, 5, 41, 0, 877, 4561, 2, 3};
//        insertSort(aa);

        int count = 100;
        int maxlen = 20;
        int maxvalure = 1000;
//        for (int i = 0; i < count; i++) {
//            insertSort(randomArr(maxlen, maxvalure));
//
//            //System.out.println("-------");
//        }

        int[] bb = {0, 1, 5, 6, 8, 10, 12};
        System.out.println(findNumIndexRit(bb, 5));

    }
}
