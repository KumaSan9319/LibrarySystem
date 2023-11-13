package items;

public abstract class Magazine extends LibraryItem {

    protected String copyEditor;
    protected String issn;

    public Magazine(String title, String publisher, String publicationDate, String genre,
                    int ageRating, String copyEditor, String issn) {
        super(title, publisher, publicationDate, genre, ageRating);
        this.copyEditor = copyEditor;
        this.issn = issn;
    }

}
