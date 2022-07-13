class LianBiaoCode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseKGroup(self, head, k):
        start = head
        one = self.getLast(head, k)
        if one is None:
            return head
        head = one
        self.rever(start, one)
        last = start
        while last.next is not None:
            start = last.next
            end = self.getLast(start, k)
            if end is None:
                return head
            self.rever(start, end)
            last.next = end
            last = start
        return one

    def getLast(self, head, k):
        while k - 1 > 0:
            if head is not None:
                head = head.next

        return head

    def rever(self, head, end):
        end = end.next
        pre = None
        cur = head
        last = None
        while cur != end:
            last = cur.next
            cur.next = pre
            pre = cur
            cur = last
        head.next = end


