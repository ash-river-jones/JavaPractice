import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {
    static ArrayList<String> list = new ArrayList<String>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    viewList();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while (choice != 4);
    }

    public static void addItem() {
        System.out.print("Enter item to add: ");
        String item = sc.nextLine();
        list.add(item);
        System.out.println(item + " added to list.");
    }

    public static void removeItem() {
        System.out.print("Enter item to remove: ");
        String item = sc.nextLine();
        if (list.contains(item)) {
            list.remove(item);
            System.out.println(item + " removed from list.");
        } else {
            System.out.println("Item not found in list.");
        }
    }

    public static void viewList() {
        System.out.println("To-Do List:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i));
        }
    }
}
