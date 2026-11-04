/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {

        ListNode* dummy = new ListNode(-1);
        dummy->next = head;
        head = dummy;

        while (head != NULL) {
            if (head != NULL && head->next != NULL && head->next->val == val) {
                ListNode* temp = head->next;

                while (temp != NULL && temp->val == val) {
                    temp = temp->next;
                }

                head->next = temp;
            } else {
                head = head->next;
            }
        }

        return dummy->next;
    }
};