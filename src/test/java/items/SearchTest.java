package items;

import data.ItemTest3DAO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTest {

    @Test
    void testSearchFunctionWithBook() {

        // making an object to test the search function with
        Book testBook = new Book("Test Book A", "Test Publishing", "22/4/2007",
                "Adventure", 12, "John Tester",
                "John Editor", "ISBN 012-3-45-678987-6");

        // multiple tests for different item attributes
        Assertions.assertTrue(testBook.matchesSearch("Test Book A"));
        Assertions.assertTrue(testBook.matchesSearch("Adventure"));
        Assertions.assertFalse(testBook.matchesSearch("John F. Tester"));
        Assertions.assertTrue(testBook.matchesSearch("012"));
    }

    @Test
    void testSearchFunctionWithVideoGame() {

        // making an object to test the search function with
        VideoGame testVideoGame = new VideoGame("Test Video Game A", "Test Publishing",
                "22/4/2007", "Adventure", 12, "1-4",
                "0123456789876", "Test Studio");

        // multiple tests for different item attributes
        Assertions.assertTrue(testVideoGame.matchesSearch("Test Video Game A"));
        Assertions.assertTrue(testVideoGame.matchesSearch("Adventure"));
        Assertions.assertFalse(testVideoGame.matchesSearch("Teststudio"));
        Assertions.assertFalse(testVideoGame.matchesSearch("17"));
    }

    @Test
    void testRepositorySearchFunction() {

        // making a repository to test with
        ItemRepository testRepository = new ItemRepository(new ItemTest3DAO());

        // inputting search terms and showing all the results
        List.show(testRepository.searchItems("Test Daily"));
        List.show(testRepository.searchItems("Science"));
        List.show(testRepository.searchItems("Test Book J"));
        List.show(testRepository.searchItems("Test Studio"));
        List.show(testRepository.searchItems("0123456789876"));


    }

}
