package com.assignment4;

public class OddEven {
	
	public void isOdd(int num){
		if(num %2 != 0) {
			System.out.println(num);
		}
		if(num %2 == 0) {
			int res=num%10;
			if(res<5) {
				System.out.println("When Even "+(num-res));
				}
			else {
				System.out.println("When evennn"+(num+res));
			}
		}
		else if(num<0) {
			System.out.println("Error");
		}
	}
public static void main(String[] args) {
	OddEven ans= new OddEven();
	ans.isOdd(-2);
}
}
