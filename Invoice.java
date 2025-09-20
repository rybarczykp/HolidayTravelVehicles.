public class Invoice {
    private int invoiceID;
    private String date;
    private int finalPrice;
    private int tax;
    private int licenseFee;

    private Vehicle vehicle; // 0..1 
    private ArrayList<TradeInVehicle> tradeInVehicles; // 0..* 
    private ArrayList<Customer> customers; // 0..*
    private ArrayList<Salesperson> salespersons; // 0..* 
}