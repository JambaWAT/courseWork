public class Main2 {
    public static void main(String[] args){
        EmployeeBook book = new EmployeeBook(10);
        book.add (new Employee("Bilbo1", "Beggins", "Robber", 1000, 1));
        book.add (new Employee("Frodo2", "Beggins", "Robber", 70000, 2));
        book.add (new Employee("marko3", "Beggins", "Robber", 103210, 4));
        book.add (new Employee("polo4", "Beggins", "Robber", 134000, 3));
        book.add (new Employee("Frin5", "Beggins", "Robber", 440, 5));
        book.add (new Employee("mixe6", "Beggins", "Robber", 1220000, 2));
        book.add (new Employee("fruze7", "Beggins", "Robber", 766000, 1));
        book.add (new Employee("gazuze8", "Beggins", "Robber", 74124, 2));
        book.add (new Employee("garuze9", "Beggins", "Robber", 74236000, 3));
        book.add (new Employee("grfeg10", "Beggins", "Robber", 7633000, 5));
        book.printByDep();
        System.out.println("---------------------");
        book.sumSalary();
        System.out.println("---------------------");
        book.maxSalary();
        System.out.println("---------------------");

        book.del(1);
        System.out.println("---------------------");

        book.printEmployees();
        System.out.println("---------------------");
        book.add(new Employee("name1", "middle", "last", 341242, 5));
        System.out.println("---------------------");
        book.printEmployees();
    }
}
