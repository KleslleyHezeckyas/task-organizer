package application;

import java.util.ArrayList;
import java.util.Scanner;
import entities.Task;

public class TaskController {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== TASK MANAGEMENT SYSTEM ===");
            System.out.println("1. Add task");
            System.out.println("2. List tasks");
            System.out.println("3. Complete task");
            System.out.println("4. Remove task");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Task description: ");
                    String desc = sc.nextLine();
                    tasks.add(new Task(desc));
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.println("\n=== TASK LIST ===");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks registered.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Task number to complete: ");
                    int numConcluir = sc.nextInt() - 1;
                    if (numConcluir >= 0 && numConcluir < tasks.size()) {
                        tasks.get(numConcluir).complete();
                        System.out.println("Task marked as completed!");
                    } else {
                        System.out.println("Invalid task!");
                    }
                    break;

                case 4:
                    System.out.print("Task number to remove: ");
                    int numRemover = sc.nextInt() - 1;
                    if (numRemover >= 0 && numRemover < tasks.size()) {
                        tasks.remove(numRemover);
                        System.out.println("Task removed!");
                    } else {
                        System.out.println("Invalid task!");
                    }
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }

        } while (opcao != 0);
        sc.close();
    }
}