class Solution {
    public double average(int[] salary) {
        int sum=0;
        Arrays.sort(salary);
        int n=salary.length;
        for(int i=1;i<n-1;i++)
        sum+=salary[i];
        return sum/(double)(n-2);
    }
}