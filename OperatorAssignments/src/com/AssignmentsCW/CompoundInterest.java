package com.AssignmentsCW;
import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle");
		double p=sc.nextDouble();
		System.out.println("Enter the rate");
		double r=sc.nextDouble();
		System.out.println("Enter the time");
		double t=sc.nextDouble();
		double a=(1+(r/100));
		double intrest=1;
		for(int i=1;i<=t;i++)
		{
			intrest=a*i*intrest;
			
				
		}System.out.println(intrest);
		double ci=p*intrest;
		System.out.println(ci);
		}
  }

