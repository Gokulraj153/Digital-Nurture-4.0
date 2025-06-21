public class TaskLinkedList {
    private TaskNode head;
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added: " + task.getTaskId());
    }
    public Task searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }
    public void deleteTask(int taskId) {
        if (head == null) return;

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            System.out.println("Deleted task ID: " + taskId);
            return;
        }
        TaskNode current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId() == taskId) {
                current.next = current.next.next;
                System.out.println("Deleted task ID: " + taskId);
                return;
            }
            current = current.next;
        }
        System.out.println("Task ID not found: " + taskId);
    }
    public void displayTasks() {
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}