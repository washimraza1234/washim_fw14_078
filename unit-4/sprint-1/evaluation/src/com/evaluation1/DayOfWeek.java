package com.evaluation1;

public class DayOfWeek {

public static void main(String[] args) {
		//Assume these could have any value:
		int dayOfTheWeek = 1;
		boolean holiday = false;
		
		if((dayOfTheWeek==1 ||dayOfTheWeek==2||dayOfTheWeek==3||dayOfTheWeek==4||dayOfTheWeek==5||dayOfTheWeek==6) && (holiday==false)) {
			System.out.println("Wake up at 7:00");
		}
		
		else if(dayOfTheWeek==7 || holiday==true) {
			System.out.println("Sleep in!");
		}

	}
}