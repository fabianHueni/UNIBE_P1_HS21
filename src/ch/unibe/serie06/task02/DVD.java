package ch.unibe.serie06.task02;

public class DVD implements IArticle {
    private int id;
    private String title;
    private int year;
    private int price; // CHF

    /** constructor */
    public DVD( int id, String title, int year, int price )
    {
        this.id = id;
        this.title = title;
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
