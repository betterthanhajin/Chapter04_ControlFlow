package method;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
	//오버로딩
		Scanner sc = new Scanner(System.in);
		while(true) {
			showDisplay();
			int num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("01.계좌번호를입력");
				int code = sc.nextInt();
				System.out.println("계좌번호는" + code);
				break;
			case 2:
				System.out.println("02.입금하시오");
				break;
			case 3:
				System.out.println("02.출금하시오");
				break;
			case 4:
				System.out.println("종료하시겠습니까?");
				System.exit(0);
				sc.close();
				break;
			}
		}
	}
	
	public static void showDisplay() {
		System.out.println("--------MENU---------");
		System.out.println();
		System.out.print("1.계좌등록  2.입금  3.출금  4.종료\n");
		System.out.println();
	}
}
