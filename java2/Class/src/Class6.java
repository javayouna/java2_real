import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {

		int num = 3;
		datalist da = new datalist();
		da.array_data(num);

		// String pay="�ſ�ī��";
		String pay = "������";
		if (pay.equals("�ſ�ī��")) {
			da.pay1(); // �ش� ���ǿ� �´� �޼ҵ带 ȣ��
		} else {
			da.pay2(pay); // �޼ҵ忡 ��ü���� �¿��� ���� (��ü���� ���Ѵ�)
		}

		/*
		 * ���빮�� �ش� �ε��� class���� agrees��� �̸��� ������ �ֽ��ϴ�. main �޼ҵ忡�� ����ڰ� "������","���Ǿ���"�� �Է��ϰ�
		 * �˴ϴ�. ���������� �Է� �Ǿ��� ��� "ȸ�������� ���� �˴ϴ�." ��� �޼����� ����ϰ�, ���Ǿ����� �Է½�
		 * "���Ǹ� �ϼž� ���� �˴ϴ�." ��� ��� �ǵ��� �ϼ���. ��, agrees Ŭ�����ȿ� void �޼ҵ� �� �� �Ǵ� �� ���� �����Ͽ�
		 * �ڵ带 �����ϼ���.
		 */

	}
}

	

class datalist {
	/*
	 * static�޼ҵ带 Ȱ���ϴ� ����: ���� package���� �ش� �޼ҵ带 ���� ����ؾ��ϴ� �κ��� static�� �̿��Ͽ� �����
	 * static(�����޼ҵ�) : �������̵��� ����� �� ���� 
	 * void�� ���(�����޼ҵ�) : �������̵��� ����� �� ����
	 * �������̵� ���� 
	 * class a{
	 * void �޼ҵ�
	 * }
	 * class b extend a{
	 * void �޼ҵ�
	 * }
	 */
	
}
				Scanner sc = new Scanner(System.in);
				agrees agr = new agrees();
				String atext =sc.next();
				agr.a(atext);
				sc.close();
			 }
			 


	class agrees {
		public void a(String k) {
			String msg;
			if(!k.equals("������")) {
				msg = "���Ǹ� �ϼž� ���� �˴ϴ�.";
		}

			else {
				msg = "ȸ�������� ���� �˴ϴ�.";
		}

	}
	
	
	public void array_data(int a) { // static���� �޼ҵ�
		int w = 1;
		while (w < 10) {
		//	System.out.println((a * w));
			w++;

		}
	}

	public void pay1() {
	//	System.out.println("�ſ�ī��� ���� �����մϴ�.");
	}

	public void pay2(String pm) {
	//	System.out.println(pm + "���� ���� �����մϴ�.");
	}

}
}
