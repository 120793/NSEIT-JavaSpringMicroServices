package corejavaexamples;

public class ConstructorInheritance {
	int a;
    int b;
    int c;
    ConstructorInheritance(){
    	a=1;
    	b=2;
    	c=3;
    	System.out.println("Inside A constructor");
    	}
    public void showData() {
    	System.out.println("A="+a+" B="+b+"C= "+c);

    }
}

class B extends ConstructorInheritance{
int a;
int b;
int c;
B(int a,int b,int c){
this.a=a;
this.b=b;
this.c=c;
System.out.println("Inside B Contructor");
}
 public void showData() {
 	System.out.println("A="+a+" B="+b+" C="+c);
}
}

class C extends B {
int a;
int b;
int c;
C(){
	
 super(10,20,30);
	a=100;
	b=200;
	c=300;
	System.out.println("Inside c constructor");
	}
public void showData() {
	System.out.println("A="+super.a+" ,"+"B="+b+" ,"+"C="+c);

}
}
