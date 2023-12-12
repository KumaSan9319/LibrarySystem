package items;

import data.ItemArrayDAO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpecifiedRepositoryTest {

    // for each test: create a specified repository, then check if the function returns an array of the
    // expected length, then print the handmade toString-esque method to see if the results are correct
    @Test
    void bookRepositoryTest() {
        BookRepository bookRepository = new BookRepository(new ItemArrayDAO());

        Assertions.assertEquals(3, bookRepository.getAllItems().length);

        List.show(bookRepository.getAllItems());
    }

    @Test
    void magazineRepositoryTest() {
        MagazineRepository magazineRepository = new MagazineRepository(new ItemArrayDAO());

        Assertions.assertEquals(3, magazineRepository.getAllItems().length);

        List.show(magazineRepository.getAllItems());
    }

    @Test
    void boardGameRepositoryTest() {
        BoardGameRepository boardGameRepository = new BoardGameRepository(new ItemArrayDAO());

        Assertions.assertEquals(3, boardGameRepository.getAllItems().length);

        List.show(boardGameRepository.getAllItems());
    }

    @Test
    void VideoGameRepositoryTest() {
        VideoGameRepository videoGameRepository = new VideoGameRepository(new ItemArrayDAO());

        Assertions.assertEquals(3, videoGameRepository.getAllItems().length);

        List.show(videoGameRepository.getAllItems());
    }

}
