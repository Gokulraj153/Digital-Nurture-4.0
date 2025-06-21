public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();
        taskList.addTask(new Task(1, "Design UI", "Pending"));
        taskList.addTask(new Task(2, "Develop Backend", "In Progress"));
        taskList.addTask(new Task(3, "Write Test Cases", "Completed"));
        System.out.println("\n--- All Tasks ---");
        taskList.displayTasks();
        System.out.println("\n--- Search Task ID 2 ---");
        Task found = taskList.searchTask(2);
        System.out.println(found != null ? found : "Task not found");
        System.out.println("\n--- Delete Task ID 1 ---");
        taskList.deleteTask(1);
        System.out.println("\n--- Tasks After Deletion ---");
        taskList.displayTasks();
    }
}
