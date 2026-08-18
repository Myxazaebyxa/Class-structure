public class Book {
    String title;
    String author;
    int releaseYear;
    int pages;

    public Book(String author, int releaseYear, int pages, String title) {
        this.author = author;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.title = title;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return title.contains(word) || author.contains(word);
    }

    public int estimatePrice() {
        int price = 3 * pages;
        return Math.max(price, 250);
    }
}
