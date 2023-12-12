package items;

public class List {

    // Method for printing the contents of LibraryItem lists to the console
    public static void show(LibraryItem[] list) {
        for (LibraryItem item : list) {
            System.out.println(item.getOverviewItemText());
        }
    }

}
