/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) 
{
    struct ListNode *arr = NULL;
    struct ListNode *arr2 = NULL;

    int icnt = 0,Ctemp = 0, i=0, no =0;
    
    while(l1 != NULL || l2 != NULL || icnt != 0)
    {   
        struct ListNode *newn = (struct ListNode *)malloc(sizeof(struct ListNode));

        newn->next = NULL;
        
        
        if(l1 != NULL)
        {
            icnt += l1->val;
        }

        if(l2 != NULL)
        {
            icnt += l2->val;
        }

    // [5,6,4]
    // [2,4,3]

        if(icnt < 10)
        {
            newn->val = icnt;
            icnt = 0;
        }
        else
        {
            no = icnt % 10;
            newn->val = no;
            icnt = icnt /10;
        }

            if(l1 != NULL)
            {
                l1 = l1->next;
            }

            if(l2 != NULL)
            {
                l2 = l2->next;  
            }

        if(arr == NULL)
        {
            arr = newn;
            arr2 = newn;
        }
        else
        {
            arr->next = newn;
            // newn = arr;
            arr = newn;
        }            
    }
    
    return arr2;
}
