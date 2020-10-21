package homework2;
import java.util.Scanner;

public class PrintMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		printMatrix(n);
		input.close();
	}
	
	public static void printMatrix(int n) {
		for(int i = 0; i < n; i++) {  // 两层循环输出矩阵
			for(int j = 0; j < n; j++) {
				System.out.print((int)Math.rint(Math.random()) + " ");  			                                                      
			}                         // 随机生成0-1之间小数，通过转化成最接近的整数生成0、1	                
			System.out.print("\n");
		}
	}
}
	
