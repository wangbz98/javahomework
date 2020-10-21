package homework2;
import java.util.Scanner;

public class IndexOfSmallestElement {

	public static void main(String[] args) {
		double myArray[] = new double[10];
		Scanner input = new Scanner(System.in);	
		System.out.print("Enter 10 numbers: ");
		for(int i = 0; i < 10; i++) {  // 通过循环输入10个数，存储到数组中
			myArray[i] = input.nextDouble();
		}
		input.close();
		System.out.printf("The index of smallest element is %d\n", indexOfSmallestElement(myArray));
	}
	
	public static int indexOfSmallestElement(double[] array) {
		double min = array[0];  // 声明最小元素变量，初始赋值为数组中第一个值
		int indexOfMin = 0;  // 声明最小元素索引变量，初始赋值为数组中第一个位置
		for(int i = 1; i < array.length; i++) {  // 循环遍历数组元素
			if(array[i] < min) {  // 若当前位置元素小于min中最小值，则min和索引赋值为当前值和当前位置
				min = array[i];
				indexOfMin = i;
			}	
		}
		return indexOfMin;
	}
}
