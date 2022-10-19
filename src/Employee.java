public class Employee {
    private static int cownter = 0;

    private Integer id;
    private String lastName;

    private String name;


    private String middleName;

    private int department;
    private int salary;


    public Employee(String name, String lastName, String middleName, int department, int salary) {
        this.salary = salary;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.id = cownter++;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
