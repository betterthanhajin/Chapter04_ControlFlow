package method;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
	//�����ε�
		Scanner sc = new Scanner(System.in);
		while(true) {
			showDisplay();
			int num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("01.���¹�ȣ���Է�");
				int code = sc.nextInt();
				System.out.println("���¹�ȣ��" + code);
				break;
			case 2:
				System.out.println("02.�Ա��Ͻÿ�");
				break;
			case 3:
				System.out.println("02.����Ͻÿ�");
				break;
			case 4:
				System.out.println("�����Ͻðڽ��ϱ�?");
				System.exit(0);
				sc.close();
				break;
			}
		}
	}
	
	public static void showDisplay() {
		System.out.println("--------MENU---------");
		System.out.println();
		System.out.print("1.���µ��  2.�Ա�  3.���  4.����\n");
		System.out.println();
	}
}
