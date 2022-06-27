public class example5 {

	public static void main(String[] args) {
		/*
		 * 2차배열+기본(클래스)메소드 문제 등록된 고객중 vip고객만 리스트를 출력하세요.
		 * 
		 * user_list: 홍길동 이순신 강감찬 유관순 세종대왕 김유신 계백장군 
		 * user_level: gold, vip, guest, gold, vip, vip, guest
		 * 
		 * 결과출력: 이순신, 세종대왕, 김유신
		 */

		
		
		String user[][]= {
				{"홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군"},
				{"gold", "vip", "guest", "gold", "vip", "vip", "guest"}
				};
		
		sum(user);
	} 
			
		//name.length = 행
		//name[0].length = 갯수

	public static void sum(String name[][]) {
		String an = "";
		for (int i = 0; i < name[0].length; i++) {
				if (name[1][i].equals("vip")) {
					an+=name[0][i]+",";
				}

		}

		System.out.println(an);
	}

}
/*example5 ex = new example5();
  ex.level(user_list);
 
 public void level(){
  int ea =name.length;
  int =name[1].length;
  
  
  
  
 */






