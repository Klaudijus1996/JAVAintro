package mokinys;

public class mokiniai {
    String vardas;
    String pavarde;
    int klase;

    @Override
    public String toString() {
        return vardas + " " +
                ", pavarde='" + pavarde + '\'' +
                ", klase=" + klase +
                '}';
    }
}
