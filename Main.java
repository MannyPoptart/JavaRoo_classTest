import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Methods methods = new Methods();

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Add a Class");
            System.out.println("2. Rename a Class");
            System.out.println("3. Delete a Class");
            System.out.println("4. View List of Excisting Classes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter a class name to add: ");
                    String addName = sc.nextLine();
                    methods.add(addName);
                    break;
                case 2:
                    System.out.print("Enter the current class name: ");
                    String oldName = sc.nextLine();
                    System.out.print("Enter the new class name: ");
                    String newName = sc.nextLine();
                    methods.rename(oldName, newName);
                    break;
                case 3:
                    System.out.print("Enter a class name to delete: ");
                    String deleteName = sc.nextLine();
                    methods.delete(deleteName);
                    break;
                case 4:
                    System.out.println("Classes in the list:");
                    methods.viewList();
                    break;
                case 5:
                System.out.println("Exiting... HAVE A NICE DAY!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    }

}