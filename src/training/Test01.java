package training;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
	/*
	 * 
	 * 
	 * 
	 * �̰Ÿ� if�ѹ����Ἥ�ڵ�
	 */
		
		int num = 120;
//		if(num > 0) {
//			if((num%2) == 0) {
//				System.out.println("��� �̸鼭 ¦��");
//			}
//		}
		
//		if(num > 0 && num%2 == 0) {
//			System.out.print("��� �̸鼭 ¦��");
//		}
		
		
		
//		if(n >= 0 && n < 10) {
//			System.out.println("0 �̻� 10�̸��� ��");
//		}
//		else if(n >= 10 && n < 20) {
//			System.out.println("10 �̻� 20 �̸��� ��");
//		}
//		else if(n >= 20 && n < 30) {
//			System.out.println("20 �̻� 30 �̸��� ��");
//		}
//		else {
//			System.out.println("���� Ȥ�� 30 �̻��� ��");
//		}
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n/10) {
		case 0 :
			System.out.println("0�̻� 10�̸��Ǽ�");
			break;
		case 1 :
			System.out.println("10�̻� 20�̸��Ǽ�");
			break;
		case 2:
			System.out.println("20�̻� 30�̸��Ǽ�");
			break;
		default:
			System.out.println("���� 30�̻��Ǽ�");
		}
		sc.close();
		//switch������..
		int n2 = (int)(Math.random()*100);
		System.out.println(n2);
		
		int num2 = n2 / 10;
		System.out.println(num2);
		
		
		
	}
}
