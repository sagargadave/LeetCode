/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseBetween(struct ListNode* head, int left, int right) 
{
    struct ListNode* temp = head;
    struct ListNode* leftp = head;
    struct ListNode* templeftp = NULL;
    struct ListNode* rightp = head;

    if(head->next == NULL)
    {
        return head;
    }

    if(head == NULL)
    {
        return NULL;
    }

    for(int i=1; i<left; i++)
    {
        leftp = leftp->next;
    }

    templeftp = leftp;

    for(int i=1; i<right; i++)
    {
        rightp = rightp->next;
    }

    int count = 0;

    for(int i=left; i<=right; i++)
    {
        count++;
    }

    int arr[count];

    int j = 0;

    for(int i=left; i<=right; i++)
    {
        arr[j++] = leftp->val;
        leftp = leftp->next;
    }

    j--;

    for(int i=left; i<=right; i++)
    {
        templeftp->val = arr[j--];
        templeftp = templeftp->next;
    }

    return head;
}