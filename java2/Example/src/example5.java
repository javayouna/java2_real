public class example5 {

	public static void main(String[] args) {
		/*
		 * 2���迭+�⺻(Ŭ����)�޼ҵ� ���� ��ϵ� ���� vip���� ����Ʈ�� ����ϼ���.
		 * 
		 * user_list: ȫ�浿 �̼��� ������ ������ ������� ������ ����屺 
		 * user_level: gold, vip, guest, gold, vip, vip, guest
		 * 
		 * ������: �̼���, �������, ������
		 */

		
		
		String user[][]= {
				{"ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺"},
				{"gold", "vip", "guest", "gold", "vip", "vip", "guest"}
				};
		
		sum(user);
	} 
			
		//name.length = ��
		//name[0].length = ����

	public static void sum(String name[][]) {
		String an = "";
		for (int i = 0; i < name[0].length; i++) {
				if (name[1][i].equals("vip")) {
					an+=name[0][i]+",";
				}

		}

		System.out.println(an);
	}

}
/*example5 ex = new example5();
  ex.level(user_list);
 
 public void level(){
  int ea =name.length;
  int =name[1].length;
  
  
  
  
 */






