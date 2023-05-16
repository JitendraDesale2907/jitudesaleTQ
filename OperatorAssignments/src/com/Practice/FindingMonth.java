package com.Practice;

public class FindingMonth {

	public static void main(String[] args) {
		int month=7;
		String monthstring="";
		switch(month) {
		case 1:monthstring="1-jan";
		break;
		case 2:monthstring="2-feb";
		break;
		case 3:monthstring="3-march";
		break;
		case 4:monthstring="4-Apr";
		break;
		case 5:monthstring="5-may";
		break;
		case 6:monthstring="6-jun";
		break;
		case 7:monthstring="7-july";
		break;
		case 8:monthstring="8-aug";
		break;
		case 9:monthstring="9-sep";
		break;
		case 10:monthstring="10-oct";
		break;
		case 11:monthstring="11-nov";
		break;
		case 12:monthstring="12-dec";
		break;
		default:System.out.println("Invalid month");
	      }System.out.println(monthstring);

	}

}
