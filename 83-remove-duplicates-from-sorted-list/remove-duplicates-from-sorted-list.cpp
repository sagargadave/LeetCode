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
    ListNode* deleteDuplicates(ListNode* head) {

        ListNode* newHead = head;

        while (head != NULL && head->next != NULL) {

            if (head->next != NULL && head != NULL &&
                head->val == head->next->val) {

                ListNode* temp = head;

                while (temp != NULL && temp->next != NULL &&
                       temp->val == temp->next->val) {
                    temp = temp->next;
                }

                head->next = temp->next;
            } else {
                head = head->next;
            }
        }

        return newHead;
    }
};