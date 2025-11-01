/*
3217. Delete Nodes From Linked List Present in Array

You are given an array of integers nums and the head of a linked list. Return the head of the modified linked list after removing all nodes from the linked list that have a value that exists in nums.

Example 1:
Input: nums = [1,2,3], head = [1,2,3,4,5]
Output: [4,5]

Example 2:
Input: nums = [1], head = [1,2,1,2,1,2]
Output: [2,2,2]

Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 105
All elements in nums are unique.
The number of nodes in the given list is in the range [1, 105].
1 <= Node.val <= 105
The input is generated such that there is at least one node in the linked list that has a value not present in nums.

Solution :
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Step 1: Put all nums into a set for O(1) lookups
        Set<Integer> toDelete = new HashSet<>();
        for (int num : nums) {
            toDelete.add(num);
        }

        // Step 2: Create a dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        // Step 3: Traverse and remove matching nodes
        while (curr != null) {
            if (toDelete.contains(curr.val)) {
                prev.next = curr.next;  // skip current node
            } else {
                prev = curr;  // keep current node
            }
            curr = curr.next;
        }

        // Step 4: Return new head
        return dummy.next;
    }
}