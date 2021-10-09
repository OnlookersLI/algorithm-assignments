/**
 * @Author: code.rookie
 * @ClassName: MergeTwoSortedLists
 * @Date: 2021/10/9 10:26 上午
 * @PACKAGE_NAME: PACKAGE_NAME
 * @Version: 1
 * @Description 21. 合并两个有序链表
 */
public class MergeTwoSortedLists {


    public static void mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode result = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                result.next = l1;
                l1 = l1.next;
            } else {
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }

        result.next = l1 == null ? l2 : l1;
    }
}
