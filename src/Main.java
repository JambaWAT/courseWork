public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Bilbo1", "Beggins", "Robber", 1000, 1);
        employees[1] = new Employee("Frodo2", "Beggins", "Robber", 70000, 2);
        employees[2] = new Employee("marko3", "Beggins", "Robber", 103210, 4);
        employees[3] = new Employee("polo4", "Beggins", "Robber", 134000, 3);
        employees[4] = new Employee("Frin5", "Beggins", "Robber", 440, 5);
        employees[5] = new Employee("mixe6", "Beggins", "Robber", 1220000, 2);
        employees[6] = new Employee("fruze7", "Beggins", "Robber", 766000, 1);
        employees[7] = new Employee("gazuze8", "Beggins", "Robber", 74124, 2);
        employees[8] = new Employee("garuze9", "Beggins", "Robber", 74236000, 3);
        employees[9] = new Employee("grfeg10", "Beggins", "Robber", 7633000, 5);

        printEmployees();
        System.out.println("--------------------");
        System.out.println(sumSalary());
        System.out.println("--------------------");

        System.out.println(minSalary());
        System.out.println("--------------------");

        System.out.println(maxSalary());
        System.out.println("--------------------");

        System.out.println(averegeSalary());
        System.out.println("--------------------");

        printEmployeeFio();
        System.out.println("--------------------");

        System.out.println(minSalary(2));
        System.out.println("--------------------");

        indexSalary(0.2);
        System.out.println("--------------------");

        printEmployees();
        System.out.println("--------------------");

        System.out.println(maxSalary(1));
        System.out.println("--------------------");

        System.out.println(minSalary(2));
        System.out.println("--------------------");

        System.out.println(sumSalary(2));
        System.out.println("--------------------");

        print(5);
        System.out.println("--------------------");

        printSalLess(1000);
        System.out.println("--------------------");
        printSalGTE(74124);
        System.out.println("--------------------");
        System.out.println(averegeSalary(3));


    }
    private static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    private static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static int sumSalary(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static Employee minSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    private static Employee minSalary(int department) {
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

    private static Employee maxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    private static Employee maxSalary(int department) {
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

    private static double averegeSalary() {
        return (double) sumSalary() / employees.length;
    }

    private static double averegeSalary(int deparment) {
        var sum = sumSalary(deparment);
        var count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == deparment) {
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    public static void printEmployeeFio() {
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName());
        }
    }

    private static void indexSalary(double percent) {
        for (Employee employee : employees) {
            int newSalary = (int) (employee.getSalary() * (1 + percent));
            employee.setSalary(newSalary);
        }
    }

    private static void indexSalary(double percent, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                int newSalary = (int) (employee.getSalary() * (1 + percent));
                employee.setSalary(newSalary);

            }
        }
    }

    private static void print(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getId() + " " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + ",  Зарплата=" + employee.getSalary());
            }
        }
    }

    private static void printSalLess(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee.inf());
            }
        }
    }
    private static void printSalGTE(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() > salary) {
                System.out.println(employee.inf());
            }
        }
    }
}