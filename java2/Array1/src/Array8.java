import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		
		/* �����迭
		int a[]=new int[2];
		a[0] = 22;
		a[1] = 32;
		a[2] = 42;
		/* �����迭
		int b[] = {1,2,3,4};
		int [] c = {1,2,3,4};
		int [] d = new int []{1,2,3,4};
		
		/* 2�� �迭 [] []*/
		/* 2�� �����迭*/	
		String member [] [] = {	
				{"ȫ�浿","������","������"},
				{"25","31","22"}
		};
	
		int ea = member.length; //�迭 ������ � �ִ��� Ȯ��
		int data_ea = member[0].length; //�ش� �迭���� �����Ͱ�ü�� ��ִ��� Ȯ��
		//System.out.println(data_ea);
			
		int  f, ff; 
		for(f=0;f<ea;f++) { //ū �ݺ����� �迭 ���� ��ŭ loop
			//System.out.println(Arrays.toString(member[f]));
			for(ff=0;ff<data_ea;ff++) { //���� �ݺ����� �迭�� �ִ� ������ ���� ��ŭ loop
				//System.out.println(member[f][ff]); //���⿡�� Arrays.toString �Ƚᵵ �� 
			}
		}
			int [][] datas = {
					{1,3,5},
					{2,4,6}
			};
			//System.out.println(datas[1][1]);
		int fea = datas.length;
		int dea = datas[0].length;
		int total=0;
		int w,ww;
		for(w=0;w<fea;w++) {
			for(ww=0;ww<dea;ww++) {
			//ystem.out.println(datas[w][ww]);
			total=total+datas[w][ww];
			}
		}
		
		//System.out.println("�� �հ�� "+ total ); 
		
		/*���빮��
		�ش� ������ �迭�� �ִ� ��� �� ��
		¦������ ��� ���ϼ���~^^
		1�� ������ : 11, 42, 22, 16
		2�� ������ : 7 33 10 29 */
		
		
			int num [][]= {{11,42,22,16},{7,33,10,29}};
			int aa=num.length;
			int aaa=num[0].length;
			int sum=0;
			int bb,cc;
			for(bb=0;bb<aa;bb++) {
				for(cc=0;cc<aaa;cc++) {
					if (num[bb][cc]%2==0) { 
						sum+=num[bb][cc];
						
					}
				}
				
			}
					System.out.println(sum);
		}

	}
