package box; //package는 메인 java를 실행시키면 함께 실행되는 java 파일 로드 형태 

public class Class1 {

	public static void main(String[] args) { 
		//main package 중에서 실행되는 최초의 java 파일에만 적용합니다.
	
		Class2 c2 = new Class2();
		System.out.println(c2.names);
		
		Adata a = new Adata(); // class.java에 별도 Adata클래스 객체를 로드함 
		System.out.println(a.nemes);
		
		
		
	}

}
