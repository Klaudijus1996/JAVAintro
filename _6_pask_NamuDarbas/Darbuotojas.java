package _6_pask_NamuDarbas;

import java.util.Comparator;

public class Darbuotojas implements Comparator<Darbuotojas> {
    private String name;
    private String city;
    private Integer age;
    private Integer salary;

    public Darbuotojas() {
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public int compare(Darbuotojas o1, Darbuotojas o2) {
        int result = o1.city.compareTo(o2.city);
        if (result == 0) {
            result = o1.age.compareTo(o2.age);
        }
        return result;
    }

    @Override
    public String toString() {
        return "City: "+city+", Name: "+name+", Age: "+age+", Salary: "+salary;
    }
}
