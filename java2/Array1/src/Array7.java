import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		/*���빮��
		 ����� ���� ������ �� ������ ������ ����
		 �� �� ������������ �� 3�̸� ���� Ȯ�� �Ͽ�
		 �迭 �����͸� �簡���մϴ�.
		 
		 ȫ�浿,�̼���,������,�������,������,������
		 4,3,1,1,2,2
		 
		 ���:["������","�������","������","������"]		 
		 */
		String member[] = {"ȫ�浿","�̼���","������","�������","������","������"};
		int lv[] = {4,3,1,1,2,2}; //���� ����
		String new_member[]=new String[8];
		int ea = member.length;
		int f;
		int ct=0;
		 for(f=0;f<ea;f++) {
			 if(lv[f]<3) {
	
				 new_member[ct]=member[f];
				 ct++;
			 }
			 
			 
		 }
		System.out.println(Arrays.toString(new+member));
//Arrays.toString�� ��ƿ! : ����, ����, �Ҽ� [] ���� �迭 �������� ����ϴ� �Լ��Դϴ�.
}

}
