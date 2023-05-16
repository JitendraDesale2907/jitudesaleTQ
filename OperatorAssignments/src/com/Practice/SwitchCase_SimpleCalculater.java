package com.Practice;
import java.util.Scanner;
public class SwitchCase_SimpleCalculater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("press the numerical key 1to3");
		int a=sc.nextInt();
		switch(a) {
		case 1:System.out.println("addition of number "+(n1+n2));
		break;
		case 2:System.out.println("substraction of number "+(n1-n2));
		break;
		case 3:System.out.println("multiplication of number "+(n1*n2));
		break;
		case 4:System.out.println("Division of number "+(n1/n2));
		break;
		default:System.out.println("Invalid operation");
		}

	}

}
