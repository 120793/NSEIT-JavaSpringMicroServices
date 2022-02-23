package corejavaexamples;

abstract public class AbstractShopping {
   AbstractShopping(){
	   System.out.println("Shopping start");
   }
   public void selectGoods() {
	   System.out.println("Goods are selected through www.xyz.com");

   }
   public abstract void payment();
   public void shipement()
   {   //cod for shipment through DTDC courier
	   System.out.println("shipement is through DTDC");
	   }
}
 
  class CashShops extends AbstractShopping{
	public void payment() {
		//code for cash payment
		   System.out.println("Payment is done through cash only");

	}
}
   class CardShops extends AbstractShopping{

	@Override
	public void payment() {
		   System.out.println("Payment is done throgh cards only");
		   }

	public void shipment() {
		// TODO Auto-generated method stub
		   System.out.println("shipment is through DTDC");

	}
}