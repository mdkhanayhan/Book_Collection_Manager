# Synopsis: Book Collection Manager

**Subject:** Data Structures and Algorithms (DSA)
**Language:** Java (JDK 8 or above)
**Submitted by:** Mohammad Ayhan Khan (ERP ID: RU-25-10829)
**Institution:** Rungta International Skills University, Bhilai, Chhattisgarh
**Session:** 2026–27

---

## 1. Introduction

Libraries and personal collections grow over time, and finding or arranging a particular book by hand becomes slow. The Book Collection Manager is a Java console application that stores books in an `ArrayList` and lets the user add, delete, search and sort them from a simple menu.

## 2. Problem Statement

A growing book list needs a fast and organised way to find a book and to view the collection in a useful order, such as alphabetical by title or by year of publication. This project solves that using basic data structures and algorithms.

## 3. Objectives

- Build a book manager in Java using an `ArrayList`
- Store each book as an object of a `Book` class
- Implement bubble, selection and insertion sort
- Implement linear search and binary search
- Add and delete books while the program runs
- Validate input and handle exceptions
- Compare the algorithms using time complexity

## 4. Scope

**Included:** menu-driven console application; ID, title, author and year for every book; search by title, author and ID; sort by title, author and year; five sample books loaded at start.

**Not included:** GUI, database, file storage, user login and external APIs.

## 5. Data Structure and Algorithms Used

| Item | Used for |
|------|----------|
| `ArrayList<Book>` | Stores the collection |
| Linear search | Search by title and author |
| Binary search | Search by ID (on a list sorted by ID) |
| Bubble sort | Sort by title |
| Selection sort | Sort by author |
| Insertion sort | Sort by year |

## 6. Modules

1. **Book:** holds the id, title, author and year of one book.
2. **BookManager:** holds the `ArrayList` and all operations (add, delete, search, sort, display).
3. **Main:** shows the menu, reads input with `Scanner` and validates it.

## 7. System Requirements

- **Hardware:** Computer or laptop with 2 GB RAM (4 GB recommended)
- **Software:** JDK 8 or above
- **Editor:** VS Code, IntelliJ IDEA or Eclipse
- **Libraries:** Standard Java only (`java.util`)

## 8. Time Complexity

| Operation | Time |
|-----------|------|
| Add | O(1) |
| Display | O(n) |
| Linear search | O(n) |
| Binary search | O(log n) |
| Bubble / Selection / Insertion sort | O(n²) |
| Delete | O(n) |

## 9. Expected Outcome

A working, menu-driven Java program that manages a book collection and shows how an `ArrayList` together with sorting and searching algorithms solves a practical problem.

## 10. Future Scope

File handling to save books between runs, search by year or genre, issue and return tracking, a Swing GUI, and MySQL database integration.

## 11. Conclusion

The project shows how an `ArrayList` can manage a growing collection of objects, and how sorting and searching algorithms written from scratch make that collection easy to organise and query.
