
public class example7 {

	public static void main(String[] args) {
		/*
		 * 다차원 배열로 생성 + 외부 class 및 메소드 사용 
		 * [data] 
		 * {"홍길동", "합격"},
		 * {"이순신", "합격"},
		 * {"강감찬", "불합격"},
		 * {"김유신", "합격"},
		 * {"유관순", "불합격"},
		 * {"장보구", "불합격"}
		 * 다차원 배열 형태이며 , 해당 값중 합격자만 출력되도록 합니다.
		 * 단, 배열값을 외부 클래스 안에 메소드에서 처리가 되도록 합니다.
		 * 결과:홍길동 이순신 김유신
		 */
	
	Test.name();
	
	}
}

class Test{
	public static void name() {

		String pro[][] = {
				{"홍길동", "합격"},
				{"이순신", "합격"},
				{"강감찬", "불합격"},
				{"김유신", "합격"},
				{"유관순", "불합격"},
				{"장보구", "불합격"}
		};
		
		for(int i=0;i<pro.length;i++) {
			if(pro[i][1].equals("합격")) {
				System.out.println(pro[i][0]);
				
			}
		}
		
		
	}
}
