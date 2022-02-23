package corejavaexamples;

abstract public class AbstractMobile {
	 abstract void specialFeature();
	  
	}
	  class Vivo extends AbstractMobile{
		  public void specialFeature() {
			  System.out.println("Good camera quality");
		  }
	  }
	  
	  class Nokia extends AbstractMobile{
		  public void specialFeature() {
			  System.out.println("Good battery quality");
		  }
}
