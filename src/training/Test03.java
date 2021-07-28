package training;

public class Test03 {

	public static void main(String[] args) {
//		 1000 이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력
//		 그 수들의 총합을 출력
//		while문을 이용해서 
		
		int num = 0;
		int sum = 0;
		//int cnt = 0;
		
		while(num < 1000) {
			num++;
			if(num % 2 == 0 && num % 7 == 0) {
				System.out.println("100이하 2의배수 7의배수:" + num);
				sum = sum + num;
				//cnt++;
				//System.out.println(cnt);
			}
		}
		
		System.out.println("총합은" +sum);
	}

}
