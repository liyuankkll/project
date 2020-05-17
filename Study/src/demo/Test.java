package demo;

public class Test {
	public static void main(String[] args) {
		Test test =  new Test();
		System.out.println(test.twoSum(new int[] {1,2,3,5,6,7}, 4));	
		
		
	}

	private int [] twoSum(int[] nums, int target) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<target) {
				for(int j=i+1; j<nums.length; j++) {
					if(nums[j]<target && nums[i] + nums[j] == target) {
						return  new int[] {i,j};
					}
					
				}
			}

			
		}
		return nums;
	}
}
