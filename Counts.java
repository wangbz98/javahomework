package homework2;

public class Counts {

	public static void main(String[] args) {
		int[] counts = new int[10];  // 建立一个包含10个数的数组，用于存放每个位置所表示数字的出现次数
		for(int i = 0; i < 100; i++) {  // 循环100次，每次随机生成一个0-9之间的整数
			int randomNumber = (int)(Math.random() * 10);  // 生成0-1之间的小数，乘以10，因为可取0不可取1，得到0-9之间的数字
			counts[randomNumber]++;  // 该数字所表示位置处出现次数加1
		}
		for(int i = 0; i < counts.length; i++) {
			System.out.printf("Appearance times of %d are %d\n", i, counts[i]);
		}
	}
}
