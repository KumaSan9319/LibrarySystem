package items;

import data.ItemDAO;

public class ItemRepository extends Repository {

    public ItemRepository(ItemDAO itemDAO) {
        super(itemDAO);
    }

    // returns all library items
    public LibraryItem[] getAllItems() {
        return getItemDAO().getAllItems();
    }



}
