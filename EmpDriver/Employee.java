public class Employee {
    private String name;
    public double salary;
    private int workHours, hireYear;

    Employee(int hireyear, int workhours, double salary, String name) {
        this.name = name;
        this.salary = salary;
        this.workHours = workhours;
        this.hireYear = hireyear;
    }

    public double tax() {
        if (this.salary > 1000) {
            return salary * 0.03;
        } else {
            return 0.0;
        }

    }

    public double bonus() {
        int exstraHours = this.workHours - 40;
        if (exstraHours > 0) {
            return 30 * exstraHours;
        }
        return 0.0;
    }

    public double increase() {
        int year = 2021 - this.hireYear;
        if (year < 10) {
            return salary * 0.5;
        } else if (year >= 10 && year < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }
}