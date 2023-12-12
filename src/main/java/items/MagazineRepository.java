package items;

import data.ItemDAO;

import java.util.Arrays;

public class MagazineRepository extends ItemRepository {

    public MagazineRepository(ItemDAO itemDAO) {
        super(itemDAO);
    }

    // return all items of type book
    @Override
    public Magazine[] getAllItems() {
        // zet de items array om naar een stream
        return Arrays.stream(this.getItemDAO()
                .getAllItems())
                .filter(item -> item instanceof Magazine)
                .toArray(Magazine[]::new);
    }

}
