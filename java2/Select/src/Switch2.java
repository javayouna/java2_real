import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ����ڰ� ������ ���� ������ �޽��ϴ�.
		 * 
		 * Q."1~5"������ ���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�.
		 * 
		 * A: 1= 5% �������� 2= 10% �������� 3~4= �ù�� ���� 5=���� ��ȸ��
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1~5 ���ڸ� �ϳ� �Է����ּ���.");
		int user = sc.nextInt();  
		String msg; 
		/*

		switch (user) {
		case 1:
			msg = "5% ��������";
			break;
		case 2:
			msg = "10% ��������";
			break;
		case 3,4:
			msg ="�ù�� ����";
			break;
		case 5:
			msg ="���� ��ȸ��";
			break;
		default:
			msg ="�ùٸ��� ���� �����Դϴ�.";
			break;
		}
		*/
		/* switch version ���� */
		switch(user) {
		case 1 ->{
			msg = "5% ��������";
		}
		case 2 ->{
			msg = "10% ��������";	
		}
		case 3,4 ->{
			msg = "�ù�񹫷�";
		}
		case 5 ->{
			msg = "���� ��ȸ��";		
		}
		}
		System.out.println("msg");
		sc.close();
	}

}
