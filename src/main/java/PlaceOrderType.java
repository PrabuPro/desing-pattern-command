public class PlaceOrderType implements OrderType {

    private Jacket jacket;

    public PlaceOrderType(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void excute() {
        jacket.placeOrder();
    }
}
