
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        ListNode dummy(0); 
        dummy.next = head;
        ListNode* prev = &dummy;

        while (prev->next && prev->next->next) {
            ListNode* first = prev->next;
            ListNode* second = first->next;

            prev->next = second;
            first->next = second->next;
            second->next = first;

            prev = first;
        }
        return dummy.next;
    }
};