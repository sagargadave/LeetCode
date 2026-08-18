class Solution:
    def intersection(self, nums1, nums2):

        s1 = set(nums1)
        result = []

        for num in nums2:
            if num in s1:
                result.append(num)
                s1.remove(num)

        return result