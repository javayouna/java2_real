
public class Double_loop4 {

	public static void main(String[] args) {

		/*
		 * 응용문제 밖에 for 단에 do~while
		 */
		int f;
		for (f = 2; f <= 3; f++) {

			int w = 1;
			do {
				// System.out.println(f + "*" + w + "=" + (f * w));
				w++;
			} while (w <= 9);

		}

		/*
		 * 응용문제 구구단 7단부터~9단까지 단, 각 구구단 곱셈 값은 5까지만 나오도록 합니다. 7*1=7...7*5=35...9*5=45 제약
		 * 밖에는 do while 안 while
		 */

		int h = 7;
		int total;
		do {
			int p = 1;
			while (p <= 5) {
				total = f * p;
				// System.out.printf("%d * %d = %d ",h,p,total);
				p++;
			}
			h++;
		} while (h <= 9);

		/*
		 * 응용문제 다음 결과값을 확인하여 코드를 작성합니다. 단, for ~ while으로 제작 되도록 합니다. 1*1=1 2*2=2 ..
		 * 9*9=81
		 */
		int i = 1;
		for (i = 1; i <= 9; i++) {

			int ii = i;
			while (ii == i) { // while(i<=ii)도 됨
				System.out.println(i + " * " + ii + " = " + (i * ii));
				ii++;
			}

		}

		/* 응용문제 다음 해당 결과 값처럼 출력 되도록
		 * 더블 반복문을 이용하세요~
		 * (while~do~while)
		 * 1+1=2 2+1=3 2+2+4 3+1=4 3+2=5 3+3=6 4+1=5 4+2=6 4+3=7 4+4=8
		 * 
		 */
		
		
	}

}
