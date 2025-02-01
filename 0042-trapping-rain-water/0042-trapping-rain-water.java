class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int a = height[0];
        int b = height[r];
        int sum = 0;
        while(l<r){
            if(a<=b){
                sum += (a-height[l]);
                l++;
                a = Math.max(a,height[l]);
            }else{
                sum += (b-height[r]);
                r--;
                b = Math.max(b,height[r]);
            }
        }
        return sum;
    }
}