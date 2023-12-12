import items.*;

public class Main {

    public static void main(String[] args) {

        // Creating test objects
        Book testBookA = new Book("Test Book A", "Test Publishing", "22/4/2007",
                "Adventure", 12, "John Tester",
                "John Editor", "ISBN 012-3-45-678987-6");

        Book testBookB = new Book("Test Book B", "Test Publishing", "22/4/2007",
                "Adventure", 12, "John Tester",
                "John Editor", "ISBN 012-3-45-678987-6");

        Book testBookC = new Book("Test Book C", "Test Publishing", "22/4/2007",
                "Adventure", 12, "John Tester",
                "John Editor", "ISBN 012-3-45-678987-6");



        BoardGame testBoardGameA = new BoardGame("Test Board Game A", "Test Publishing",
                "22/4/2007", "Adventure", 12, "2-6",
                "0123456789876", "John Designer");

        BoardGame testBoardGameB = new BoardGame("Test Board Game B", "Test Publishing",
                "22/4/2007", "Adventure", 12, "2-6",
                "0123456789876", "John Designer");

        BoardGame testBoardGameC = new BoardGame("Test Board Game C", "Test Publishing",
                "22/4/2007", "Adventure", 12, "2-6",
                "0123456789876", "John Designer");



        VideoGame testVideoGameA = new VideoGame("Test Video Game A", "Test Publishing",
                "22/4/2007", "Adventure", 12, "1-4",
                "0123456789876", "Test Studio");

        VideoGame testVideoGameB = new VideoGame("Test Video Game B", "Test Publishing",
                "22/4/2007", "Adventure", 12, "1-4",
                "0123456789876", "Test Studio");

        VideoGame testVideoGameC = new VideoGame("Test Video Game C", "Test Publishing",
                "22/4/2007", "Adventure", 12, "1-4",
                "0123456789876", "Test Studio");



        MonthlyMagazine testMonthlyMagazineA = new MonthlyMagazine("Test Monthly A", "Test Publishing",
                "22/4/2007", "Science", 12, "John Editor",
                "ISSN 0123-456X", 4, "Test Appearance");

        MonthlyMagazine testMonthlyMagazineB = new MonthlyMagazine("Test Monthly B", "Test Publishing",
                "22/4/2007", "Science", 12, "John Editor",
                "ISSN 0123-456X", 4, "Test Appearance");

        MonthlyMagazine testMonthlyMagazineC = new MonthlyMagazine("Test Monthly C", "Test Publishing",
                "22/4/2007", "Science", 12, "John Editor",
                "ISSN 0123-456X", 4, "Test Appearance");



        WeeklyMagazine testWeeklyMagazineA = new WeeklyMagazine("Test Weekly A", "Test Publishing",
                "22/4/2007", "Science", 12, "John Editor",
                "ISSN 0123-456X", 13);

        WeeklyMagazine testWeeklyMagazineB = new WeeklyMagazine("Test Weekly B", "Test Publishing",
                "22/4/2007", "Science", 12, "John Editor",
                "ISSN 0123-456X", 13);

        WeeklyMagazine testWeeklyMagazineC = new WeeklyMagazine("Test Weekly C", "Test Publishing",
                "22/4/2007", "Science", 12, "John Editor",
                "ISSN 0123-456X", 13);



        DailyMagazine testDailyMagazineA = new DailyMagazine("Test Daily A", "Test Publishing",
                "22/4/2007", "Science", 12, "John Editor",
                "ISSN 0123-456X", 112);

        DailyMagazine testDailyMagazineB = new DailyMagazine("Test Daily B", "Test Publishing",
                "22/4/2007", "Science", 12, "John Editor",
                "ISSN 0123-456X", 112);

        DailyMagazine testDailyMagazineC = new DailyMagazine("Test Daily C", "Test Publishing",
                "22/4/2007", "Science", 12, "John Editor",
                "ISSN 0123-456X", 112);



        // Adding all created library items to an array
        LibraryItem[] items = {testBookA, testBookB, testBookC, testBoardGameA, testBoardGameB, testBoardGameC,
                                testVideoGameA, testVideoGameB, testVideoGameC, testMonthlyMagazineA,
                                testMonthlyMagazineB, testMonthlyMagazineC, testWeeklyMagazineA, testWeeklyMagazineB,
                                testWeeklyMagazineC, testDailyMagazineA, testDailyMagazineB, testDailyMagazineC};

    }

}
