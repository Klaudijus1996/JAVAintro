public class DinaminioMasyvoPvz {
    public static void main(String[] args) {
        long[] masyvas = new long[1];

        for (int i=0;i<1000;i++) {
            // TODO ideti i ta masyva 1000 skaiciu
            masyvas = push(masyvas, Math.round(Math.random()*1000));
        }
        for (long elem: masyvas) {
            System.out.println(elem);
        }
    }
    static long[] push(long[] m, long elem) {
        // TODO ...
        long[] naujasMasyvas = new long[m.length+1];
        for (int i=0;i<m.length;i++) {
            naujasMasyvas[i] = m[i];
        }
        // irasome paskutini naujo masyvo elementa
        naujasMasyvas[naujasMasyvas.length-1] = elem;
        // graziname nauja masyva
        return naujasMasyvas;
    }
}
