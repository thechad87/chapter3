package com.marthinussen;

/**
 * Hello world!
 *
 */
public class CustomerOrders
{
    private String name, surname;
    private int orderNumber, items;

    public CustomerOrders(String name, String surname, int orderNumber, int items) {
        this.name = name;
        this.surname = surname;
        this.orderNumber = orderNumber;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getItems() {
        return items;
    }
}



