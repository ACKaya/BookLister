public class Book {
    private String bookNam;
    private int pageNumber;
    private String authorName;
    private int releaseDate;

    public Book(String bookNam, int pageNumber, String authorName, int releaseDate) {
        this.bookNam = bookNam;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getBookNam() {
        return bookNam;
    }

    public void setBookNam(String bookNam) {
        this.bookNam = bookNam;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
