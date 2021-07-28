package training;

public class Test04 {

	public static void main(String[] args) {
		/*
		 * 
		 * 자연수 1부터시작
		 * 모든 홀수를 더해
		 * 그 합이 언제(몇을 더했을때)
		 * 1000을 넘어서는지?
		 * 그리고 1000울 넘어선 값은 얼마? 
		 * 출력하는 프로그램을 작성하시오.
		 * break
		 */
		
		int n = 1;
		int sum = 0;
		
		while(true) {
			
			if(n % 2 != 0) {
				sum = sum + n;
			}
			
			if(sum > 1000) {
				System.out.println(n);
				System.out.println(sum);
				break;
			}
			
			n++;
		
		}
	}

}
