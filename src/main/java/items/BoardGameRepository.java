package items;

import data.ItemDAO;

import java.util.Arrays;

public class BoardGameRepository extends Repository {

    public BoardGameRepository(ItemDAO itemDAO) {
        super(itemDAO);
    }

    // return all items of type book
    @Override
    public BoardGame[] getAllItems() {
        // zet de items array om naar een stream
        return Arrays.stream(this.getItemDAO()
                .getAllItems())
                .filter(item -> item instanceof BoardGame)
                .toArray(BoardGame[]::new);
    }

}
