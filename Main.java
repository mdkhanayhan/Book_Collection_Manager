import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static int readInt(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number.");
            }
        }
    }

    static String readStr(String msg) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            if (!s.isEmpty()) return s;
            System.out.println("This field cannot be empty.");
        }
    }

    static int readYear() {
        while (true) {
            int y = readInt("Year: ");
            if (y >= 1000 && y <= 2026) return y;
            System.out.println("Year must be between 1000 and 2026.");
        }
    }

    static void menu() {
        System.out.println("\n===== BOOK COLLECTION MANAGER =====");
        System.out.println("1. Add Book");
        System.out.println("2. Display All Books");
        System.out.println("3. Search by Title (Linear Search)");
        System.out.println("4. Search by Author (Linear Search)");
        System.out.println("5. Search by ID (Binary Search)");
        System.out.println("6. Sort by Title (Bubble Sort)");
        System.out.println("7. Sort by Author (Selection Sort)");
        System.out.println("8. Sort by Year (Insertion Sort)");
        System.out.println("9. Delete Book");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {
        BookManager m = new BookManager();
        m.add("Wings of Fire", "A.P.J. Abdul Kalam", 1999);
        m.add("The Alchemist", "Paulo Coelho", 1988);
        m.add("Clean Code", "Robert C. Martin", 2008);
        m.add("Introduction to Algorithms", "Thomas H. Cormen", 1990);
        m.add("Godan", "Munshi Premchand", 1936);

        int ch;
        do {
            menu();
            ch = readInt("Enter choice: ");
            switch (ch) {
                case 1:
                    String t = readStr("Title: ");
                    String a = readStr("Author: ");
                    int y = readYear();
                    System.out.println("Book added with ID " + m.add(t, a, y));
                    break;
                case 2:
                    m.show(m.books);
                    break;
                case 3:
                    m.show(m.searchTitle(readStr("Enter title keyword: ")));
                    break;
                case 4:
                    m.show(m.searchAuthor(readStr("Enter author keyword: ")));
                    break;
                case 5:
                    Book b = m.searchId(readInt("Enter ID: "));
                    if (b == null) System.out.println("Book not found.");
                    else {
                        System.out.println("Book found:");
                        System.out.println(b);
                    }
                    break;
                case 6:
                    m.bubbleSortTitle();
                    System.out.println("Sorted by title:");
                    m.show(m.books);
                    break;
                case 7:
                    m.selectionSortAuthor();
                    System.out.println("Sorted by author:");
                    m.show(m.books);
                    break;
                case 8:
                    m.insertionSortYear();
                    System.out.println("Sorted by year:");
                    m.show(m.books);
                    break;
                case 9:
                    if (m.delete(readInt("Enter ID to delete: "))) System.out.println("Book removed.");
                    else System.out.println("Book not found.");
                    break;
                case 0:
                    System.out.println("Thank you. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 0 to 9.");
            }
        } while (ch != 0);
    }
}
