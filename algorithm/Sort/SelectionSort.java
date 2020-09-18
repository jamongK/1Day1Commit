import java.util.Arrays;

// 시나공 정처기 - 선택 정렬
public class SelectEX {

	public static void main(String[] args) {
		int[] number = {8, 5, 6, 2, 4};
		sort(number, number.length);
		System.out.println(Arrays.toString(number));
	}
	
	public static void sort(int[] arr, int m) {
		m = arr.length;
		for (int i = 0; i < m - 1; i++) {
			for (int j = i + 1; j < m; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
