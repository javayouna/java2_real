import java.text.SimpleDateFormat;
import java.util.Date;

public class Double_loop1 {

	public static void main(String[] args) {

	/*	Date today = new Date();
		System.out.println(today);

		SimpleDateFormat date = new SimpleDateFormat("YYYY/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("H:m:s"); // 대문자 H는 12시+로 나옴
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		// format : 규격화된 형태로 값을 표현할때 사용하게 됩니다.		
		*/
		int money = 10000;
		int coupon = 20;
			double a = coupon * 0.01;
			System.out.println(a);
			double b = money*a;
			System.out.println(b);
		
		double c = money-b;
		System.out.println(c);
		
		
			
	   	int f, ff;
	   	int total;
	   	for(f=1;f<=3;f++) {
	   		//System.out.println(f);
	   		for(ff=1;ff<=4;ff++) {
	   	//	System.out.println(ff);
	   		total=f+ff;
	   		System.out.println(f+" + "+ff);
	   		}
	   	}
	}

}

