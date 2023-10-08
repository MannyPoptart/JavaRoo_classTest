import java.util.ArrayList;

public class Methods {
    private ArrayList<String> nameList = new ArrayList<>();

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

    // helper method to check if name is valid
    private boolean isNameValid(String name) {
        return name != null && !name.isEmpty();
        
    }

}
