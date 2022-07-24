public class SalesOrderClient {

  private static Jacket jacket = new Jacket();

  public static void main(String[] args) {

    OrderHandler placeOrderHandler = new OrderHandler();
    OrderHandler returnOrderHandler = new OrderHandler();

    placeOrderHandler.invoke(new PlaceOrderType(jacket));
    returnOrderHandler.invoke(new ReturnOrderType(jacket));


  }


}
