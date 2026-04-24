public class BookApp {
    public static void main(String[] args) {
        Book b = new Book("Java How to Program", 2017, "Deitel");
        PrintBook pb = new PrintBook("The C Programming Language", 1978, "Kernighan & Ritchie", "Prentice Hall", "0131101633");
        AudioBook ab = new AudioBook("The Clean Coder", 2011, "Robert C. Martin", 150.5, 420, "Robert C. Martin");

        System.out.println(b);
        System.out.println(pb);
        System.out.println(ab);
    }
}
