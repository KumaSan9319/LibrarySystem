package items;

import data.ItemDAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ItemRepository {

    private ItemDAO itemDAO;

    public ItemRepository(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }

    public ItemDAO getItemDAO() {
        return itemDAO;
    }

    // returns all library items
    public LibraryItem[] getAllItems() {
        return itemDAO.getAllItems();
    }

    // using separate lines because it didn't work when I tried to put it together in one
    // sorting all items in the repository by title
    public LibraryItem[] getItemsSortedByTitle() {
        LibraryItem[] itemList = itemDAO.getAllItems();
        Arrays.sort(itemList, Comparator.comparing(LibraryItem::getTitle));
        return itemList.clone();
    }

    // sorting all items in the repository by type and then by title
    public LibraryItem[] getItemsSortedByType() {
        LibraryItem[] itemList = itemDAO.getAllItems();
        Arrays.sort(itemList, Comparator.comparing(LibraryItem::getType).thenComparing(LibraryItem::getTitle));
        return itemList.clone();
    }

    // applying a search input to the repository and returning all items that matched the search
    // adding search results returning true to an arraylist and then converting the list to a regular array to return it
    public LibraryItem[] searchItems(String search) {
        LibraryItem[] itemList = itemDAO.getAllItems();
        ArrayList<LibraryItem> results = new ArrayList<LibraryItem>();

        for (LibraryItem item : itemList) {
            if (item.matchesSearch(search)) results.add(item);
        }

        return results.toArray(new LibraryItem[0]);
    }

}
