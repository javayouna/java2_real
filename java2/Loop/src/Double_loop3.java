
public class Double_loop3 {

	public static void main(String[] args) {
		/* 
		 ���빮�� ���� ������� ��� �ǵ��� for������ �ۼ��ϼ���..
		 5+2=7
		 5+3=8
		 5+4=9
		 5+5=10
		 6+2=8
		 6+3=9
		 6+4=10
		 6+5=11
		 7+2=9
		 7+3=10
		 7+4=11
		 7+7=12
		 ...
		 9+5=14 
		  
		 */

		int i, ii;
		 for(i=5;i<=9;i++)	{ 
			 for(ii=2;ii<=5;ii++) {
			 
			// System.out.println(i+" + "+ii+" = "+(i+ii));
			  
			 }
			 }

		/* ���빮�� ���� while������ ���� */
		 int k=9;
		 while (k>=7) {
			 int kk=7;
			 while (kk>=5) {
		//	 System.out.println(k+"*"+kk+"="+(k*kk));
			 kk--; 
			 }
		 k--;
		 }
		 
		
		 
		/*���빮�� do ~ while ������ ���� 
		 5+4=9
		 5+5=10
		 5+6=11
		 5+7=12
		 ...
		 3+7=10
		 */
		
		 
		 int t=5;
		 do {
			
			 int tt=4;
			 do {
				 System.out.println(t+" + "+tt+" = "+(t+tt));
				 tt++;
			 } while(tt<=7);			 

			 t--;
		 } while(t>=3);
		 
		 
	}

}
