package ch.unibe.serie06.task02;

/**
 * represents a DVD object with given attributes. Implements the iArticle interface
 */
public class DVD implements IArticle {
    private int id;
    private String title;
    private int year;
    private int price;

    public DVD( int id, String title, int year, int price ) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.price = price;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return id + " (DVD) " + title +
                ", " + year + ", " + price + " CHF";
    }
}
