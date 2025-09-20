public class Customer {
    private int customerID;
    private String name;
    private String address;
    private String phone;

    private Salesperson salesperson; // 1:1 with the salesperson  customer
}