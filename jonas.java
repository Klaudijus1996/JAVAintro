import java.util.Arrays;

public class jonas {
    public static void main(String[] args) {


        int[] array1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] array2 = {1, 2, 3, 3, 9, 0};
        int[] array3 = {1, 2, 5, 5, 2, 3, 0};

//        printAscending(array1);
//        printDescending(array1);
        isTrue(array1);
    }
    static void printAscending(int[] arr) {
        System.out.println(Arrays.toString(ascendingArr(arr)));
    }
    static void printDescending(int[] arr) {
        System.out.println(Arrays.toString(descendingArr(arr)));
    }
    static boolean isTrue(int[] arr) {
        boolean checkArr = false;
        if (arr == ascendingArr(arr)) {
            checkArr = true;
        }
        System.out.println(Arrays.toString(arr) + " " + Arrays.toString(ascendingArr(arr)));
        return checkArr;
    }
    static int[] ascendingArr(int[] arr) {
        int temp;
        int[] kazkas = new int[10];
        int[] kazkoks = arr;
        boolean isTrue = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[j];
                        kazkoks[j] = kazkoks[i];
                        kazkoks[i] = temp;
                        isTrue = true;
                    }
                }
            }
        return arr;
    }
    static int[] descendingArr(int[] arr) {
        int temp;
        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}