import java.security.PublicKey;

public class EmployeeBook {
    public final Employee[] employees;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }
    public void add(Employee employee){
        for (int i = 0; i < employees.length; i++){
            if (employees[i] == null){
                employees[i] = employee;
                return;
            }
        }
        System.out.println("Места нет");
    }
    public void del(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
                return;
            }
            System.out.println("Такого работника нет");
        }
    }
    public void modify (String fio, Integer newSalary, Integer newDepartment ){
        for (int i = 0; i < employees.length; i++){
            if(employees[i].fio().equals(fio)) {
                if(newSalary != null){
                    employees[i].setSalary(newSalary);
                }
                if(newDepartment!=null){
                    employees[i].setDepartment(newDepartment);
                }

            }
        }

    }
    public void printByDep(){
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Отдел: "+i++);
            for (int j = 0; j < employees.length ; j++) {
                if(employees[j].getDepartment() == i){
                    System.out.println('\t'+employees[j].fio());
                }

            }

        }
    }


    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public   int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public   int sumSalary(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public   Employee minSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public   Employee minSalary(int department) {
        Employee min = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public   Employee maxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public   Employee maxSalary(int department) {
        Employee max = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (max == null || employee.getSalary() > max.getSalary()) {
                    max = employee;

                }
            }
        }
        return max;
    }

    public   double averegeSalary() {
        return (double) sumSalary() / employees.length;
    }

    public   double averegeSalary(int deparment) {
        var sum = sumSalary(deparment);
        var count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == deparment) {
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    public   void printEmpNam() {
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName());
        }
    }

    public   void indexSalary(double percent) {
        for (Employee employee : employees) {
            int newSalary = (int) (employee.getSalary() * (1 + percent));
            employee.setSalary(newSalary);
        }
    }

    public   void indexSalary(double percent, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                int newSalary = (int) (employee.getSalary() * (1 + percent));
                employee.setSalary(newSalary);

            }
        }
    }

    public   void print(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getId() + " " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + ",  Зарплата=" + employee.getSalary());
            }
        }
    }

    public   void printSalLess(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee.inf());
            }
        }
    }
    public   void printSalGTE(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() > salary) {
                System.out.println(employee.inf());
            }
        }
    }
}
