package com.AssignmentsCW;
import java.util.Scanner;
public class TotalAveragePercentage {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the five subject marks");
	double phy=sc.nextInt();
	double math=sc.nextInt();
	double chem=sc.nextInt();
	double marathi=sc.nextInt();
	double english=sc.nextInt();
	double total=(phy+math+chem+marathi+english);
	System.out.println(total);
	double avg=total/5;
	System.out.println(avg);
	double per=(total/500)*100;
	System.out.println(per);
	
}

}
