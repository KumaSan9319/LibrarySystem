package data;

import items.*;

public class ItemTest3DAO extends ItemDAO {

    // Array with test items
    private LibraryItem[] libraryItems = {
            new Book("Test Book J", "Test Publishing", "22/4/2007",
                    "Adventure", 12, "John Tester",
                    "John Editor", "ISBN 012-3-45-678987-6"),
            new Book("Test Book K", "Test Publishing", "22/4/2007",
                    "Adventure", 12, "John Tester",
                    "John Editor", "ISBN 012-3-45-678987-6"),

            new BoardGame("Test Board Game J", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "2-6",
                    "0123456789876", "John Designer"),
            new BoardGame("Test Board Game K", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "2-6",
                    "0123456789876", "John Designer"),

            new VideoGame("Test Video Game J", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "1-4",
                    "0123456789876", "Test Studio"),
            new VideoGame("Test Video Game K", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "1-4",
                    "0123456789876", "Test Studio"),

            new MonthlyMagazine("Test Monthly J", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 4, "Test Appearance"),
            new MonthlyMagazine("Test Monthly K", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 4, "Test Appearance"),

            new WeeklyMagazine("Test Weekly J", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 13),
            new WeeklyMagazine("Test Weekly K", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 13),

            new DailyMagazine("Test Daily J", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 112),
            new DailyMagazine("Test Daily K", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 112),
    };

    @Override
    public LibraryItem[] getAllItems() {
        return libraryItems.clone();
    }
}


