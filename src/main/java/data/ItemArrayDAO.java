package data;

import items.*;

public class ItemArrayDAO extends ItemDAO {

    // Array with test items
    private LibraryItem[] libraryItems = {
            new Book("Test Book A", "Test Publishing", "22/4/2007",
                    "Adventure", 12, "John Tester",
                    "John Editor", "ISBN 012-3-45-678987-6"),
            new Book("Test Book B", "Test Publishing", "22/4/2007",
                    "Adventure", 12, "John Tester",
                    "John Editor", "ISBN 012-3-45-678987-6"),
            new Book("Test Book C", "Test Publishing", "22/4/2007",
                    "Adventure", 12, "John Tester",
                    "John Editor", "ISBN 012-3-45-678987-6"),

            new BoardGame("Test Board Game A", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "2-6",
                    "0123456789876", "John Designer"),
            new BoardGame("Test Board Game B", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "2-6",
                    "0123456789876", "John Designer"),
            new BoardGame("Test Board Game C", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "2-6",
                    "0123456789876", "John Designer"),

            new VideoGame("Test Video Game A", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "1-4",
                    "0123456789876", "Test Studio"),
            new VideoGame("Test Video Game B", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "1-4",
                    "0123456789876", "Test Studio"),
            new VideoGame("Test Video Game C", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "1-4",
                    "0123456789876", "Test Studio"),

            new MonthlyMagazine("Test Monthly A", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 4, "Test Appearance"),
            new MonthlyMagazine("Test Monthly B", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 4, "Test Appearance"),
            new MonthlyMagazine("Test Monthly C", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 4, "Test Appearance"),

            new WeeklyMagazine("Test Weekly A", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 13),
            new WeeklyMagazine("Test Weekly B", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 13),
            new WeeklyMagazine("Test Weekly C", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 13),

            new DailyMagazine("Test Daily A", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 112),
            new DailyMagazine("Test Daily B", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 112),
            new DailyMagazine("Test Daily C", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 112)
    };

    @Override
    public LibraryItem[] getAllItems() {
        return libraryItems.clone();
    }
}
