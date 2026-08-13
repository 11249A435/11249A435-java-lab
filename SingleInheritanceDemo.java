class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class PermanentEmployee extends Employee {
    double hra, da;

    PermanentEmployee(int empId, String name, double basicSalary,
                      double hra, double da) {
        super(empId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    double grossSalary() {
        return basicSalary + hra + da;
    }

    void display() {
        super.display();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary());
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        PermanentEmployee emp =
            new PermanentEmployee(101, "Arun", 30000, 5000, 4000);

        emp.display();
    }
}