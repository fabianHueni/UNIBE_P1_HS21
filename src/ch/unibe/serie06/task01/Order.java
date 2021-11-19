package ch.unibe.serie06.task01;

import java.util.ArrayList;

public class Order {

    public static int idCounter = 0;

    private final int id;
    private String customerName;
    private String customerAddress;
    private ArrayList<Book> books = new ArrayList<>();


    public Order() {
        id = Order.idCounter ++;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        String stringRepresentation = "Order id: " + id +
                " Customer: " + customerName + ", " + customerAddress + '\n';

        for (Book book :
                this.books) {
            stringRepresentation += book.toString() + "\n";
        }

        return stringRepresentation;
    }
}
