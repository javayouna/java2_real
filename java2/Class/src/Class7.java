
public class Class7 {

	public static void main(String[] args) {
		//class�� �⺻ �޼ҵ� ��ü �ʵ尪 ����
		String mid ="hong";
		String mname ="ȫ�浿";
		java1 jv1=new java1(mid,mname);
		jv1.java2();
		
		
	}

}


class java1{
	//java1 class�� main���� ��ü���� �� �ν��Ͻ��� �����ϸ� 
	//�ٷ� �۵��ϴ� class �⺻ �޼ҵ��Դϴ�.
	public java1(String a, String b) { //class���̶� �����ؾ��� class�� �⺻���� ����ϴ� �޼ҵ�
		System.out.println(a+b);
		java2(); //void �޼ҵ带 �ٷ� ȣ�� �� �� �ֽ��ϴ�. 
	}
	public void java2() {
		System.out.println("test");
		
		
		
		
	}
}