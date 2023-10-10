import java.util.ArrayList;

public class Methods {
    private ArrayList<String> nameList = new ArrayList<>();
    private ArrayList<String> relationhips = new ArrayList<>();

    public void add(String name) {
        if (!isNameValid(name) || nameList.contains(name)) {
            System.out.println("Invalid or duplicated name.");
        } else {
            nameList.add(name);
            System.out.println("Name added: " + name);
        }
        
    }

    public void rename(String oldName, String newName) {
        if (!isNameValid(newName) || nameList.contains(newName)) {
            System.out.println("Invalid or duplicated name.");
        } 
        else if (!nameList.contains(oldName)) {
            System.out.println("Name not found.");
        } 
        else {
            nameList.set(nameList.indexOf(oldName), newName);
            System.out.println("Name renamed from " + oldName + " to " + newName);
        }

    }

    public void delete(String name) {
        if (!nameList.contains(name)) {
            System.out.println("Name not found.");
        } else {
            nameList.remove(name);
            System.out.println("Name deleted: " + name);
        }

    }

    public void viewList() {
        for (String i : nameList) {
            System.out.println(i);
        }

    }

    // add a method to view a specific class' contents ignoring case

    public void viewContents(String name) {
        if (!nameList.contains(name)) {
            System.out.println("Name not found or typed incorrectly.");
        } else {
            System.out.println("Contents of " + name + ":");
            // add some dummy contents
            System.out.println("Content 1");
            System.out.println("Content 2");
            System.out.println("Content 3");
        }

    }

    

    // helper method to check if name is valid
    private boolean isNameValid(String name) {
        return name != null && !name.isEmpty();
        
    }

    // create a method to add a relationship between two classes using a destination and source class
    public void addRelationship(String source, String destination) {
        if (!nameList.contains(source) || !nameList.contains(destination)) {
            System.out.println("Invalid source or destination class.");
        } else {
            relationhips.add(source + " -> " + destination);
            System.out.println("Relationship added: " + source + " -> " + destination);
        }
    }

    // create a method to delete a relationship between two classes using the helper method swapRelationship
    public void deleteRelationship(String source, String destination) {
        if (!nameList.contains(source) || !nameList.contains(destination)) {
            System.out.println("Invalid source or destination class.");
        } else {
            relationhips.remove(source + " -> " + destination);
            swapRelationship(source, destination);
            System.out.println("Relationship deleted: " + source + " -> " + destination);
        }
    }

    // create a method to view all relationships
    public void viewRelationships() {
        for (String i : relationhips) {
            System.out.println(i);
        }
    }

    // create a method to view all relationships of a specific class
    public void viewAllRelationships(String name) {
        if (!nameList.contains(name)) {
            System.out.println("Name not found or typed incorrectly.");
        } else {
            System.out.println("Relationships of " + name + ":");
            for (String i : relationhips) {
                if (i.contains(name)) {
                    System.out.println(i);
                }
            }
        }
    }

    // add a helper method to deleteRelationship which swaps the 2 classes if the relationship is found in the opposite order
    private void swapRelationship(String source, String destination) {
        if (relationhips.contains(destination + " -> " + source)) {
            relationhips.remove(destination + " -> " + source);
        }
    }


}
