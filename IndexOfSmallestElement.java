package homework2;
import java.util.Scanner;

public class IndexOfSmallestElement {

	public static void main(String[] args) {
		double myArray[] = new double[10];
		Scanner input = new Scanner(System.in);	
		System.out.print("Enter 10 numbers: ");
		for(int i = 0; i < 10; i++) {  // ͨ��ѭ������10�������洢��������
			myArray[i] = input.nextDouble();
		}
		input.close();
		System.out.printf("The index of smallest element is %d\n", indexOfSmallestElement(myArray));
	}
	
	public static int indexOfSmallestElement(double[] array) {
		double min = array[0];  // ������СԪ�ر�������ʼ��ֵΪ�����е�һ��ֵ
		int indexOfMin = 0;  // ������СԪ��������������ʼ��ֵΪ�����е�һ��λ��
		for(int i = 1; i < array.length; i++) {  // ѭ����������Ԫ��
			if(array[i] < min) {  // ����ǰλ��Ԫ��С��min����Сֵ����min��������ֵΪ��ǰֵ�͵�ǰλ��
				min = array[i];
				indexOfMin = i;
			}	
		}
		return indexOfMin;
	}
}
