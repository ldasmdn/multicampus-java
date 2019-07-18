import java.util.Scanner;

public class ElecFeeTest {
	public static void main(String[] args) {
		
		int count = 0;
		double result = 0;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("사용량 : ");
		int use = scn.nextInt();
		
		final int[] BASIC_FEE = {410, 910, 1600, 3850, 7300, 12940};
		final double[] EXTRA_FEE = {60.7, 125.9, 187.9, 280.6, 417.7, 709.5};
		
		
		while(true) {
			if(use > 100 && count < 5) {
				result += 100 * EXTRA_FEE[count];
				count++;
				use -= 100;
			} else {
				result += BASIC_FEE[count] + (use * EXTRA_FEE[count]);
				break;
			}
		}
		
		System.out.println("결과 : " + result);

	}
}
