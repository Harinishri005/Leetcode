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
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(n==0) return null;
        while(n>1)
        {
        int a=0;
        for(int i=0;i<n;i+=2)
        {
            if(i+1<n)
            lists[a++]=merge(lists[i],lists[i+1]);
            else
            lists[a++]=lists[i];
        }n=a;
        }
        return lists[0];
    }
    ListNode merge(ListNode list1,ListNode list2)
    {
        if(list1==null)return list2;
        if(list2==null)return list1;
        ListNode head=null,tail=null;
        if(list1.val<list2.val)
        {
            head=list1;tail=list1;list1=list1.next;
        }
        else
        {
            head=list2;tail=list2;list2=list2.next;
        }
        while(list1!=null&&list2!=null)
        {
            if(list1.val<list2.val)
        {
            tail.next=list1;list1=list1.next;
        }
        else
        {
            tail.next=list2;list2=list2.next;
        }tail=tail.next;
        }
        if(list1!=null)tail.next=list1;
        else if(list2!=null) tail.next=list2;
        return head;
        

    }
}