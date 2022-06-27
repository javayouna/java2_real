
public class Switch_loop {

	public static void main(String[] args) {
		
		String sign="+";
		int total;
		/* case안에 각각의 반복문을 사용할 수 있습니다.
		 * 또한 동일한 변수명을 사용해도 가능하며, case각각
		 * 다르게 작동하기 때문에 문제가 되는 사항은 없습니다.
		 * 단, case는 하나의 조건이 맞을 경우 나머지 case는 절대 작동하지 않음
		 */
		switch(sign) {
		case "+" ->{
			int f;
			total = 0;
			for(f=1;f<=5;f++) {
				total = total+f;
				//System.out.println("총 1~5까지 계산된 값은"+total); //sysout은 반복문 안에다가 !! ! 밖으로 뺄거면 
				//7번째 줄 int total=0; 으로 하던가.. 
			}
			System.out.println("총 1~5까지 계산된 값은 "+total);
		}
		case "-" ->{
			total = 0;
			System.out.println("음수 값은 출력 되지 않습니다.");
		}
		case "*" ->{
			total = 1;
			int f=1;
			do {
				total=total*f;
			f++;
			}while(f<=5);
			System.out.println("총 1~5까지 계산된 값은 "+total);
			
		}
		case "/" ->{
			total = 0;
		}
	
		}
		

	}

}
