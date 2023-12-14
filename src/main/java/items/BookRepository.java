package items;

import data.ItemDAO;

import java.util.Arrays;

public class BookRepository extends Repository {

    public BookRepository(ItemDAO itemDAO) {
        super(itemDAO);
    }

    // return all items of type book
    @Override
    public Book[] getAllItems() {
        // zet de items array om naar een stream
        return Arrays.stream(this.getItemDAO()
                .getAllItems())
                .filter(item -> item instanceof Book)
                .toArray(Book[]::new);
    }

}
