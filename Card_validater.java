package task.interview;

import java.util.Scanner;

public class Card_validater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Your Card Number");
		String cno=obj.next();
		int length1=cno.length();
		System.out.println(length1);
		
		if(length1==15)
		{
			if(cno.startsWith("34")||cno.startsWith("35"))
			{
				System.out.println("American Express Card");
			}
			else if(cno.startsWith("2123")||(cno.startsWith("1800")))
			{
				System.out.println("JCB");
			}
		}
		else if((length1==13)||(length1==16))
		{
			if(cno.startsWith("62"))
			{
				System.out.println("China Union Card");
			}
			else if(cno.startsWith("6011")||cno.startsWith("622126"))
			{
				System.out.println("Discover Card");
			}
			else if(cno.startsWith("51")||
					cno.startsWith("52")||
				    cno.startsWith("53")||
				    cno.startsWith("54")||
				    cno.startsWith("55"))
				    {
				    System.out.println("Master Card");	
				    }
			else if(cno.startsWith("4"))
					{
				System.out.println("Visa card");
					}
		}
		else if(length1==14)
		{
			if(cno.startsWith("300")||
			   cno.startsWith("301")||
			   cno.startsWith("302")||
			   cno.startsWith("303")||
			   cno.startsWith("304")||
			   cno.startsWith("305")||
			   cno.startsWith("306"))
					{
				System.out.println("Dinner club Credit Card");
				
					}
		}
		else
		{
			System.out.println("Enter valid  Card number");
		}
		
		// Luhn's algorithm
		char[] ch1=cno.toCharArray();
		int[] div=new int[ch1.length/2];
		int[] rem=new int[div.length];
		// finding double of every second elements and store dble[]-- right to left
		int j=0;
		for(int i=ch1.length-2;i>=0;i=i-2)
		{
			div[j]=(ch1[i]-48)*2;
			j++;
		}
		// finding remaining number of every second and store remain[] elements-- left to right
		int k=0;
		for(int i=1;i<ch1.length;i=i+2)
		{
			rem[k]=ch1[i]-48;
			k++;
		}
		//addition of div values
		int sum = 0,remain=0;
		for(int i=0;i<div.length;i++)
		{
			remain=div[i]%10;
			int quotient=div[i]/10;
			sum=sum+remain+quotient;
		}
		//System.out.println("sum="+sum);
		//addition of rem values
		int sum2=0;
		for(int i=0;i<rem.length;i++)
		{
			sum2=sum2+rem[i];
		}
		//System.out.println("sum2="+sum2);
		int result=sum+sum2;
		//System.out.println(result);
		if(result%10==0)
		{
			System.out.println("The Card Number is Valid");
		}
		else
		{
			System.out.println("The Card Number is Not valid");
		}
	
	}

}
