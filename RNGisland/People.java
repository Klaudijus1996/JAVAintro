package RNGisland;

public class People extends Island {

    private int age;
    private int birthControl;

    public int getBirthControl() { return birthControl; }
    public void setBirthControl(int birthControl) { this.birthControl = birthControl; }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person age: " + age;
    }





}
