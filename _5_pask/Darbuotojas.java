package _5_pask;

import java.util.Comparator;

public class Darbuotojas implements Comparable<Darbuotojas> {
    String name;
    int age;
    Integer salary;
    String city;

    public Darbuotojas(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "City: "+city+", Name: "+name+", Age: "+age+", Salary: "+salary;
    }

//    Comparator<Darbuotojas> compareCity = new Comparator<Darbuotojas>() {
//        @Override
//        public int compare(Darbuotojas o1, Darbuotojas o2) {
//            return o1.city.compareToIgnoreCase(o2.city);
//        }
//    };
//    Comparator<Darbuotojas> compareSalary = new Comparator<Darbuotojas>() {
//        @Override
//        public int compare(Darbuotojas o1, Darbuotojas o2) {
//            return o1.salary.compareTo(o2.salary);
//        }
//    };

    @Override
    public int compareTo(Darbuotojas o) {
        int result = this.city.compareTo(o.city);
        if (result == 0) {
            result = this.salary.compareTo(o.salary);
        }
        return result;
    }


    //public int compareTo(Quote quote) {
    //     int result = this.getName().compareTo(quote.getName());
    //     if (result == 0) {
    //        result = this.getChange().compareTo(quote.getChange());
    //     }
    //     if (result == 0) {
    //        result = this.getPercentChange().compareTo(quote.getPercentChange());
    //     }
    //     return result;
    // }
}
