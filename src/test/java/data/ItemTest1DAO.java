package data;

import items.*;

public class ItemTest1DAO extends ItemDAO {

        // Array with test items
        private LibraryItem[] libraryItems = {
                new Book("Test Book D", "Test Publishing", "22/4/2007",
                        "Adventure", 12, "John Tester",
                        "John Editor", "ISBN 012-3-45-678987-6"),
                new Book("Test Book E", "Test Publishing", "22/4/2007",
                        "Adventure", 12, "John Tester",
                        "John Editor", "ISBN 012-3-45-678987-6"),
                new Book("Test Book F", "Test Publishing", "22/4/2007",
                        "Adventure", 12, "John Tester",
                        "John Editor", "ISBN 012-3-45-678987-6"),

                new BoardGame("Test Board Game D", "Test Publishing",
                        "22/4/2007", "Adventure", 12, "2-6",
                        "0123456789876", "John Designer"),
                new BoardGame("Test Board Game E", "Test Publishing",
                        "22/4/2007", "Adventure", 12, "2-6",
                        "0123456789876", "John Designer"),
                new BoardGame("Test Board Game F", "Test Publishing",
                        "22/4/2007", "Adventure", 12, "2-6",
                        "0123456789876", "John Designer"),

                new VideoGame("Test Video Game D", "Test Publishing",
                        "22/4/2007", "Adventure", 12, "1-4",
                        "0123456789876", "Test Studio"),
                new VideoGame("Test Video Game E", "Test Publishing",
                        "22/4/2007", "Adventure", 12, "1-4",
                        "0123456789876", "Test Studio"),
                new VideoGame("Test Video Game F", "Test Publishing",
                        "22/4/2007", "Adventure", 12, "1-4",
                        "0123456789876", "Test Studio"),

                new MonthlyMagazine("Test Monthly D", "Test Publishing",
                        "22/4/2007", "Science", 12, "John Editor",
                        "ISSN 0123-456X", 4, "Test Appearance"),
                new MonthlyMagazine("Test Monthly E", "Test Publishing",
                        "22/4/2007", "Science", 12, "John Editor",
                        "ISSN 0123-456X", 4, "Test Appearance"),
                new MonthlyMagazine("Test Monthly F", "Test Publishing",
                        "22/4/2007", "Science", 12, "John Editor",
                        "ISSN 0123-456X", 4, "Test Appearance"),

                new WeeklyMagazine("Test Weekly D", "Test Publishing",
                        "22/4/2007", "Science", 12, "John Editor",
                        "ISSN 0123-456X", 13),
                new WeeklyMagazine("Test Weekly E", "Test Publishing",
                        "22/4/2007", "Science", 12, "John Editor",
                        "ISSN 0123-456X", 13),
                new WeeklyMagazine("Test Weekly F", "Test Publishing",
                        "22/4/2007", "Science", 12, "John Editor",
                        "ISSN 0123-456X", 13),

                new DailyMagazine("Test Daily D", "Test Publishing",
                        "22/4/2007", "Science", 12, "John Editor",
                        "ISSN 0123-456X", 112),
                new DailyMagazine("Test Daily E", "Test Publishing",
                        "22/4/2007", "Science", 12, "John Editor",
                        "ISSN 0123-456X", 112),
                new DailyMagazine("Test Daily F", "Test Publishing",
                        "22/4/2007", "Science", 12, "John Editor",
                        "ISSN 0123-456X", 112)
        };

        @Override
        public LibraryItem[] getAllItems() {
            return libraryItems.clone();
        }
}

