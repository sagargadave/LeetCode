var intersection = function(nums1, nums2) {

    let s1 = new Set(nums1);
    let result = [];

    for (let num of nums2) {
        if (s1.has(num)) {
            result.push(num);
            s1.delete(num);
        }
    }

    return result;
};