public class DideliuSkaiciuSudetis {
    public static void main(String[] args) {
        byte[] didelisSkaicius1 = new byte[20];
        byte[] didelisSkaicius2 = new byte[20];

        didelisSkaicius1[0] = 3;
        didelisSkaicius1[1] = 9;
        didelisSkaicius1[2] = 8;
        didelisSkaicius1[3] = 7;

        didelisSkaicius2[0] = 6;
        didelisSkaicius2[1] = 3;
        didelisSkaicius2[2] = 2;
        didelisSkaicius2[3] = 1;

        spausdinti(didelisSkaicius1);
        System.out.print(" + ");
        spausdinti(didelisSkaicius2);

        byte[] rezultatas = DideliuSkaiciuSudetis.suma(didelisSkaicius1, didelisSkaicius2);
        System.out.println(" = ");
        spausdinti(rezultatas);

     }
     static byte[] suma(byte[] p1, byte[] p2) {
        byte[] rezultatas = new byte[p1.length];
        int mintyje = 0;
        for(int i=0;i<p1.length;i++){
            int x = p1[i] * 2 + mintyje;
            if (x <= 9) {
                rezultatas[i] = (byte) x;
                mintyje = 0;
            } else {
                rezultatas[i] = (byte) (x % 10);
                mintyje = x/10;
            }
        }
        return rezultatas;
     }
     static  void spausdinti(byte[] skaicius) {
         for (int i=skaicius.length-1;i>=0;i--) {
             System.out.print(skaicius[i]);
         }
     }
}
