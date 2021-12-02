package ch.unibe.serie06.task01;

import java.util.ArrayList;

/**
 * represents an order from a bookshop
 */
public class Order {
    // counter for the id of a new order
    public static int idCounter = 0;

    private final int id;
    private String customerName;
    private String customerAddress;
    private ArrayList<Book> books = new ArrayList<>();

    /**
     * constructor, sets the id of this order and increments the static id by one
     */
    public Order() {
        id = Order.idCounter ++;
    }

    /**
     * adds a new book to this order
     * @param book book to add to this order
     */
    public void addBook(Book book) {
        this.books.add(book);
    }

    /**
     * set the customer name of this order
     * @param customerName name of the customer of this order
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * set the customers address
     * @param customerAddress the address from the customer of this order
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * String representation of this order with all ordered books
     * @return string representation of the order
     */
    @Override
    public String toString() {
        String stringRepresentation = "Order id: " + id +
                " Customer: " + customerName + ", " + customerAddress + '\n';

        for (Book book : this.books) {
            stringRepresentation += book.toString() + "\n";
        }

        return stringRepresentation;
    }
}
