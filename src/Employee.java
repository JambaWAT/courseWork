public class Employee {
    private static int idCounter = 1;
    private final int id;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private  int salary;
    private int department;

    public Employee(String firstName, String middleName, String lastName, int salary, int department ) {
        this.id = idCounter;
        idCounter++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String inf(){
        return id+" "+lastName+" "+firstName+" "+middleName+",  Зарплата="+ salary;
    }
    public String fio(){
        return firstName + " " + middleName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}



