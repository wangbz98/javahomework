package homework2;
import java.util.Scanner;

public class SumMajorDiagonal {

	public static void main(String[] args) {
		double m[][] = new double[4][4];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 4-by-4 matrix row by row: \n");
		for(int i = 0; i < 4; i++) {  // ͨ������ѭ���������ά�����е�Ԫ��
			for (int j = 0; j < 4; j++)
				m[i][j] = input.nextDouble();
		}
		input.close();
		sumMajorDiagonal(m);
	}
	
	public static void sumMajorDiagonal(double[][] m) {
		double sum = 0.0;
		int len = m.length;  // �õ���������
		for(int i = 0; i < len; i++) {  // ͨ��ѭ���Ӻ�ÿ���е����Խ���Ԫ��
			sum += m[i][i];
		}
		System.out.printf("Sum of the elements in the major diagonal is %f", sum);
	}
}
