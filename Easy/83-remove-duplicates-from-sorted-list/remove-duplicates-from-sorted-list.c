struct ListNode* deleteDuplicates(struct ListNode* head) 
{
    struct ListNode* temp = head;
    struct ListNode *tnext;
    while(temp!=NULL&&temp->next!=NULL)
    {
        tnext = temp->next;
        if(temp->val == tnext->val)
        {
            temp->next = tnext->next;
            free(tnext);
        }
        else
        {
            temp=temp->next;
        }
    }
    return head;
}