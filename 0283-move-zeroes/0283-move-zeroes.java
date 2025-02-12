class Solution {
    public void moveZeroes(int[] nums) {
      
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0 || nums[i]<0)
            {
                nums[k]=nums[i];
                k++;
                System.out.println(k);
            }
        }
        System.out.println(nums[0]);
        System.out.println(k);
        for(int i=k;i<nums.length;i++)
        {
            nums[i]=0;
        }
    }
}