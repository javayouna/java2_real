import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {

		/*
		 * 다음 사용자가가 복권 관련 프로그램을 요청하였습니다. 사용자가 총 5개의 숫자를 입력하게 됩니다.
		 * "1~46 번 사이의 숫자를 입력해주세요." 5번 물어봐야함 5개숫자를 배열로 생성합니다. (main에서 처리)
		 * 
		 * 외부 class를 이용하여 PC가 직접 당첨 번호 5개를 랜덤하게 뽑아냅니다.
		 * PC가 뽑은 5개의 숫자를 배열로 생성합니다. (외부Class method로 생성)
		 * 
		 * 별도의 결과 method를 하나 더 생성하여 사용자가 입력한 5개의 배열 데이터와 
		 * pc가 뽑은 배열 데이터를 해당 method로 전달하여,
		 * 출력하시면 됩니다.
		 * 
		 * 단, 모든 사용하는 반복문은 무조건 do ~ while 문으로 작성합니다.
		 * 
		 * [결과] 
		 * 1. 사용자가 뽑은 5개의 숫자 
		 * 2. pc가 뽑은 5개의 숫자가 나오면 됨 =2개의 메소드
		 *  [힌트] ??스텝을 밟아야함 !!
		 * int aa =5; card c =new card(); c.acard(aa);
		 * 
		 * 
		 * class card { public void acard(int){ //pc(5) int bb=10; card.bcard(user,bb);
		 * } public static void bard(int user1,int pc) { //사용자 (5),pc(5)
		 * System.out.println(user1+ " "+pc);
		 */

		Scanner ii = new Scanner(System.in);
		int a[] = new int[5];
		int i=0;
		do {
			System.out.println("1~46번 사이의 숫자를 입력해주세요.");
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
	

