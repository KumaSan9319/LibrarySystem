package items;

import data.ItemDAO;

import java.util.Arrays;

public class VideoGameRepository extends Repository {

    public VideoGameRepository(ItemDAO itemDAO) {
        super(itemDAO);
    }

    // return all items of type book
    @Override
    public VideoGame[] getAllItems() {
        // zet de items array om naar een stream
        return Arrays.stream(this.getItemDAO()
                .getAllItems())
                .filter(item -> item instanceof VideoGame)
                .toArray(VideoGame[]::new);
    }

}
