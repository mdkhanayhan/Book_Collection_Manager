# 📚 Book Collection Manager

A menu-driven Java console application that manages a personal book collection using an **ArrayList**, with **sorting** and **searching** algorithms written from scratch.

Built as a **Data Structures and Algorithms (DSA)** project at Rungta International Skills University, Bhilai.

---

## Features

| # | Option | Technique |
|---|--------|-----------|
| 1 | Add a book | `ArrayList.add()` |
| 2 | Display all books | Traversal |
| 3 | Search by title | Linear search (partial, case-insensitive) |
| 4 | Search by author | Linear search (partial, case-insensitive) |
| 5 | Search by ID | Binary search |
| 6 | Sort by title | Bubble sort |
| 7 | Sort by author | Selection sort |
| 8 | Sort by year | Insertion sort |
| 9 | Delete a book by ID | Linear scan + `ArrayList.remove()` |
| 0 | Exit | |

Five sample books are loaded when the program starts so every feature can be tried right away.

## Concepts Used

- `ArrayList<Book>` to store the collection
- Classes and objects (`Book`, `BookManager`, `Main`)
- Bubble, selection and insertion sort (no `Collections.sort`)
- Linear search and binary search
- Input validation and exception handling (`NumberFormatException`)

## Project Structure

```
BookCollectionManager/
├── src/
│   ├── Book.java          # Book data (id, title, author, year)
│   ├── BookManager.java   # ArrayList, add, delete, search, sort
│   └── Main.java          # Menu and user input
├── README.md
└── SYNOPSIS.md
```

## How to Run

**Requirements:** JDK 8 or above.

```bash
cd src
javac *.java
java Main
```

## Sample Output

```
===== BOOK COLLECTION MANAGER =====
1. Add Book
2. Display All Books
3. Search by Title (Linear Search)
4. Search by Author (Linear Search)
5. Search by ID (Binary Search)
6. Sort by Title (Bubble Sort)
7. Sort by Author (Selection Sort)
8. Sort by Year (Insertion Sort)
9. Delete Book
0. Exit
Enter choice: 8
Sorted by year:
ID    Title                        Author                 Year
5     Godan                        Munshi Premchand       1936
2     The Alchemist                Paulo Coelho           1988
4     Introduction to Algorithms   Thomas H. Cormen       1990
1     Wings of Fire                A.P.J. Abdul Kalam     1999
3     Clean Code                   Robert C. Martin       2008
```

## Time Complexity

| Operation | Time |
|-----------|------|
| Add book (insert at end) | O(1) amortized |
| Display all | O(n) |
| Linear search | O(n) |
| Binary search (search step) | O(log n) |
| Bubble sort | O(n²), O(n) if already sorted |
| Selection sort | O(n²) |
| Insertion sort | O(n²), O(n) if already sorted |
| Delete | O(n) |

`n` = number of books. Space required is O(n).

> **Note:** Binary search needs sorted data, so the list is sorted by ID before the search. Since IDs are assigned in increasing order, this is quick unless the list was re-sorted by another field.

## Input Validation

- Title and author cannot be empty
- Year must be a number from 1000 to 2026
- Menu choice must be a number from 0 to 9
- A book must exist with the given ID to be deleted

## Future Scope

- Save and load books using file handling
- Search by year or genre
- Issue and return tracking
- GUI using Java Swing
- Database integration (MySQL)

## Author

**Mohammad Ayhan Khan**
B.Tech Computer Science & Engineering, Rungta International Skills University, Bhilai
ERP ID: RU-25-10829
