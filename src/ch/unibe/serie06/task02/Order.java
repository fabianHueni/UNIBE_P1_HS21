package ch.unibe.serie06.task02;

import java.util.ArrayList;

public class Order {

    public static int idCounter = 0;

    private final int id;
    private String customerName;
    private String customerAddress;
    private ArrayList<IArticle> articles = new ArrayList<>();

    public Order() {
        id = Order.idCounter ++;

    }

    public ArrayList<IArticle> getArticles() {
        return articles;
    }

    public void addArticles(ArrayList<IArticle> articles) {
        this.articles = articles;
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

    public void add(IArticle article) {
        this.articles.add(article);
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

    public int getTotalPrice() {
        int total = 0;
        for (IArticle article : articles) {
            total += article.getPrice();
        }
        return total;
    }

    public Iterable<IArticle> getOrderedArticles() {
        return this.articles;
    }
}
