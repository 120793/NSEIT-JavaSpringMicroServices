package corejavaexamples;

public class Assignment4 {
  static double distance(int x1,int y1,int x2,int y2) {
	  return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(Math.round(distance(3, 4, 5, 2))*100000.0/100000.0);
	}

}
