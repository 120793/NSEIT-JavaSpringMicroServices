package corejavaexamples;


 enum Paint{
	 RED,
	 GREEN,
	 BLUE
 }
 
 enum WeekDays{
	 SUNDAY,
	 MONDAY,
	 TUESDAY,
	 WEDENSDAY,
	 THURSDAY,
	 FRIDAY,
	 SATURDAY
 }
public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(Paint p:Paint.values()) {
    	System.out.println(p);
    }
    Paint temp=Paint.BLUE;
	System.out.println(temp);
	
	WeekDays d1=WeekDays.MONDAY;
	System.out.println(d1.ordinal());
	System.out.println(d1.valueOf("SUNDAY"));
     }
}
