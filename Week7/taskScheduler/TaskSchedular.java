package Week7.taskScheduler;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskSchedular {

    public static void main(String[] args) {

        ArrayList<Task> taskList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean isEnd = false;

        while (!isEnd) {
            System.out.println("choose an option");
            System.out.println("1. Add task");
            System.out.println("2. Mark task as completed");
            System.out.println("3. Remove task");
            System.out.println("4. Display all task");
            System.out.println("5. Exit");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("enter a task name");
                    String taskName = sc.nextLine();
                    taskList.add(new Task(taskName));
                    System.out.println("task added successfully");
                }

                case 2 -> {
                    System.out.println("enter a task name to mark as complete");
                    String taskname = sc.nextLine();

                    for (Task task : taskList) {
                        if (taskname.equals(task.getName())) {
                            task.markTaskCompleted();
                        }
                    }
                }

                case 3 -> {
                    System.out.println("enter task to remove");
                    String taskName = sc.nextLine();

                    Task taskToRemove = null;

                    for (Task task : taskList) {
                        if (taskName.equals(task.getName())) {
                            taskToRemove = task;
                            break;
                        }
                    }

                    if (taskToRemove != null) {
                        taskList.remove(taskToRemove);
                        System.out.println("task removed successfully");
                    }
                }

                case 4 -> {
                    System.out.println("tasklist:");

                    for (Task task : taskList) {
                        System.out.println("name:" + task.getName() + "\t");
                        System.out.println("name:" + task.getStatus() + "\n");
                    }
                }

                case 5 -> {
                    isEnd = true;
                    System.out.println("Exitting.....");
                }

                default -> System.out.println("not avaibale");
            }
        }

        sc.close();
    }
}