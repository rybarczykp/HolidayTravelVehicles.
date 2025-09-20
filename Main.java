public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("SN123", "CoolGermanCar", "SUV", 2022, "Volkswagen", 25000);

        System.out.println("Serial: " + v1.getSerialNumber());
        System.out.println("Name: " + v1.getName());
        System.out.println("Model: " + v1.getModel());
        System.out.println("Year: " + v1.getYear());
        System.out.println("Manufacturer: " + v1.getManufacturer());
        System.out.println("Base Cost: " + v1.getBaseCost());
    }
}
