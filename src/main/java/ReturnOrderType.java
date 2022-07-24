public class ReturnOrderType implements OrderType {

    private Jacket jacket;

    public ReturnOrderType(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void excute() {
        jacket.returnOrder();
    }
}
