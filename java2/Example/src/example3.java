
public class example3 {

	public static void main(String[] args) {
		/*
		 * �迭+�⺻(Ŭ����)�޼ҵ幮�� product : ����, ����, ���, ��, ����, Ű��, �ٳ��� ���� moneys:
		 * 35000,8000,4000,5500,3800,4400,11000,18900 ��ٱ��Ͽ� �ش� ��ǰ�� ��� ��ҽ��ϴ�. ��, �� �� �����
		 * �ٳ����� �����ϰ� �� ���� �ݾ��� ����ϼ���.
		 */

		String product[] = { "����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����" };
		int moneys[] = { 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900 };
		baguni(product, moneys);

	}

	public static void baguni(String pd[], int my[]) {

		//int ea = pd.length; -> for each�Ἥ �̰� �ʿ������
		//int aa = my.length; -> for each�Ἥ �̰� �ʿ������
		int total = 0;
		int idx = 0;
		for (String p : pd) {
			if (!p.equals("���") && !p.equals("�ٳ���")) {
					
					total=my[idx]+total;
				}
			idx++;
		}
		System.out.println(total);

	}

}
/*
 * ������ (while�� ��)
 * int ea=p.length;
 * int w=0;
 * int total=0;
 * while(w<ea){
 * if(!p[w].equals("���" && !p[w].equals("�ٳ���")){
 * total=total+m[];
 * 
 }
 w++;
 }
 System.out.println("���� ���� �ݾ���"+ total + "��");
 }
 * 
*/
