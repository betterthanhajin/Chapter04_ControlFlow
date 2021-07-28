package training;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
	/*
	 * 
	 * 
	 * 
	 * 이거를 if한번만써서코딩
	 */
		
		int num = 120;
//		if(num > 0) {
//			if((num%2) == 0) {
//				System.out.println("양수 이면서 짝수");
//			}
//		}
		
//		if(num > 0 && num%2 == 0) {
//			System.out.print("양수 이면서 짝수");
//		}
		
		
		
//		if(n >= 0 && n < 10) {
//			System.out.println("0 이상 10미만의 수");
//		}
//		else if(n >= 10 && n < 20) {
//			System.out.println("10 이상 20 미만의 수");
//		}
//		else if(n >= 20 && n < 30) {
//			System.out.println("20 이상 30 미만의 수");
//		}
//		else {
//			System.out.println("음수 혹은 30 이상의 수");
//		}
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n/10) {
		case 0 :
			System.out.println("0이상 10미만의수");
			break;
		case 1 :
			System.out.println("10이상 20미만의수");
			break;
		case 2:
			System.out.println("20이상 30미만의수");
			break;
		default:
			System.out.println("음수 30이상의수");
		}
		sc.close();
		//switch문으로..
		int n2 = (int)(Math.random()*100);
		System.out.println(n2);
		
		int num2 = n2 / 10;
		System.out.println(num2);
		
		
		
	}
}
