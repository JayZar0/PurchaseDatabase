package models;

/**
 * This will be used to store all the details of the users purchase and then
 * place it into the database. The details will be the id, amount, payment type,
 * and date.
 * @author johne
 * @version 1.0
 */
public class Purchase
{
    private int id;
    private double price;
    private PurchaseType type;
    private String date;

    public Purchase(int id, double price, PurchaseType type, String date)
    {
        this.id = id;
        this.price = price;
        this.type = type;
        this.date = date;
    }
}
