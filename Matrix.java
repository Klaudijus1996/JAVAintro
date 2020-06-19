import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] a = {
                {2,4},
                {3,5}
        };
        int[][] b = {
                {1,6},
                {0,4}
        };
// TODO { 2*1 + 4*0, 2*6 + 4*4 } == a[0][0]*b[0][0] + a[0][1]*b[1][0], a[0][0]*b[0][1] + a[0][1]*b[1][1]
// TODO { 3*1 + 5*0, 3*6 + 5*4 } == a[1][0]*b[0][0] + a[1][1]*b[1][0], a[1][0]*b[0][1] + a[1][1]*b[1][1]


        matrixMult(a,b);
        print(a,b);

    }
    /*** Brain melt 3000 ***/
    static int[][] matrixMult(int[][] a, int[][] b) {
        int[][] ats = new int[2][2];
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a.length;j++) {
                ats[i][j] = 0;
                for (int k=0;k<a.length;k++) {
                    ats[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return ats;
    }
    /*** Print ***/
    static void print(int[][] a, int[][] b) {
        for (int i=0;i<matrixMult(a,b).length;i++) {
            String kekw = Arrays.toString(matrixMult(a,b)[i]);
            System.out.println(kekw);
        }
    }
}
