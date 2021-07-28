package training;

public class Test02 {

	public static void main(String[] args) {
		/*
		 * while()/ do while();
		 * 1~100출력하고 거꾸로 100~1출력
		 * 
		 */
		
		int num = 1;
		int i = 0;
		
		while(num <= 100) {
			i++;
			System.out.print(num + " ");
			num++;
			if(i%10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		num -= 1;
		i = 0;
		
		do {
			i++;
			System.out.print(num + " ");
			num--;
			if(i%10 == 0) {
				System.out.println();
			}
		}while(num >= 1);
		

	}

}
