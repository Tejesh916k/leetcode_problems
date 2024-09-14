class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        max_num=max(nums)  
        count=0
        prev_count=0
        for i in range(len(nums)):
            if nums[i]==max_num:
                count+=1
            else:
                count=0
            prev_count=max(prev_count,count)
        return prev_count