public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);
        manager.addEmployee(new Employee(101, "Alice", "Manager", 75000));
        manager.addEmployee(new Employee(102, "Bob", "Engineer", 50000));
        manager.addEmployee(new Employee(103, "Charlie", "HR", 40000));
        System.out.println("\n--- All Employees ---");
        manager.displayAll();
        System.out.println("\n--- Search Employee with ID 102 ---");
        Employee found = manager.searchEmployee(102);
        System.out.println(found != null ? found : "Not found");
        System.out.println("\n--- Delete Employee with ID 101 ---");
        manager.deleteEmployee(101);
        System.out.println("\n--- All Employees After Deletion ---");
        manager.displayAll();
    }
}