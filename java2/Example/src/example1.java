
public class example1 {

	public static void main(String[] args) {
		/*
		 * 배열+기본 (클래스)메소드문제. 1차배열에 다음과 같이 값이 있습니다. 배열리스트 22 33 44 55 66 77 88 99 이며 해당
		 * 전체 값을 모두 더한 총 합계 값을 별도의 메소드로 처리 되도록 합니다. 단, 반복문은 무조건 do~while문으로 작성
		 * 
		 */

		int aa[] = { 22, 33, 44, 55, 66, 77, 88, 99 };
		//void=객체생성+인스턴스(메모리) 등록 해야함
		example1 yn = new example1();
		yn.datas(aa);
		yn=null;
	}

	public void datas(int[] data1) {
		int w = 0;
		int sum = 0;
		do {
			sum = data1[w] + sum;
			w++;
		} while (w < data1.length);
		System.out.println(sum);

	}
}
