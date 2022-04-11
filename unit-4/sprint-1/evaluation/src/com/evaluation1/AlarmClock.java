package com.evaluation1;

public class AlarmClock {
	
	public void alarm(boolean a, int b) {
		if(a==true && (b==2 || b==3||b==4 || b==5)){
			System.out.println("10:00");
		}
		if(a==true && b==0 || b==1) {
			System.out.println("off");
		}
		if(a==false && (b==2 || b==3||b==4 || b==5)){
			System.out.println("7:00");
		}
		if(a==false && b==0 || b==1) {
			System.out.println("10:00");
		}
		if((a!= true && a!=false) || (b!=0 && b!=1 && b!=2 && b!=3 && b!=4 && b!=5 && b!=6)) {
			System.out.println("error");
		}
	}
public static void main(String[] args) {
	AlarmClock res= new AlarmClock();
	res.alarm(true,2);
}
}
