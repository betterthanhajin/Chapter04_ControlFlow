package training;

public class Test04 {

	public static void main(String[] args) {
		/*
		 * 
		 * �ڿ��� 1���ͽ���
		 * ��� Ȧ���� ����
		 * �� ���� ����(���� ��������)
		 * 1000�� �Ѿ����?
		 * �׸��� 1000�� �Ѿ ���� ��? 
		 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
