package corejavaexamples;

public class TestAbstractShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CardShops shop1=new CardShops();
    shop1.selectGoods();
    shop1.payment();
    shop1.shipment();
    CardShops shop2=new CardShops();
    shop2.selectGoods();
    shop2.payment();
    shop2.shipment();
	}

}
