package training;

public class Test03 {

	public static void main(String[] args) {
//		 1000 ���� �ڿ��� �߿��� 2�� ������� 7�� ����� ���� ���
//		 �� ������ ������ ���
//		while���� �̿��ؼ� 
		
		int num = 0;
		int sum = 0;
		//int cnt = 0;
		
		while(num < 1000) {
			num++;
			if(num % 2 == 0 && num % 7 == 0) {
				System.out.println("100���� 2�ǹ�� 7�ǹ��:" + num);
				sum = sum + num;
				//cnt++;
				//System.out.println(cnt);
			}
		}
		
		System.out.println("������" +sum);
	}

}
