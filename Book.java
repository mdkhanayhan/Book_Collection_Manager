public class Book {
    int id, year;
    String title, author;

    Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return String.format("%-5d %-28s %-22s %d", id, title, author, year);
    }
}
