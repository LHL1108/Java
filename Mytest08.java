
public class Mytest08 {
	//定义二分查找函数
	public static int min(int[] numbers) {
		//检查输入
		if(numbers == null || numbers.length == 0) {
			throw new RuntimeException("Invalid input");
		}
		int lo = 0;
		int hi = numbers.length - 1;
		int mi = lo;
		//将中间的值与两边比较并根据mi的归属重置
		while (numbers[lo] >= numbers[hi]) {
			if (hi - lo == 1){
				return numbers[hi];
			}
			mi = lo + (hi - lo) / 2;
			if (numbers[lo] == numbers[mi] && numbers[mi] == numbers[hi]) {
				return minInorder(numbers, lo, hi);
			}
			if (numbers[mi] > numbers[lo]) {
				lo = mi;
			}
			else if (numbers[mi] <= numbers[hi]) {
				hi = mi;
			}			
		}
		return numbers[mi];
	}
	//定义暴力查找函数
	public static int minInorder(int[] numbers, int start, int end) {
		int result = numbers[start];
		for (int i = start + 1; i < end; i++) {
			if(result > numbers[i]) {
				result = numbers[i];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] array1 = {3, 4, 5, 1, 2};
		System.out.println(min(array1));
	}
}
