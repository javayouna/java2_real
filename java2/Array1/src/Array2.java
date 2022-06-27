
public class Array2 {

	public static void main(String[] args) {

		/*
		 * hong kim park lee jang jung
		 */

		/*
		 * 응용문제 해당 사용자 리스트 배열이 있습니다. 해당 배열값 중 사용자 아이디 3단어 초과만 출력시키시오.
		 * 
		 */

		String arr1[] = { "hong", "kim", "park", "lee", "jang", "jung" };

		int member = arr1.length;
		int w = 0;
		int word;// 각각의 배열 데이터의 문자 갯수파악
		while (w < member) {
			word = arr1[w].length(); // 문자 갯수파악
			if (word > 3) { // 세단어 초과 데이터 출력
			//ystem.out.println(arr1[w]);
			}

			w++;
		}

		/*
		 * 응용문제
		 * 배열데이터 다음과 같음 
		 * 15 60 11 14 27
		 * 다음 데이터 값을 모두 더해서 최종 결과값을 출력하시오.
		 */
		
		int num[]= {15,60,11,14,27}; 
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
		;
		
		
		
		
	}

}
