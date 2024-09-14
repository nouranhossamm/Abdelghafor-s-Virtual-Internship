# Abdelghafor's Virtual Internship

## Task 4: Library Management System
### Introduction
---------------

Welcome to the Library Management System, a software system designed to automate the tasks involved in managing a library's book inventory and its members.

### Purpose and Concept
-----------------------

The goal is to create a software system that makes it easy for librarians to track and manage books and for members to borrow and return them efficiently. This project serves as an introduction to fundamental OOP principles, such as encapsulation, inheritance, and abstraction.

### Main Features
-----------------

* Book Management
    + Add Books: Create new entries for books, including details like title, author, ISBN, and publication date.
    + Update Books: Modify existing book details, such as correcting errors or updating availability status.
    + Delete Books: Remove books from the catalog when they are no longer available or needed.
* Member Management
    + Register Members: Add new library members with personal details such as name, membership ID, and contact information.
    + Update Member Information: Edit member profiles, including contact details and membership status.
    + Track Borrowing History: Maintain a record of all books borrowed by each member, including due dates and overdue fines.
* Borrowing and Returning Books
    + Borrow Books: Allow members to borrow books, updating their status to ‘checked out’ and recording the borrowing date.
    + Return Books: Process the return of books, updating their status to ‘available’ and calculating any overdue fines if applicable.

### UML Diagram
---------------

```markdown

**Library Management System UML Class Diagram**
=====================================================

    +--------------------+
    |    Library         |
    +--------------------+
    | - bookList         |
    | - memberList       |
    | + addBook()        |
    | + removeBook()     |
    | + registerMember() |
    | + borrowBook()     |
    | + returnBook()     |
    +--------------------+
       |             |
       | 1..*        | 1..*
       |             |
       v             v
+---------------+   +----------------+
|      Book     |   |     Member     |
+---------------+   +----------------+
| - title       |   | - name         |
| - author      |   | - membershipID |
| - ISBN        |   | - contactInfo  |
| - publication |   | - borrowedBooks|
| - status      |   |                |
+---------------+   +----------------+
                         |
                         | 0..*
                         |
                         v
                    +---------------+
                    |  BorrowedBook |
                    +---------------+
                    | - book        |
                    | - borrowDate  |
                    | - dueDate     |
                    | - fine        |
                    +---------------+