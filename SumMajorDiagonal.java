package homework2;
import java.util.Scanner;

public class SumMajorDiagonal {

	public static void main(String[] args) {
		double m[][] = new double[4][4];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 4-by-4 matrix row by row: \n");
		for(int i = 0; i < 4; i++) {  // 通过两层循环，输入二维数组中的元素
			for (int j = 0; j < 4; j++)
				m[i][j] = input.nextDouble();
		}
		input.close();
		sumMajorDiagonal(m);
	}
	
	public static void sumMajorDiagonal(double[][] m) {
		double sum = 0.0;
		int len = m.length;  // 得到矩阵行数
		for(int i = 0; i < len; i++) {  // 通过循环加和每行中的主对角线元素
			sum += m[i][i];
		}
		System.out.printf("Sum of the elements in the major diagonal is %f", sum);
	}
}
