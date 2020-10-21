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
			System.out.print(number % 10);  // 输出当前整数除以10的余数
			number /= 10;  // 将当前数字除以10，循环进行此操作直至该整数变成小数，强制转换为0
		}
	}

}
