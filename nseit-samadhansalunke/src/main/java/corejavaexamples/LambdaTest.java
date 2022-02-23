package corejavaexamples;

interface Maths{
	 int add(int a,int b);
}

/*class MathsImp implements Maths{
	public int add(int a, int b) {
		return a+b;
	}*/
//}

//(a,b)->a+b;

interface Geometry{
	public double calCircle(int radius);
}

interface Multiplication {
	int calMul(int q,int s);
}



public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Maths m=(a,b)->a+b;
         System.out.println(m.add(10,20));
        Geometry g=(radius)->3.14*radius*radius;
        System.out.println(g.calCircle(5));
         Multiplication m1=(q,s)->q*s;
         System.out.println(m1.calMul(3,5));

	}

}
