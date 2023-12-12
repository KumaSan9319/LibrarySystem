package data;

import items.*;

public class ItemTest4DAO extends ItemDAO {

    // Array with test items
    private LibraryItem[] libraryItems = {
            new Book("Test Book A", "Test Publishing", "22/4/2007",
                    "Adventure", 12, "John Tester",
                    "John Editor", "ISBN 012-3-45-678987-6"),
            new VideoGame("Test Video Game A", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "1-4",
                    "0123456789876", "Test Studio"),
            new WeeklyMagazine("Test Weekly A", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 13),
            new DailyMagazine("Test Daily A", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 112)
    };

    @Override
    public LibraryItem[] getAllItems() {
        return libraryItems.clone();
    }
}