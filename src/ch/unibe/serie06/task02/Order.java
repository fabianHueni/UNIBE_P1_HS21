package ch.unibe.serie06.task02;

import java.util.ArrayList;

/**
 * represents an order with a customer and multiple products
 */
public class Order {

    public static int idCounter = 0;

    private final int id;
    private String customerName;
    private String customerAddress;
    private ArrayList<IArticle> articles = new ArrayList<>();

    /**
     * constructor with incrementing number as id
     */
    public Order() {
        id = Order.idCounter ++;
    }

    /**
     * calculates the total price from the ordered articles
     *
     * @return total price of this order
     */
    public int getTotalPrice() {
        int total = 0;
        for (IArticle article : articles) {
            total += article.getPrice();
        }
        return total;
    }

    /**
     * @return iterable articles of this order
     */
    public Iterable<IArticle> getOrderedArticles() {
        return this.articles;
    }

    /**
     * adds an article to this order
     * @param article
     */
    public void add(IArticle article) {
        this.articles.add(article);
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", books=" + articles.toString() +
                '}';
    }
}
