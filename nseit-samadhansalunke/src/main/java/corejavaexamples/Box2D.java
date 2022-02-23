package corejavaexamples;

public class Box2D {
	
		int length;
		int breadth;
		
		Box2D()
		{
		    
			System.out.println("default constructor");

			length=1;
			breadth=1;
		}
		Box2D(int length,int breadth)
		{
			   this();
		System.out.println("parameterise constructor");
	        this.length=length;
			this.breadth=breadth;
		}
		public void calArea() {
			System.out.println("Area of box is "+length*breadth);
		}
}
