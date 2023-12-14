package data;

import items.*;

public class ItemTest2DAO implements ItemDAO {

    // Array with test items
    private LibraryItem[] libraryItems = {
            new Book("Test Book G", "Test Publishing", "22/4/2007",
                    "Adventure", 12, "John Tester",
                    "John Editor", "ISBN 012-3-45-678987-6"),
            new Book("Test Book H", "Test Publishing", "22/4/2007",
                    "Adventure", 12, "John Tester",
                    "John Editor", "ISBN 012-3-45-678987-6"),
            new Book("Test Book I", "Test Publishing", "22/4/2007",
                    "Adventure", 12, "John Tester",
                    "John Editor", "ISBN 012-3-45-678987-6"),

            new BoardGame("Test Board Game G", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "2-6",
                    "0123456789876", "John Designer"),
            new BoardGame("Test Board Game H", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "2-6",
                    "0123456789876", "John Designer"),
            new BoardGame("Test Board Game I", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "2-6",
                    "0123456789876", "John Designer"),

            new VideoGame("Test Video Game G", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "1-4",
                    "0123456789876", "Test Studio"),
            new VideoGame("Test Video Game H", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "1-4",
                    "0123456789876", "Test Studio"),
            new VideoGame("Test Video Game I", "Test Publishing",
                    "22/4/2007", "Adventure", 12, "1-4",
                    "0123456789876", "Test Studio"),

            new MonthlyMagazine("Test Monthly G", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 4, "Test Appearance"),
            new MonthlyMagazine("Test Monthly H", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 4, "Test Appearance"),
            new MonthlyMagazine("Test Monthly I", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 4, "Test Appearance"),

            new WeeklyMagazine("Test Weekly G", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 13),
            new WeeklyMagazine("Test Weekly H", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 13),
            new WeeklyMagazine("Test Weekly I", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 13),

            new DailyMagazine("Test Daily G", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 112),
            new DailyMagazine("Test Daily H", "Test Publishing",
                    "22/4/2007", "Science", 12, "John Editor",
                    "ISSN 0123-456X", 112),
    };

    @Override
    public LibraryItem[] getAllItems() {
        return libraryItems.clone();
    }
}

