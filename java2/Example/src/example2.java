import java.security.PublicKey;
import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {
	
		/*
		 * �迭+�⺻(Ŭ����)�޼ҵ� ����
		 * product : ����, ����, ���, ��, ����, Ű��, �ٳ��� ���� ��
		 * ����, ��, Ű���� ���� �Ͽ����ϴ�.
		 * �ش� ���� �� �迭�� �ٽ� �� ����Ʈ �ϴ� �ڵ带
		 * �ۼ��ϼ���.
		 * ��, �ش� ó�������� ��� ������ �޼ҵ忡�� ó���� �Ǿ���ϸ�
		 * �ݺ����� Free�Դϴ�.
		 * ��� : [����, ���, ����, �ٳ���, ����]
		 */
	String product[] = {"����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����"};
	basket(product);
	
	}
	
	public static void basket(String[] pd) {
		int ea = pd.length;
		int no = 5;
		int idx = 0;
		String newproduct[] = new String[no];
		for(String p:pd) {
				if (!p.equals("����")&&!p.equals("��")&&!p.equals("Ű��")) {
					newproduct[idx] = p;
					idx++;
				}
			
			
		}
		System.out.println(Arrays.toString(newproduct));
		
	}
		
	}
