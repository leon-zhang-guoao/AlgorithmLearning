class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution(object):
    def mergeTwoLists(self, list1: ListNode, list2: ListNode):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        if list1 is None or list2 is None:
            if list1 is None:
                return list2
            else:
                return list1
        l1 = list1.val
        l2 = list2.val
        head = None
        if l1 <= l2:
            head = list1
        else:
            head = list2
        cur2 = None
        if l1 > l2:
            cur2 = list1
        else:
            cur2 = list2
        cur1 = head.next
        pre = head
        while cur1 is not None and cur2 is not None:
            if cur1.val <= cur2.val:
                pre.next = cur1
                cur1 = cur1.next
            else:
                pre.next = cur2
                cur2 = cur2.next
            pre = pre.next
        if cur1 is not None:
            pre.next = cur1
        else:
            pre.next = cur2
        return head


if __name__ == '__main__':
    list1 = 3
    list2 = 2

    head = lambda list1, list2: list1 if list1 <= list2 else list2
    print(head(list1, list2))
