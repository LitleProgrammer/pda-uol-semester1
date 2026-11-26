package week6.buecher;

public class Book {

    private String title;
    private String[] authors;
    private String isbn;
    private double price;
    private String language;

    public Book() {
    }

    public Book(String title, String[] authors, String isbn, double price, String language) {
        this.title = title;
        this.authors = authors;
        this.isbn = isbn;
        this.price = price;
        this.language = language;
    }


    public boolean isAuthor(String author) {
        for (String searchAuthor : authors) {
            if (searchAuthor.equals(author)) {
                return true;
            }
        }

        return false;
    }

    public boolean priceIsMoreThan(double maxPrice) {
        if (price > maxPrice) {
            return true;
        }

        return false;
    }




    public String getTitle() {
        return title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public String getLanguage() {
        return language;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
