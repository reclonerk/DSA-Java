package ds.classes;

public class BookMain {

    private static int globalVariable = 50;
    private static int add(int a, int b){
        return  a + b;
    }

    public static void main(String[] args) {
        Book book = new Book("Ramayana!", 12, "Valmiki", "123-123-23-32", "1900");
        book.setName("Mahabharat");


        String name = book.getName();
        int numberOfPages = book.getNumberOfPages();
        String authorName = book.getAuthorName();
        String isbn = book.getIsbn();
        String yearOfPublication = book.getYearOfPublication();


        System.out.println(name + "," + numberOfPages + "," + authorName + "," + isbn + "," + yearOfPublication);
        System.out.println(book);

        // Demo of Add method
        /*
        BookMain bookMain = new BookMain();

        int sum = bookMain.add(23, 25);
        System.out.println("Sum  : " + sum);


         */

        int sum = add(23, 45);
        System.out.println(sum);

        System.out.println(globalVariable);

    }
}
