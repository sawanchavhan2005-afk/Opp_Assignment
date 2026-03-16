/*
2. Design a Book class (title, author, ISBN) and a Library class that manages
a collection (ArrayList) of Book objects. Implement methods in Library to:
- add a new book
- remove a book by ISBN
- display all available books.
*/

import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully.");
    }

    void removeBook(String ISBN) {
        for (Book b : books) {
            if (b.ISBN.equals(ISBN)) {
                books.remove(b);
                System.out.println("Book removed.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void displayBooks() {
        System.out.println("Library Books:");
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Java Basics", "James Gosling", "101");
        Book b2 = new Book("OOP Concepts", "Bjarne Stroustrup", "102");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayBooks();

        lib.removeBook("101");

        lib.displayBooks();
    }
}