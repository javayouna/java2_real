
public class Array2 {

	public static void main(String[] args) {

		/*
		 * hong kim park lee jang jung
		 */

		/*
		 * ���빮�� �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�. �ش� �迭�� �� ����� ���̵� 3�ܾ� �ʰ��� ��½�Ű�ÿ�.
		 * 
		 */

		String arr1[] = { "hong", "kim", "park", "lee", "jang", "jung" };

		int member = arr1.length;
		int w = 0;
		int word;// ������ �迭 �������� ���� �����ľ�
		while (w < member) {
			word = arr1[w].length(); // ���� �����ľ�
			if (word > 3) { // ���ܾ� �ʰ� ������ ���
			//ystem.out.println(arr1[w]);
			}

			w++;
		}

		/*
		 * ���빮��
		 * �迭������ ������ ���� 
		 * 15 60 11 14 27
		 * ���� ������ ���� ��� ���ؼ� ���� ������� ����Ͻÿ�.
		 */
		
		int num[]= {15,60,11,14,27}; 
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
		;
		
		
		
		
	}

}
