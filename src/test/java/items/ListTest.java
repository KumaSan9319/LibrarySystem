package items;

import org.junit.jupiter.api.Test;

public class ListTest {

    @Test
    void listPrintTest() {

        // creating an array to use for testing
        LibraryItem[] list = {new Book("Test Book D", "Test Publishing", "22/4/2007",
                "Adventure", 12, "John Tester",
                "John Editor", "ISBN 012-3-45-678987-6"),
                new Book("Test Book E", "Test Publishing", "22/4/2007",
                        "Adventure", 12, "John Tester",
                        "John Editor", "ISBN 012-3-45-678987-6"),
                new Book("Test Book F", "Test Publishing", "22/4/2007",
                        "Adventure", 12, "John Tester",
                        "John Editor", "ISBN 012-3-45-678987-6")
        };

        // check the output
        List.show(list);
    }

}
