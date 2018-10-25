package algoritmosdeordenacao;

public class SelectionSort {
	
	public void organizar(int nums[]) {
		int min, max;
		for(int i = 0; i <nums.length;i++) {
			min = i;
			for(int j = i+1; j<nums.length;j++) {
				if(nums[j] < nums[min])
					min = j;
			}
			max = nums[i];
			nums[i] = nums[min];
			nums[min] = max;
		}
	}

}
