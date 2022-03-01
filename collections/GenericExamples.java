package corejavaexamples.collections;

class Gen<T>{
	T ob;
	
	Gen(T y){
		ob=y;
	}
	T getob() {
		return ob;
	}
	void showType() {
		System.out.println("Type of object is "+ ob.getClass().getName());
	}
}
public class GenericExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Gen<String> g=new Gen("ram");
       g.showType();
	}

}
