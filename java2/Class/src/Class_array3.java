import java.util.Arrays;
import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {

		/*
		 * ���빮�� ���� ���� �迭 ������ ���� �ֽ��ϴ�. a1 : ȫ�浿 �̼��� ������ ������ ������ a2 : 100 80 39 60 55
		 * 
		 * "�˻��ϰ��� �ϴ� �̸��� �����ּ���" ����K�� �˴ϴ�. �˻�� �̼����̶�� �˻��ϸ� "�̼��Ŵ��� 80���Դϴ�." ���� Ŭ�������� ������
		 * ���� Ŭ������ �迭 �����һ�, �������� Ŭ������ ���� ��� ����� �Ǿ�� �մϴ�.
		 * 
		 */

		
		String a1[] = {"ȫ�浿", "�̼���","������","������","������"}; //a1 �迭
		String a2[] = {"100", "80", "39", "60", "55"}; //a2 �迭 
	
		Scanner sc= new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���");
		String usernm = sc.next(); //����ڰ� �Է��� ������ usernm
		
		jumsu j = new jumsu(); //���̰� �ʹ� �򰥸� 
		j.ck(a1, a2,usernm); //���̰� �ʹ� �򰥸�  (a1, a2, usernm) �Ű����������!!
		//j.ck(1,2,3) => �μ��� (���ڰ�)		
		sc.close();
	}
}

class jumsu{
	//�޼ҵ忡 ()�ȿ� �� 
	public void ck(String data1[],String data2[],String user) { //�̰͵� �Ű�����!!
		
		int w =0;
		int ea=data1.length;
		boolean ck = false;
		do {
			if(user.equals(data1[w])) {//�迭�� ������ ���� ���� ��� 
				String js = data2[w]; 
				System.out.printf("%s���� %s�� �Դϴ�.",user,js);
				ck = true;
			}
			w++;
		}while(w<ea);
		if(ck==false) { //main class���� ����� �˻��� ���� ��� �迭���� ���� ��Ȳ 
			System.out.println("�˻��ϰ��� �ϴ� ����ڴ� Ȯ���� �� �˴ϴ�.");
			
		}
	
	}
}
