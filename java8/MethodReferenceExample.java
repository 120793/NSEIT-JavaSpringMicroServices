package corejavaexamples.java8;

class MyThreadExample{
	public static void test() {
		for(int i=200;i<300;i++)
			System.out.println(i);
	}
}

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadExample mt= new MyThreadExample();
		Runnable r = ()->{
			for(int i=20;i<30;i++)
				System.out.println(i);
		};
		
		Runnable r1= MyThreadExample::test;
		Thread t= new Thread(r1);
		t.start();
		
	}

}
