package items;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryItemTest {

    // several quick tests to see if LibraryItem.getType() returns the correct values
    @Test
    void getTypeTest() {
        // Type = "Book"
        Book testBookA = new Book("Test Book A", "Test Publishing", "22/4/2007",
                "Adventure", 12, "John Tester",
                "John Editor", "ISBN 012-3-45-678987-6");

        Assertions.assertEquals("Book", testBookA.getType());

        // Type = "BoardGame"
        BoardGame testBoardGameA = new BoardGame("Test Board Game A", "Test Publishing",
                "22/4/2007", "Adventure", 12, "2-6",
                "0123456789876", "John Designer");

        Assertions.assertEquals("BoardGame", testBoardGameA.getType());

        // Type = "DailyMagazine"
        DailyMagazine testDailyMagazineA = new DailyMagazine("Test Daily A", "Test Publishing",
                "22/4/2007", "Science", 12, "John Editor",
                "ISSN 0123-456X", 112);

        Assertions.assertEquals("DailyMagazine", testDailyMagazineA.getType());
    }

}
