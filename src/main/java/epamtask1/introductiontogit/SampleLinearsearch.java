package epamtask1.introductiontogit;
import java.lang.*;
import java.util.*;

class Linear
{
	Scanner s=new Scanner(System.in);
	public void m1()
	{
		 System.out.println("Enter no of elements");
		int n=s.nextInt();
		int i,flag=0;
		 System.out.println("Enter array elements");
		 int num[] = new int[n];
		    for(i=0;i<n;i++) 
		    {
		        num[i] = s.nextInt();
		    }
		    System.out.println("Enter element to search");
		    int x=s.nextInt();
		    for(i=0;i<n;i++)
		    {
		    	if(num[i]==x)
		    	{
		    		flag=1;
		    		break;
		    	}
		    }
		    if(flag==1)
		    {
		    	System.out.println("Element Found");
		    }
		    else
		    {
		    	System.out.println("Element Not found");
		    }
		
	}
}
public class SampleLinearsearch 
{
	
public static void main(String[] args)
{
	Linear l=new Linear();
	l.m1();
	
			
}
}
