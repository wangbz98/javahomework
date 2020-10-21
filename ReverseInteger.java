package homework2;
import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = input.nextInt();
		System.out.print("The reversed integer is ");
		reverse(a);
		input.close();
	}
	
	public static void reverse(int number) {
		while(number != 0) {  
			System.out.print(number % 10);  // �����ǰ��������10������
			number /= 10;  // ����ǰ���ֳ���10��ѭ�����д˲���ֱ�����������С����ǿ��ת��Ϊ0
		}
	}

}
