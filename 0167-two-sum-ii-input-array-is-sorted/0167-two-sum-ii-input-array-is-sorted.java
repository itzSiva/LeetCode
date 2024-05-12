class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for(int i=0,j=n-1;i<j;){
            if(numbers[i]+numbers[j]==target)
                return new int[]{i+1,j+1};
            else if(numbers[i]+numbers[j]>target)
                j--;
            else
                i++;
            
        }
        return numbers;
    }
}