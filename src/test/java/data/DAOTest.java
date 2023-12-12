package data;

import items.ItemRepository;
import items.LibraryItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DAOTest {

    @Test
    void testItemTest1DAO() {
        // creating a repository with Test DAO 1
        ItemRepository testRepository1 = new ItemRepository(new ItemTest1DAO());

        // printing content for personal confirmation
        for (LibraryItem item : testRepository1.getAllItems()) {
            System.out.println(item.getOverviewItemText());
        }

        // checking the content
        Assertions.assertEquals(18, testRepository1.getAllItems().length);
    }

    @Test
    void testItemTest2DAO() {
        // creating a repository with Test DAO 2
        ItemRepository testRepository2 = new ItemRepository(new ItemTest2DAO());

        // printing content for personal confirmation
        for (LibraryItem item : testRepository2.getAllItems()) {
            System.out.println(item.getOverviewItemText());
        }

        // checking the content
        Assertions.assertEquals(17, testRepository2.getAllItems().length);
    }

    @Test
    void testItemTest3DAO() {
        // creating a repository with Test DAO 3
        ItemRepository testRepository3 = new ItemRepository(new ItemTest3DAO());

        // printing content for personal confirmation
        for (LibraryItem item : testRepository3.getAllItems()) {
            System.out.println(item.getOverviewItemText());
        }

        // checking the content
        Assertions.assertEquals(12, testRepository3.getAllItems().length);
    }

}
