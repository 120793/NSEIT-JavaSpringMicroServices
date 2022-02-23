package corejavaexamples;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num,sum=0,rev=0,rem;
	      
	        System.out.println("enter the number");
	        Scanner sc=new Scanner(System.in);
	       num=sc.nextInt();
	        
	        int arr[]= {10,15,20,25,30,100};
	        for(int i=0;i<arr.length;i++)
	        { 
	        	
	        	//System.out.println(arr[i]);
	        	if(num<arr[i]) 
	        	{
	            	sum+=arr[i];

	        	}
	     
	        }
	        System.out.println("Sum is "+sum);
	        while(sum!=0)
	        {
	        	rem=sum%10;
	        	rev=rev*10+rem;
	        	sum=sum/10;
	        }
	        System.out.println("Reverse sum is "+rev);

		}

	}


