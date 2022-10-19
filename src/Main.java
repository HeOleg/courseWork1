public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee employee1 = new Employee("Иван ", "Иванов ", "Иванович ",1,50000);
        Employee employee2 = new Employee("Андрей ", "Иванов ", "Иванович ",1,51000);
        Employee employee3 = new Employee("Александр ", "Иванов ", "Иванович ",2,52000);
        Employee employee4 = new Employee("Алексей ", "Иванов ", "Иванович ",2,53000);
        Employee employee5 = new Employee("Олег ", "Иванов ", "Иванович ",3,54000);
        Employee employee6 = new Employee("Виктор ", "Иванов ", "Иванович ",3,55000);
        Employee employee7 = new Employee("Тарас ", "Иванов ", "Иванович ",4,56000);
        Employee employee8 = new Employee("Павел ", "Иванов ", "Иванович ",4,57000);
        Employee employee9 = new Employee("Сергей ", "Иванов ", "Иванович ",5,58000);
        Employee employee10 = new Employee("Артем ", "Иванов ", "Иванович ",5,59000);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;




        System.out.println("Сумма всех зарплат: " + calculateSumSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + findMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + findMaxSalary());
        System.out.println("Средняя зарплата: " + calculateAverageSalary());
        System.out.println(printFullNames());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static float calculateAverageSalary() {
        return calculateSumSalary() / (float) employees.length;
    }
    public static Employee findMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }


    public static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static boolean printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + employee.getName() + employee.getMiddleName());
        }
        return false;
    }

    public static Employee findMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;

    }
}
