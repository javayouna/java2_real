
public class example1 {

	public static void main(String[] args) {
		/*
		 * �迭+�⺻ (Ŭ����)�޼ҵ幮��. 1���迭�� ������ ���� ���� �ֽ��ϴ�. �迭����Ʈ 22 33 44 55 66 77 88 99 �̸� �ش�
		 * ��ü ���� ��� ���� �� �հ� ���� ������ �޼ҵ�� ó�� �ǵ��� �մϴ�. ��, �ݺ����� ������ do~while������ �ۼ�
		 * 
		 */

		int aa[] = { 22, 33, 44, 55, 66, 77, 88, 99 };
		//void=��ü����+�ν��Ͻ�(�޸�) ��� �ؾ���
		example1 yn = new example1();
		yn.datas(aa);
		yn=null;
	}

	public void datas(int[] data1) {
		int w = 0;
		int sum = 0;
		do {
			sum = data1[w] + sum;
			w++;
		} while (w < data1.length);
		System.out.println(sum);

	}
}
