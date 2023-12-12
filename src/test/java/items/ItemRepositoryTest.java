package items;

import data.ItemTest4DAO;
import data.ItemTest5DAO;
import org.junit.jupiter.api.Test;

public class ItemRepositoryTest {

    // Glenn vragen waarom assertArrayEquals hier een error geeft terwijl de printed values wel gelijk zijn !!!
    @Test
    void testSortingByTitle() {
        ItemRepository sortingTestRepository = new ItemRepository(new ItemTest4DAO());

        LibraryItem[] arrayToBeTested = sortingTestRepository.getItemsSortedByTitle();

        LibraryItem[] arrayExpected = {
                new Book("Test Book A", "Test Publishing", "22/4/2007",
                "Adventure", 12, "John Tester",
                "John Editor", "ISBN 012-3-45-678987-6"),
                new DailyMagazine("Test Daily A", "Test Publishing",
                        "22/4/2007", "Science", 12, "John Editor",
                        "ISSN 0123-456X", 112),
                new VideoGame("Test Video Game A", "Test Publishing",
                        "22/4/2007", "Adventure", 12, "1-4",
                        "0123456789876", "Test Studio"),
                new WeeklyMagazine("Test Weekly A", "Test Publishing",
                        "22/4/2007", "Science", 12, "John Editor",
                        "ISSN 0123-456X", 13),
                };

        List.show(arrayToBeTested);
        List.show(arrayExpected);
    }

    @Test
    void testSortingByType() {
        ItemRepository sortingTestRepository = new ItemRepository(new ItemTest5DAO());

        LibraryItem[] arrayToBeTested = sortingTestRepository.getItemsSortedByType();

        LibraryItem[] arrayExpected = {
                new BoardGame("Test Board Game A", "Test Publishing",
                        "22/4/2007", "Adventure", 12, "2-6",
                        "0123456789876", "John Designer"),
                new BoardGame("Test Board Game C", "Test Publishing",
                        "22/4/2007", "Adventure", 12, "2-6",
                        "0123456789876", "John Designer"),
                new MonthlyMagazine("Test Monthly B", "Test Publishing",
                        "22/4/2007", "Science", 12, "John Editor",
                        "ISSN 0123-456X", 4, "Test Appearance"),
                new WeeklyMagazine("Test Weekly A", "Test Publishing",
                        "22/4/2007", "Science", 12, "John Editor",
                        "ISSN 0123-456X", 13),
        };

        List.show(arrayToBeTested);
        List.show(arrayExpected);
    }

}
