import org.w3c.dom.ls.LSOutput;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        }
        return 0;
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (30 * (this.workHours - 40));
        }
        return 0;
    }

    public double raiseSalary() {
        if (2021 - this.hireYear > 19) {
            return this.salary * 0.15;
        } else if (2021 - this.hireYear > 9) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.05;
        }
    }

    public String toString() {
        return "Adı : " + this.name
                + "\nMaaşı : " + this.salary
                + "\nÇalışma saati : " + this.workHours
                + "\nBaşlangıç yılı : " + this.hireYear
                + "\nVergi : " + this.tax()
                + "\nBonus : " + this.bonus()
                + "\nMaaş artışı : " + this.raiseSalary()
                + "\nVergi ve bonuslar ile birlikte maaş :  : " + (this.salary + this.bonus() - this.tax())
                + "\nToplam maaş : :  : " + (this.salary + this.raiseSalary())

                ;
    }
}
