import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/* ���빮��
		 * ��ٱ��Ͽ� ���� ��ǰ�� ����� �ֽ��ϴ�.
		 * �� �� �ù�Ⱑ ������ �����Ǵ� �ݾ׸� �����ϼ���.
		 * �ù��� 30000���̻�(����)
		 * 15000 48000 67000 8000 118200 49800 6000 18700
		 */
		 int a[] = new int[4]; 
		 int cost [] = {15000,48000,67000,8000,118200,49800,6000,18700};
		 int aa=a.length;
		 int i=cost.length;
		 int c=0;
		 	for (aa=0;aa<i;aa++) {
		 		//System.out.println(cost[ii]);
		 		if (cost[aa]>=30000) {
		 			a[c]=cost[aa];
		 			c++;
		 		}

		 	}	 
		 	System.out.println(Arrays.toString(a));
		
	
		 	
		 	
		 	
		 	
		 	
		 	
	}

}
