package items;

public abstract class Magazine extends LibraryItem implements java.util.Comparator, Searchable {

    // Extended blueprint for more specialized, specifically Magazine, classes
    protected String copyEditor;
    protected String issn;

    public Magazine(String title, String publisher, String publicationDate, String genre,
                    int ageRating, String copyEditor, String issn) {
        super(title, publisher, publicationDate, genre, ageRating);
        this.copyEditor = copyEditor;
        this.issn = issn;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

}
