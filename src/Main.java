public class Main {
    public static void main(String[] args){


        String[] bookTitles = {
                "The Great Gatsby",
                "Moby Dick",
                "Pride and Prejudice",
                "The Hobbit",
                "Lord of the Rings"
        };
        Book[] books = new Book[5];
        for (int i = 0; i < 5; i++) {
            int randomQuantity = (int) (Math.random() * 5) + 1; // Cantidad de 1 a 5
            books[i] = new Book(i + 1, bookTitles[i], randomQuantity);
        }


        Thread[] hilos = new Thread[5];


        for(int i = 0; i<5;i++){
            hilos[i] = new User(new LibraryManager(books));
            hilos[i].start();
        }


        for (int i = 0; i < hilos.length; i++) {
            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}