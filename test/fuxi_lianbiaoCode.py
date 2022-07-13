class Node:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class solution:
    def reverseKGroup(self, head, k):
        start = head
        end = self.get_end(start, k)
        if end is None:
            return head
        head = end
        self.reverse(start, end)
        last_end = start
        while last_end.next is not None:
            start = last_end.next
            get_end = self.get_end(start, k)
            if get_end is None:
                return head
            self.reverse(start, get_end)
            last_end.next = get_end
            last_end = start

        return head

    def get_end(self, head, k):
        while k - 1 > 0:
            if head is not None:
                head = head.next
            k -= 1
        return head

    def reverse(self, head, end):
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
