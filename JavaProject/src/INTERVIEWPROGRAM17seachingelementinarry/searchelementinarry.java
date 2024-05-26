package INTERVIEWPROGRAM17seachingelementinarry;

import java.util.Scanner;

public class searchelementinarry {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println("enter your element :");
		Scanner  s= new Scanner(System.in);
		int ser_ele=s.nextInt();
		boolean b=false;
		for(int i=0; i<arr.length; i++)
		{
			if(ser_ele==arr[i])
			{
				System.out.println("search element is found :"+i);
				b=true;
			}
		}
		if(b==false)
		{
			System.out.println("serach element is not found.");
		}
	}

}
