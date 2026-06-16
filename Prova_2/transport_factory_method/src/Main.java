public class Main {
    public static void main(String[] args) {
        Creator shipLogistics = new ShipLogistics();
        Creator truckLogistics = new TruckLogistics();

        shipLogistics.planDelivery();
        truckLogistics.planDelivery();
    }
}
