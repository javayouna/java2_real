import java.util.Scanner;

public class example6 {

	public static void main(String[] args) {
		/*
		 * ���빮�� 2�� �迭�̸�, 2���迭 �����ʹ� ������ �����ϴ�. user_list: ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		 * user_point:3000 1000 25000 19800 5750 3630 0
		 * 
		 * ���α׷� ���۰� ���ÿ� "����Ʈ�� �˻��� ������ �Է��ϼ���" �Է��� ���� ������ class�� �����Ͽ� �ش� �޼ҵ� ������ �Ű�������
		 * �̿��Ͽ� ���� �� �ش� ������� ����Ͻø� �˴ϴ�.
		 * 
		 */

		String msg = "����Ʈ�� �˻��� ������ �Է��ϼ���";
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		String tt = sc.next();
		point p = new point();
		p.user(tt);
		sc.close();
		p=null;
	}
}
class point{
	public void user (String ii) {
		String pro [][]= {
				{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
				{"3000","1000","25000","19800","5750","3630","0"}
		};
		int w=0;
		int ea =pro[0].length;
		while(w<ea) {
			if(ii.equals(pro[0][w])){
					 System.out.printf("%s���� ����Ʈ�� %s �Դϴ�.",pro[0][w],pro[1][w]);
			}
		}
		w++;
		
		}
}
