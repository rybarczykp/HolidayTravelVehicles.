public class Invoice {
    private int invoiceID;
    private String date;
    private int finalPrice;
    private int tax;
    private int licenseFee;

    private Vehicle vehicle; // 0..1 
    private ArrayListList<TradeInVehicle> tradeInVehicles; // 0..* 
    private ArrayListList<Customer> customers; // 0..*
    private ArrayListList<Salesperson> salespersons; // 0..* 
}