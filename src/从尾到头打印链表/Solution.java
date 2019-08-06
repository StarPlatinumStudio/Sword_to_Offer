package 从尾到头打印链表;

import java.util.ArrayList;
//  1>2>3   ->  null<1<2>3
//  |                |
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode pre = null;
        ListNode next = null;
        while (listNode != null) {
            next = listNode.next;//next=2
            listNode.next = pre;//1->null，2->1......
            pre = listNode;//pre后移
            listNode = next;//listnode后移 =2,=3,,,=null
        }

        while (pre != null) {
            list.add(pre.val);
            pre = pre.next;
        }
        return list;
    }
}