
public class example3 {

	public static void main(String[] args) {
		/*
		 * 배열+기본(클래스)메소드문제 product : 수박, 참외, 사과, 배, 딸기, 키위, 바나나 망고 moneys:
		 * 35000,8000,4000,5500,3800,4400,11000,18900 장바구니에 해당 상품을 모두 담았습니다. 단, 그 중 사과와
		 * 바나나는 제외하고 총 결제 금액을 출력하세요.
		 */

		String product[] = { "수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고" };
		int moneys[] = { 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900 };
		baguni(product, moneys);

	}

	public static void baguni(String pd[], int my[]) {

		//int ea = pd.length; -> for each써서 이거 필요없었음
		//int aa = my.length; -> for each써서 이거 필요없었음
		int total = 0;
		int idx = 0;
		for (String p : pd) {
			if (!p.equals("사과") && !p.equals("바나나")) {
					
					total=my[idx]+total;
				}
			idx++;
		}
		System.out.println(total);

	}

}
/*
 * 선생님 (while문 답)
 * int ea=p.length;
 * int w=0;
 * int total=0;
 * while(w<ea){
 * if(!p[w].equals("사과" && !p[w].equals("바나나")){
 * total=total+m[];
 * 
 }
 w++;
 }
 System.out.println("최종 결제 금액은"+ total + "원");
 }
 * 
*/
