public class EmpDriver {

    public static void main(String[] args) {
    Employee emp1 = new Employee(2015,45,2000,"Ali");
    System.out.println("Bonus:" +emp1.bonus());
    System.out.println("Tax:"+emp1.tax());
    System.out.println("Raise Salary:"+emp1.increase());
    double totalsalary= emp1.salary- emp1.tax()+ emp1.bonus();
    System.out.println("Salary with tax and bonus:"+totalsalary);
    double totalsalarynet=emp1.salary+ emp1.increase();
    System.out.println("Total Salary with the raise of salary:"+totalsalarynet);
    Employee emp2 = new Employee(2010,30,2500,"Mahoni");
    System.out.println("Bonus : "+emp2.bonus());
    System.out.println("Tax : "+emp2.tax());
    }
}
