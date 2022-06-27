import java.util.Arrays;
import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		/* 
		 * 배열생성+기본(클래스)메소드 문제
		 * 사용자가 다음 질문에 값을입력하게 됩니다.
		 * "학급 학생 이름을 입력해주세요."
		 * 총 배열 데이터는 5개가 생성됩니다.// 질문 5번
		 * 별도의 메소드에서 해당 사용자가 입력한 값을 리스트로 구성하여
		 * 출력하세용
		 * 예시 )
		 * 사용자가 입력한 형태 : hong kim park lee jang
		 * 결과 )
		 * hong,kim,park,lee,jang
		 *
		 */
		Scanner sc = new Scanner(System.in);
		String msg = "학급 학생 이름을 입력해주세요.";
		String sum="";
		for(int i=0;i<=4;i++) {
			System.out.println(msg);
			String user= sc.nextLine();
			sum+=(user+",");
		}
	
		arrays(sum);
	}
	public static void arrays(String k) 
	{
	//	System.out.println(k);
	//	k=k.trim();
		String user1[] =k.split(" "); // split:문자열 또는 숫자열을 특정문자 기준으로 배열을 만들 수 있는 명령어
	System.out.println(Arrays.toString(user1));
	}

	
}
