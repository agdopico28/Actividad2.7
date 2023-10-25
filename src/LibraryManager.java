public class LibraryManager {
    private Book[] books;

    public LibraryManager(Book[] vectorBooks) {
        this.books = vectorBooks;
    }


    public void takeBook(int libro) {
        int cantidad = books[libro - 1].getQuantity();
        if (cantidad > 0) {
            books[libro - 1].setQuantity(cantidad - 1);
            System.out.println("Libro prestado: " + libro + " - " + books[libro - 1].getName() + ", quedan " + books[libro - 1].getQuantity() + " ejemplares.");
        } else {
            System.out.println("Libro no disponible: " + libro + " - " + books[libro - 1].getName());
        }


    }

    public void returnBook(int libro) {
        int cantidad = books[libro - 1].getQuantity();
        books[libro - 1].setQuantity(cantidad + 1);
        System.out.println("Libro devuelto: " + libro + " - " + books[libro - 1].getName() + ", hay " + books[libro - 1].getQuantity() + " ejemplares.");
    }


}
