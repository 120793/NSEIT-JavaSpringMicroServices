package corejavaexamples;
 class Shape{
	 int length;
	 int breadth;
	 Shape(){
	 length=4;
	 breadth=5;
 }
	 public void calArea() {
		 System.out.println("The area is : "+(length*breadth));
	 }
 }
 
 class Triangle extends Shape{
	 public void calArea() {
		 //super.calArea();
	 System.out.println("The area is : "+(0.5*length*breadth));
	 }
 }
public class TestOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Triangle t=new Triangle();
 t.calArea();
	}

}
