package data;

import items.*;

public class ItemTest5DAO extends ItemDAO {

    // Array with test items
    private LibraryItem[] libraryItems = {
            new MonthlyMagazine("Test Monthly B", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 4, "Test Appearance"),
            new WeeklyMagazine("Test Weekly A", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 13),
            new BoardGame("Test Board Game C", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "2-6",
                    "0123456789876", "John Designer"),
            new BoardGame("Test Board Game A", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "2-6",
                    "0123456789876", "John Designer")
    };

    @Override
    public LibraryItem[] getAllItems() {
        return libraryItems.clone();
    }
}