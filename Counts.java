package homework2;

public class Counts {

	public static void main(String[] args) {
		int[] counts = new int[10];  // ����һ������10���������飬���ڴ��ÿ��λ������ʾ���ֵĳ��ִ���
		for(int i = 0; i < 100; i++) {  // ѭ��100�Σ�ÿ���������һ��0-9֮�������
			int randomNumber = (int)(Math.random() * 10);  // ����0-1֮���С��������10����Ϊ��ȡ0����ȡ1���õ�0-9֮�������
			counts[randomNumber]++;  // ����������ʾλ�ô����ִ�����1
		}
		for(int i = 0; i < counts.length; i++) {
			System.out.printf("Appearance times of %d are %d\n", i, counts[i]);
		}
	}
}
