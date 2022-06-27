import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/* 응용문제
		 * 장바구니에 여러 상품이 담겨져 있습니다.
		 * 그 중 택배기가 별도로 측정되는 금액만 추출하세요.
		 * 택배비는 30000원이상(포함)
		 * 15000 48000 67000 8000 118200 49800 6000 18700
		 */
		 int a[] = new int[4]; 
		 int cost [] = {15000,48000,67000,8000,118200,49800,6000,18700};
		 int aa=a.length;
		 int i=cost.length;
		 int c=0;
		 	for (aa=0;aa<i;aa++) {
		 		//System.out.println(cost[ii]);
		 		if (cost[aa]>=30000) {
		 			a[c]=cost[aa];
		 			c++;
		 		}

		 	}	 
		 	System.out.println(Arrays.toString(a));
		
	
		 	
		 	
		 	
		 	
		 	
		 	
	}

}
