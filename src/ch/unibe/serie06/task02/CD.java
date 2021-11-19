package ch.unibe.serie06.task02;

public class CD implements IArticle{
    private int id;
    private String title;
    private String interpret;
    private int year;
    private int price; // CHF

    /** constructor */
    public CD( int id, String title, String interpret, int year, int price ) {
        this.id = id;
        this.title = title;
        this.interpret = interpret;
        this.year = year;
        this.price = price;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
