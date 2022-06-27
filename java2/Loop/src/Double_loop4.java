
public class Double_loop4 {

	public static void main(String[] args) {

		/*
		 * ���빮�� �ۿ� for �ܿ� do~while
		 */
		int f;
		for (f = 2; f <= 3; f++) {

			int w = 1;
			do {
				// System.out.println(f + "*" + w + "=" + (f * w));
				w++;
			} while (w <= 9);

		}

		/*
		 * ���빮�� ������ 7�ܺ���~9�ܱ��� ��, �� ������ ���� ���� 5������ �������� �մϴ�. 7*1=7...7*5=35...9*5=45 ����
		 * �ۿ��� do while �� while
		 */

		int h = 7;
		int total;
		do {
			int p = 1;
			while (p <= 5) {
				total = f * p;
				// System.out.printf("%d * %d = %d ",h,p,total);
				p++;
			}
			h++;
		} while (h <= 9);

		/*
		 * ���빮�� ���� ������� Ȯ���Ͽ� �ڵ带 �ۼ��մϴ�. ��, for ~ while���� ���� �ǵ��� �մϴ�. 1*1=1 2*2=2 ..
		 * 9*9=81
		 */
		int i = 1;
		for (i = 1; i <= 9; i++) {

			int ii = i;
			while (ii == i) { // while(i<=ii)�� ��
				System.out.println(i + " * " + ii + " = " + (i * ii));
				ii++;
			}

		}

		/* ���빮�� ���� �ش� ��� ��ó�� ��� �ǵ���
		 * ���� �ݺ����� �̿��ϼ���~
		 * (while~do~while)
		 * 1+1=2 2+1=3 2+2+4 3+1=4 3+2=5 3+3=6 4+1=5 4+2=6 4+3=7 4+4=8
		 * 
		 */
		
		
	}

}
