package Library_Management_System;

import java.util.Scanner;

public class LendBooks {
    public static void main(String[] args) throws BookNotFoundException, BookNotAvailableException {
        Book book = new Book("Intoarcerea de la iarmaroc", "Salom Alehem", "935 584 6325", 5, 3);
        Book book1 = new Book("Procesul", "Franz Kafka", "985 321 45873", 8, 4);
        Book book2 = new Book("Crima si pedeapsa", "F.M. Dostoievski", "931 254 8457", 6, 2);
        Book[] booklist = {book, book1, book2};
        Library library = new Library(booklist, 3);

        library.searchBookByCode("935 584 6325");

        String[] clientBorrowedBookCodes = new String[3];
        clientBorrowedBookCodes[0] = "935 584 6325";
        Client client = new Client("Raluca", clientBorrowedBookCodes, 1);

        try {
            client.borrowBook("985 321 45873", library);
        } catch (BookNotFoundException | BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("The book is available");
        System.out.println(client.isBookAvailable(library, "935 584 6325"));

        System.out.println("See the available books ");
        client.viewAvailableBooks(library);

        System.out.println("-----");

        System.out.println("Borrowed books");
        client.borrowBook("985 321 45873", library);
        System.out.println("print the borrowed books");
        client.printBorrowedBooks();

        System.out.println("--------------------------------------- ");

        System.out.println(book1.getBorrowedNumberOfCopies());
        System.out.println(book.getBorrowedNumberOfCopies());


        System.out.println("Return book");
        System.out.println("before returning");
        client.printBorrowedBooks();
        System.out.println(book1.getBorrowedNumberOfCopies());
        client.returnBook("985 321 45873", library);
        System.out.println("after returning");
        client.printBorrowedBooks();
        System.out.println(book1.getBorrowedNumberOfCopies());

        System.out.println("-------------");

        Admin admin = new Admin("Kim");
        //admin.addBook(new Book ("As fi vrut sa fiu egiptean", "Alaa al-Aswani", "325", 3, 1), library);
        System.out.println("before deletion");
        admin.listAllBooks(library);
        System.out.println(admin.deleteBook("931 254 8457", library));
        System.out.println("after deletion");
        admin.listAllBooks(library);


        System.out.println("The book with the searched ISBN is :");
        admin.listBookDetails("985 321 45873", library);

        System.out.println("The books borrowed by the client are: ");
        clientBorrowedBookCodes[0] = "931 254 8457";
        Client client1 = new Client("R", clientBorrowedBookCodes, 1);
        admin.viewBorrowedBooks(client1, library);

        System.out.println("*****");
    }
}
