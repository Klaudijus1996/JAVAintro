import java.util.Arrays;

public class NumArray {
    public static void main(String[] args) {
        /*** Generating random numArray ***/
        int min = -10;
        int max = 10;
        int range = max - min +1;
        int[] numArr = new int[10];
        for (int i=0;i<10;i++) {
            numArr[i] = (int) (Math.random() * range) + min;
        }

        int[] kekw = {0, 1, 6, 4, -3, 10, -1, 9, -3, 10}; // simple test array;

        System.out.println("Currently generated Array: "+Arrays.toString(numArr)); // Sugeneruotas skaičių array
        System.out.println("Highest value found: "+findBiggest(numArr)); // I eškomas didžiausias skaičius
        System.out.println("Lowest value found: "+findSmallest(numArr)); // Ieškomas mažiausias skaičius
        System.out.println("Rearranged array: "+Arrays.toString(replacingNum(numArr))); // Mažiausiai skaičiai sukeisti vietomis su didžiausiu skaičiu ir atvirkščiai
        System.out.println("Index of highest: "+highestIndex(numArr));
        System.out.println("Index of lowest: "+lowestIndex(numArr));
        System.out.println("Replacing first of highest and last of lowest: "+Arrays.toString(replaceFirstAndLast(numArr)));
    }
    /*** Finding biggest value in the array ***/
    static int findBiggest(int[] numArr) {
        int i = 0;
        int biggestNum = 0;
        while ( i < numArr.length ) {
            if ( numArr[i] > biggestNum ) {
                biggestNum = numArr[i];
            }
            i++;
        }
        return biggestNum;
    }
    /*** Finding smallest value in the array ***/
    static int findSmallest(int[] numArr) {
        int i = 0;
        int smallestNum = 0;
        while ( i < numArr.length ) {
            if ( numArr[i] < smallestNum ) {
                smallestNum = numArr[i];
            }
            i++;
        }
        return smallestNum;
    }
    /*** Replacing found values with the opposite ***/
    static int[] replacingNum(int[] numArr) {
        int smallestNum = findSmallest(numArr);
        int biggestNum = findBiggest(numArr);
        for ( int j=0;j<numArr.length;j++ ) {
            if ( numArr[j] == smallestNum ) {
                numArr[j] = biggestNum;
            } else if ( numArr[j] == biggestNum ) {
                numArr[j] = smallestNum;
            }
        }
        return numArr;
    }
    /*** Replacing first and last of values ***/
    static int[] replaceFirstAndLast(int[] numArr) {
        int highestIndex = highestIndex(numArr);
        int lowestIndex = lowestIndex(numArr);
        int highestNum = findBiggest(numArr);
        int lowestNum = findSmallest(numArr);
        for (int i=0;i<numArr.length;i++) {
            if (numArr[i] == highestNum) {
                numArr[highestIndex] = lowestNum;
            } else if (numArr[i] == lowestNum) {
                numArr[lowestIndex] = highestNum;
            }
        }
        return numArr;
    }
    /*** Finding highest index in array ***/
    static int highestIndex(int[] numArr) {
        int highestNum = findBiggest(numArr);
        int highestIndex = 0;
        for (int i=0;i<numArr.length;i++) {
            if (numArr[i] == highestNum) {
                highestIndex = i;
                break;
            }
        }
        return highestIndex;
    }
    /*** Finding lowest index in array ***/
    static int lowestIndex(int[] numArr) {
        int lowestNum = findSmallest(numArr);
        int lowestIndex = 0;
        for (int i=0;i<numArr.length;i++) {
            if (numArr[i] == lowestNum) {
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }
}
