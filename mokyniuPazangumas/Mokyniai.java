package mokyniuPazangumas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Mokyniai {
    static int mokyniuSkaicius = 5;
    static Mokinys[] mokiniuIsvestine = new Mokinys[mokyniuSkaicius];
    static blogiausiasMokinys[] worstStudent = new blogiausiasMokinys[1];
    static theBest[] theBests = new theBest[3];


    public static void main(String[] args) {

        duomenuIstatymas();
        averageCount();
        System.out.println(Arrays.toString(arrSort()));
        System.out.println("surasti ir atspausdinti 3 geriausiai besimokancius mokinius su ju vidurkiais - mazejimo tvarka: " +
                Arrays.toString(topLads()));

    }
    /*** student marks generator ***/
    static int[] pazymiuGeneravimas() {
        int minMark = 4;
        int maxMark = 10;
        int range = maxMark - minMark + 1;
        int[] trimestras = new int[8];
        for (int i=0;i<trimestras.length;i++) {
            trimestras[i] += (int) (Math.random() * range) + minMark;
        }
        return trimestras;
    }
    /*** generating obj data ***/
    static Mokinys[] duomenuIstatymas() {
        String[] vardai = {"Jonas", "Minde", "Petriukas", "Maryte", "Audrone"};
        String[] pavardes = {"Alkabras", "Smitas", "Kristasas", "Lietuviene", "Nedurnele"};
        for (int i=0;i<vardai.length;i++) {
            Mokinys mokinys = new Mokinys();
            mokinys.setKlase((int)(Math.random() * 12));
            mokinys.setVardas(vardai[i]);
            mokinys.setPavarde(pavardes[i]);
            mokinys.setTrimestras(pazymiuGeneravimas());
            mokinys.setAverage(0);
            mokiniuIsvestine[i] = mokinys;
        }
        return mokiniuIsvestine;
    }
    /*** counting students average mark ***/
    static Mokinys[] averageCount() {
        int[][] temp = new int[5][8];
        double[] vidurkiai = new double[mokyniuSkaicius];
        double[] scoreTemp = new double[mokyniuSkaicius];
        int[] metinisPaz = new int[mokyniuSkaicius];
        for (int i=0;i<mokiniuIsvestine.length;i++) {
            for (int j=0;j<temp[i].length;j++) {
                temp[i] = mokiniuIsvestine[i].getTrimestras();
                vidurkiai[i] += temp[i][j];
            }
        }
        for (int i=0;i<vidurkiai.length;i++) {
            vidurkiai[i] /= pazymiuGeneravimas().length;
            scoreTemp[i] = Math.round(vidurkiai[i]);
            metinisPaz[i] = (int) scoreTemp[i];
            mokiniuIsvestine[i].setAverage(vidurkiai[i]);
            mokiniuIsvestine[i].setRoundedAverage(metinisPaz[i]);
            System.out.println(mokiniuIsvestine[i]);
        }
        return mokiniuIsvestine;
    }
    /*** finding student with the lowest average grade ***/
    static blogiausiasMokinys[] arrSort() {
        blogiausiasMokinys worst = new blogiausiasMokinys();
        worst.setName("");
        worst.setScore(0);
        worst.setRoundedScore(0);
        worstStudent[0] = worst;
        Arrays.sort(mokiniuIsvestine, (m1, m2) -> {
            int sort =  Double.compare( m1.getAverage(), m2.getAverage());
            for (int i=0;i<mokiniuIsvestine.length;i++) {
                worst.setScore(mokiniuIsvestine[0].getAverage());
                worst.setName(mokiniuIsvestine[0].getVardas());
                worst.setRoundedScore(mokiniuIsvestine[0].getRoundedAverage());
            }
            return sort;
        });
        return worstStudent;
    }
    /*** finding three students with the highest mark ***/
    static theBest[] topLads() {
        Arrays.sort(mokiniuIsvestine, (m1, m2) -> {
            int sort = Double.compare(m2.getAverage(), m1.getAverage());
            return sort;
        });
        for (int i=0;i<theBests.length;i++) {
            theBest best = new theBest();
                best.setName(mokiniuIsvestine[i].getVardas());
                best.setScore(mokiniuIsvestine[i].getAverage());
                best.setRoundedScore(mokiniuIsvestine[i].getRoundedAverage());
                theBests[i] = best;
        }
        return theBests;
    }
}
