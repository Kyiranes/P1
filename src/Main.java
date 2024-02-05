import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> menu = new ArrayList<>();
        ArrayList<String> tasks = new ArrayList<>();
        menu.add("(0) Add a task.");
        menu.add("(1) Remove a task.");
        menu.add("(2) Update a task.");
        menu.add("(3) List all tasks.");
        menu.add("(4) End Process");
        while(true) {
            Scanner menuChoice = new Scanner(System.in);
            System.out.println(menu);
            int selection = menuChoice.nextInt();
            menuChoice.nextLine();

            if(selection == 0) {
                addTask(tasks);
            }
            if(selection == 1) {
                removeTask(tasks);
            }
            if(selection == 2) {
                updateTask(tasks);
            }
            if(selection == 3) {
                listTask(tasks);
            }
            if(selection == 4) {
                break;
            }
            else if(selection < 0 || selection > 4) {
                System.out.println("Invalid input.");
            }
        }
    }

    private static void listTask(ArrayList<String> tasks) {
        if(tasks.size() > 0) {
            System.out.println(tasks);

        }
        else {
            System.out.println("No tasks.");
        }
    }

    private static void updateTask(ArrayList<String> tasks) {

        System.out.println(tasks);
        System.out.println("Enter the index of the task to update: ");
        int index = input.nextInt();
        input.nextLine();
        System.out.println("Enter the new task: ");
        tasks.set(index, input.nextLine());
        System.out.println(tasks);

    }

    private static void removeTask(ArrayList<String> tasks) {

        System.out.println(tasks);
        System.out.println("Enter the index of the task to remove: ");
        tasks.remove(input.nextInt());
        input.nextLine();
        System.out.println(tasks);


    }

    public static void addTask(ArrayList<String> tasks) {

        System.out.println("Enter a task: ");
        tasks.add(input.nextLine());

    }
}