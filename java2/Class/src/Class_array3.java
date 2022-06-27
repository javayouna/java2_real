import java.util.Arrays;
import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {

		/*
		 * 응용문제 다음 문자 배열 데이터 값이 있습니다. a1 : 홍길동 이순신 강감찬 유관순 김유신 a2 : 100 80 39 60 55
		 * 
		 * "검색하고자 하는 이름을 적어주세요" 출력핳게 됩니다. 검색어에 이순신이라고 검색하면 "이순신님은 80점입니다." 메인 클래스에서 사용안함
		 * 메인 클래스는 배열 선언할뿐, 나머지는 클래스에 전달 라고 출력이 되어야 합니다.
		 * 
		 */

		
		String a1[] = {"홍길동", "이순신","강감찬","유관순","김유신"}; //a1 배열
		String a2[] = {"100", "80", "39", "60", "55"}; //a2 배열 
	
		Scanner sc= new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요");
		String usernm = sc.next(); //사용자가 입력한 데이터 usernm
		
		jumsu j = new jumsu(); //★이게 너무 헷갈림 
		j.ck(a1, a2,usernm); //★이게 너무 헷갈림  (a1, a2, usernm) 매개변수라고함!!
		//j.ck(1,2,3) => 인수값 (인자값)		
		sc.close();
	}
}

class jumsu{
	//메소드에 ()안에 값 
	public void ck(String data1[],String data2[],String user) { //이것도 매개변수!!
		
		int w =0;
		int ea=data1.length;
		boolean ck = false;
		do {
			if(user.equals(data1[w])) {//배열에 동일한 값이 있을 경우 
				String js = data2[w]; 
				System.out.printf("%s님은 %s점 입니다.",user,js);
				ck = true;
			}
			w++;
		}while(w<ea);
		if(ck==false) { //main class에서 사용자 검색을 했을 경우 배열값에 없는 상황 
			System.out.println("검색하고자 하는 사용자는 확인이 안 됩니다.");
			
		}
	
	}
}
