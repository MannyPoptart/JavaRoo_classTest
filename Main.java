import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Methods methods = new Methods();
        
        // need to add a 5th option choice that allows us to view the contents of a specify class
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Add a Class");
            System.out.println("2. Rename a Class");
            System.out.println("3. Delete a Class");
            System.out.println("4. View Existing Classes and its Contents");
            System.out.println("5. View the Contents of a Specific Class");
            System.out.println("6. Add a new relationship between two classes");
            System.out.println("7. Delete a relationship between two classes");
            System.out.println("8. View all relationships between classes");
            System.out.println("9. View all relationships of a specific class");
            System.out.println("10. Exit");
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
                    System.out.print("Enter a class name to view its contents: ");
                    String viewName = sc.nextLine();
                    methods.viewContents(viewName);
                    break;
                case 6:
                    System.out.print("Enter the first class name: ");
                    String firstClass = sc.nextLine();
                    System.out.print("Enter the second class name: ");
                    String secondClass = sc.nextLine();
                    methods.addRelationship(firstClass, secondClass);
                    break;
                case 7:
                    System.out.print("Enter the first class name: ");
                    String firstClassDelete = sc.nextLine();
                    System.out.print("Enter the second class name: ");
                    String secondClassDelete = sc.nextLine();
                    methods.deleteRelationship(firstClassDelete, secondClassDelete);
                    break;
                case 8:
                    System.out.println("Here are all relationships: ");
                    methods.viewRelationships();
                    break;
                case 9:
                    System.out.print("Enter a class name to view its relationships: ");
                    String viewRelationships = sc.nextLine();
                    methods.viewAllRelationships(viewRelationships);
                    break;
                case 10:
                System.out.println("Exiting... HAVE A NICE DAY!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    }

}