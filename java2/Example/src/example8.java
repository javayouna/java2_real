import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {

		/*
		 * ���� ����ڰ��� ���� ���� ���α׷��� ��û�Ͽ����ϴ�. ����ڰ� �� 5���� ���ڸ� �Է��ϰ� �˴ϴ�.
		 * "1~46 �� ������ ���ڸ� �Է����ּ���." 5�� ��������� 5�����ڸ� �迭�� �����մϴ�. (main���� ó��)
		 * 
		 * �ܺ� class�� �̿��Ͽ� PC�� ���� ��÷ ��ȣ 5���� �����ϰ� �̾Ƴ��ϴ�.
		 * PC�� ���� 5���� ���ڸ� �迭�� �����մϴ�. (�ܺ�Class method�� ����)
		 * 
		 * ������ ��� method�� �ϳ� �� �����Ͽ� ����ڰ� �Է��� 5���� �迭 �����Ϳ� 
		 * pc�� ���� �迭 �����͸� �ش� method�� �����Ͽ�,
		 * ����Ͻø� �˴ϴ�.
		 * 
		 * ��, ��� ����ϴ� �ݺ����� ������ do ~ while ������ �ۼ��մϴ�.
		 * 
		 * [���] 
		 * 1. ����ڰ� ���� 5���� ���� 
		 * 2. pc�� ���� 5���� ���ڰ� ������ �� =2���� �޼ҵ�
		 *  [��Ʈ] ??������ ��ƾ��� !!
		 * int aa =5; card c =new card(); c.acard(aa);
		 * 
		 * 
		 * class card { public void acard(int){ //pc(5) int bb=10; card.bcard(user,bb);
		 * } public static void bard(int user1,int pc) { //����� (5),pc(5)
		 * System.out.println(user1+ " "+pc);
		 */

		Scanner ii = new Scanner(System.in);
		int a[] = new int[5];
		int i=0;
		do {
			System.out.println("1~46�� ������ ���ڸ� �Է����ּ���.");
			int aa = ii.nextInt();
			a[i] = aa;
			i++;
		}
		while(i<5);
		rotto.acard(a);
		ii.close();			
	}

}

class rotto {
	public static void acard(int user[]) {
		int b;
		int w=0;
		int hhh[]=new int[5];
		do {
			b=(int)(Math.random()*46)+1;
			hhh[w]=b;
			w++;
			}while(w<5);
	
		bcard(user, hhh);

	}

	public static void bcard(int cc[], int ccc[]) {
		System.out.println(Arrays.toString(cc));
		System.out.println(Arrays.toString(ccc));
		
	}
	}
	

