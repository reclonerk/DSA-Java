package ds.classes;

/*
    Book class properties
    - Name
    - Number of Pages
    - Author
    - ISBN
    - year of publication

 */

/*

    Ways to assign value to object of any class
    1. Constructor
    2. Setters

 */

public class Book {
    // Properties of class
    private String name;
    private int numberOfPages;
    private String authorName;
    private String isbn;
    private String yearOfPublication;

    // Default constructor

    Book(){}
//    public Book(){
//        name = null;
//        numberOfPages = 2;
//        authorName = null;
//        isbn = null;
//        yearOfPublication = null;
//    }

    // Custom constructor
    public Book(String name, int numberOfPages, String authorName, String isbn, String yearOfPublication){
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.authorName = authorName;
        this.isbn = isbn;
        this.yearOfPublication = yearOfPublication;
    }


    // Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setFancyName();
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    private void setFancyName(){
        this.name = "Fancy Name";
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    // toString() function for the class
    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", authorName='" + authorName + '\'' +
                ", isbn='" + isbn + '\'' +
                ", yearOfPublication='" + yearOfPublication + '\'' +
                ']';
    }
}
