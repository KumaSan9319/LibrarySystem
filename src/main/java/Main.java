import items.*;

public class Main {

    public static void main(String[] args) {
        Book testBook = new Book("Test Book", "Test Publishing", "22/4/2007",
                "Adventure", 12, "John Tester",
                "John Editor", "ISBN 012-3-45-678987-6");

        BoardGame testBoardGame = new BoardGame("Test Board Game", "Test Publishing",
                "22/4/2007", "Adventure", 12, "2-6",
                "0123456789876", "John Designer");

        VideoGame testVideoGame = new VideoGame("Test Video Game", "Test Publishing",
                "22/4/2007", "Adventure", 12, "1-4",
                "0123456789876", "Test Studio");

        MonthlyMagazine testMonthlyMagazine = new MonthlyMagazine("Test Monthly", "Test Publishing",
                "22/4/2007", "Science", 12, "John Editor",
                "ISSN 0123-456X", 4, "Test Appearance");

        WeeklyMagazine testWeeklyMagazine = new WeeklyMagazine("Test Weekly", "Test Publishing",
                "22/4/2007", "Science", 12, "John Editor",
                "ISSN 0123-456X", 13);

        DailyMagazine testDailyMagazine = new DailyMagazine("Test Daily", "Test Publishing",
                "22/4/2007", "Science", 12, "John Editor",
                "ISSN 0123-456X", 112);

        System.out.println(testBook.getOverviewItemText());
        System.out.println(testBoardGame.getOverviewItemText());
        System.out.println(testVideoGame.getOverviewItemText());
        System.out.println(testMonthlyMagazine.getOverviewItemText());
        System.out.println(testWeeklyMagazine.getOverviewItemText());
        System.out.println(testDailyMagazine.getOverviewItemText());
    }

}
