public class TruckLogistics extends Creator{
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}
