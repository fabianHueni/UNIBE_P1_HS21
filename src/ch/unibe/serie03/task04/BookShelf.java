// Fabian Hüni 21-122-270
// Eilin Orgland 20-218-566

package ch.unibe.serie03.task04;

/**
 * Contains different tests for the book class
 */
public class BookShelf {

    public static void main(String[] args) {
        Book book1 = new Book(123, "Testbuch", "Max Muster", "10.08.2021");

        System.out.println("Book before new input: -------------------------------");
        System.out.println("All of book: " + book1);
        System.out.println("Age: " + book1.age());

        book1.input();

        System.out.println("Book after new input values: -------------------------------");
        System.out.println("Age: " +book1);
        System.out.println("ID: " +book1.getId());
        System.out.println("Title: " +book1.getTitle());
        System.out.println("Author: " +book1.getAuthor());
        System.out.println("Publication date: " +book1.getDateOfPublication());
        System.out.println("Age: " +book1.age());

    }
}
