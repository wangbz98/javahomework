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
		for(int i = 0; i < n; i++) {  // ����ѭ���������
			for(int j = 0; j < n; j++) {
				System.out.print((int)Math.rint(Math.random()) + " ");  			                                                      
			}                         // �������0-1֮��С����ͨ��ת������ӽ�����������0��1	                
			System.out.print("\n");
		}
	}
}
	
