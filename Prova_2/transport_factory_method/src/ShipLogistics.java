public class ShipLogistics extends Creator{
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
