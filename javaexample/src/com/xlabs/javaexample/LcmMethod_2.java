package com.xlabs.javaexample;
/**
 * The class LcmMethod_2 takes 2 numbers as Input and finds their LCM.
 * This is Method 2
 * @author www.javaforschool.com
 * @Program Type : BlueJ Program - Java
 */
import java.io.*;
class LcmMethod_2
{
	public static void main()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b,max,min,x,lcm=1;
		System.out.print("Enter the 1st number : ");
		a=Integer.parseInt(br.readLine());
		System.out.print("Enter the 2nd number : ");
		b=Integer.parseInt(br.readLine());
		if(a>b)
		{
			max=a;
			min=b;
		}
		else
		{
			max=b;
			min=a;
		}
		/*
To find the maximum and minimum numbers, you can also use
int max=a>b?a:b;
int min=a<b?a:b;
		 */
		for(int i=1;i<=min;i++)
		{
			System.out.println("in for loop");
			x=max*i; //finding multiples of the maximum number
			if(x%min==0) //Finding the multiple of maximum number which is divisible by the minimum number.
			{
				lcm=x; //making the first multiple of maximum number which is divisible by the minimum number, as the LCM
				break; //exiting from the loop, as we don’t need anymore checking after getting the LCM
			}
			System.out.println(" END for loop");
		}
		System.out.println("L.C.M. = "+lcm);
	}
}