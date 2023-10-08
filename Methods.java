import java.util.ArrayList;

public class Methods {
    private ArrayList<String> items = new ArrayList<>();

    public void add(String name) {
        if (!isNameValid(name) || items.contains(name)) {
            System.out.println("Invalid or duplicated name.");
        } else {
            items.add(name);
            System.out.println("Item added: " + name);
        }
    }

    public void rename(String oldName, String newName) {
        if (!isNameValid(newName) || items.contains(newName)) {
            System.out.println("Invalid or duplicated name.");
        } else if (!items.contains(oldName)) {
            System.out.println("Item not found.");
        } else {
            items.set(items.indexOf(oldName), newName);
            System.out.println("Item renamed from " + oldName + " to " + newName);
        }
    }

    public void delete(String name) {
        if (!items.contains(name)) {
            System.out.println("Item not found.");
        } else {
            items.remove(name);
            System.out.println("Item deleted: " + name);
        }
    }

    public void viewList() {
        for (String item : items) {
            System.out.println(item);
        }
    }

    private boolean isNameValid(String name) {
        return name != null && !name.isEmpty();
        
    }
}
