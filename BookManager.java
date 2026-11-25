import java.util.ArrayList;

public class BookManager {
    ArrayList<Book> books = new ArrayList<>();
    int nextId = 1;

    int add(String t, String a, int y) {
        books.add(new Book(nextId, t, a, y));
        return nextId++;
    }

    boolean delete(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id == id) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    void show(ArrayList<Book> l) {
        if (l.isEmpty()) {
            System.out.println("No books found.");
            return;
        }
        System.out.printf("%-5s %-28s %-22s %s%n", "ID", "Title", "Author", "Year");
        for (Book b : l) System.out.println(b);
    }

    ArrayList<Book> searchTitle(String k) {
        ArrayList<Book> r = new ArrayList<>();
        for (Book b : books)
            if (b.title.toLowerCase().contains(k.toLowerCase())) r.add(b);
        return r;
    }

    ArrayList<Book> searchAuthor(String k) {
        ArrayList<Book> r = new ArrayList<>();
        for (Book b : books)
            if (b.author.toLowerCase().contains(k.toLowerCase())) r.add(b);
        return r;
    }

    Book searchId(int id) {
        insertionSortId();
        int lo = 0, hi = books.size() - 1;
        while (lo <= hi) {
            int m = (lo + hi) / 2;
            int v = books.get(m).id;
            if (v == id) return books.get(m);
            if (v < id) lo = m + 1;
            else hi = m - 1;
        }
        return null;
    }

    void bubbleSortTitle() {
        int n = books.size();
        for (int i = 0; i < n - 1; i++) {
            boolean sw = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (books.get(j).title.compareToIgnoreCase(books.get(j + 1).title) > 0) {
                    Book t = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, t);
                    sw = true;
                }
            }
            if (!sw) break;
        }
    }

    void selectionSortAuthor() {
        int n = books.size();
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (books.get(j).author.compareToIgnoreCase(books.get(min).author) < 0) min = j;
            Book t = books.get(i);
            books.set(i, books.get(min));
            books.set(min, t);
        }
    }

    void insertionSortYear() {
        for (int i = 1; i < books.size(); i++) {
            Book key = books.get(i);
            int j = i - 1;
            while (j >= 0 && books.get(j).year > key.year) {
                books.set(j + 1, books.get(j));
                j--;
            }
            books.set(j + 1, key);
        }
    }

    void insertionSortId() {
        for (int i = 1; i < books.size(); i++) {
            Book key = books.get(i);
            int j = i - 1;
            while (j >= 0 && books.get(j).id > key.id) {
                books.set(j + 1, books.get(j));
                j--;
            }
            books.set(j + 1, key);
        }
    }
}
