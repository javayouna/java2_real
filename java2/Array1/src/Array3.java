import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

		/*
		 * int num[] = {5,10,15,20,25,30,35}; /*for each문을 사용 할 때는 인덱스 번호 필요없이 사용 할 경우
		 * -> 단순한 배열에 씀 for~do~while문 사용 할 때는 인덱스 번호 필요 할 떄 사용 -> 복잡한 배열에 씀 인덱스 번호:
		 * [0][1][2]
		 * 
		 * for(int f:num) { //int f가 순차적으로 data배열값을 받아서 저장시킵니다. if(f%2==0)
		 * System.out.println(f); }
		 */

		/*
		 * String pay[] = { "무통장입금", "신용카드", "휴대폰", "상품권", "쿠폰" }; Scanner sc = new
		 * Scanner(System.in); // System.out.println("결제 형태를 선택해주세요"); String pm =
		 * sc.next(); for (String z : pay) { // ★배열 데이터가 문자이므로 받는 변수 형태 또한 문자형 사용해야 함 if
		 * (pm.equals(z)) { if (z.equals("휴대폰")) {
		 * //System.out.println("현재 시스템 점검으로 해당 결제는 사용 하실 수 없습니다.");
		 * 
		 * } else { //System.out.println(pm + "로 결제 진행 됩니다."); }
		 * 
		 * // System.out.println(pm+"로 결제 진행됩니다."); } } sc.close();
		 */

		/*
		 * 응용문제 {"햄버거", "피자", "치킨", "커피"} "주문하고자 하는 음식을 선택해주세요." 해당 질문은 총4번을 물어봄 단,
		 * "주문종료"라고 사용자가 입력시 그 즉시 주문은 종료되며, 주문내역을 출력하시면 됩니다.
		 */
//	 String food[]= {"햄버거", "피자", "치킨", "커피"};
//		
//		String msg = "주문하고자 하는 음식을 선택해주세요. 햄버거,피자,치킨,커피";
//		Scanner uu =new Scanner(System.in);
//		int sum=0;
//		for(int i=1;i<5;i++) {
//			System.out.println(msg);
//			String user=uu.next();
//
//			
//		}
//	
//		System.out.println("주문이 종료되었습니다. 주문내역은" + sum + "입니다");
//
//		uu.close();

		String menus[] = { "햄버거", "피자", "치킨", "커피" };
		Scanner sc = new Scanner(System.in);
		String user;
		String user_menu[] = new String[4];
		int ct = 0;

		for (String f : menus) {
			
			/*Scanner가 반복문 안에 적용시 loop로 무조건 반복하지는 않음
			 * 사용자가 입력 할 때 마다 반복문 범위만큼 출력하는 형태임
			 */
			
			System.out.println("메뉴를 선택해주세요");
			user = sc.next();
			if (user.equals("주문종료")) {
				break;
			} else {
				for (String ff : menus) {
					if (user.equals(ff)) {
						user_menu[ct] = ff;
						ct++;
					}
				}
			}
			// System.out.println(f);
		}
		sc.close();
		System.out.println("주문하신 메뉴는 다음과 같습니다." + Arrays.toString(user_menu));
	}
}
