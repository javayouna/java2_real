import java.util.Arrays;
import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		/* 
		 * �迭����+�⺻(Ŭ����)�޼ҵ� ����
		 * ����ڰ� ���� ������ �����Է��ϰ� �˴ϴ�.
		 * "�б� �л� �̸��� �Է����ּ���."
		 * �� �迭 �����ʹ� 5���� �����˴ϴ�.// ���� 5��
		 * ������ �޼ҵ忡�� �ش� ����ڰ� �Է��� ���� ����Ʈ�� �����Ͽ�
		 * ����ϼ���
		 * ���� )
		 * ����ڰ� �Է��� ���� : hong kim park lee jang
		 * ��� )
		 * hong,kim,park,lee,jang
		 *
		 */
		Scanner sc = new Scanner(System.in);
		String msg = "�б� �л� �̸��� �Է����ּ���.";
		String sum="";
		for(int i=0;i<=4;i++) {
			System.out.println(msg);
			String user= sc.nextLine();
			sum+=(user+",");
		}
	
		arrays(sum);
	}
	public static void arrays(String k) 
	{
	//	System.out.println(k);
	//	k=k.trim();
		String user1[] =k.split(" "); // split:���ڿ� �Ǵ� ���ڿ��� Ư������ �������� �迭�� ���� �� �ִ� ��ɾ�
	System.out.println(Arrays.toString(user1));
	}

	
}
