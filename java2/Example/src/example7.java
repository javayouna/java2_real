
public class example7 {

	public static void main(String[] args) {
		/*
		 * ������ �迭�� ���� + �ܺ� class �� �޼ҵ� ��� 
		 * [data] 
		 * {"ȫ�浿", "�հ�"},
		 * {"�̼���", "�հ�"},
		 * {"������", "���հ�"},
		 * {"������", "�հ�"},
		 * {"������", "���հ�"},
		 * {"�庸��", "���հ�"}
		 * ������ �迭 �����̸� , �ش� ���� �հ��ڸ� ��µǵ��� �մϴ�.
		 * ��, �迭���� �ܺ� Ŭ���� �ȿ� �޼ҵ忡�� ó���� �ǵ��� �մϴ�.
		 * ���:ȫ�浿 �̼��� ������
		 */
	
	Test.name();
	
	}
}

class Test{
	public static void name() {

		String pro[][] = {
				{"ȫ�浿", "�հ�"},
				{"�̼���", "�հ�"},
				{"������", "���հ�"},
				{"������", "�հ�"},
				{"������", "���հ�"},
				{"�庸��", "���հ�"}
		};
		
		for(int i=0;i<pro.length;i++) {
			if(pro[i][1].equals("�հ�")) {
				System.out.println(pro[i][0]);
				
			}
		}
		
		
	}
}