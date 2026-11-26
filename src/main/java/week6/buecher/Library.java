package week6.buecher;

public class Library {
    public static void main(String[] args) {
        Book algo = new Book();
        algo.setTitle("Introduction to Algorithms");
        algo.setAuthors(new String[]{"Thomas H. Cormen", "Charles Eric Leiserson", "Ronald Linn Rivest", "Clifford Stein" });
        algo.setIsbn("9-78-2620-3384-8");
        algo.setLanguage("English");
        algo.setPrice(22.3);

        Book hobbit = new Book();
        hobbit.setTitle("The Hobbit");
        hobbit.setAuthors(new String[]{"J.R.R. Tolkien"});
        hobbit.setIsbn("978-0-261-10221-7");
        hobbit.setLanguage("English");
        hobbit.setPrice(12.7);

        Book pride = new Book();
        pride.setTitle("Pride and Prejudice");
        pride.setAuthors(new String[]{"Jane Austen"});
        pride.setIsbn("978-0-14-143951-8");
        pride.setLanguage("English");
        pride.setPrice(9.99);
    }
}
