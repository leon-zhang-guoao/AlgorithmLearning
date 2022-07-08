class fuxu_lianbiao:
    def __init__(self, value):
        self.value = value
        self.next = None


class singer_list:
    def __init__(self):
        self.count = 0
        self.head = None
        self.tail = None

    def is_emptye(self):
        return self.count == 0

    def length(self):
        return self.count

    def add(self, item):
        new = fuxu_lianbiao(item)
        if self.tail is None:
            self.head = new
        else:
            self.tail.next = new
        self.tail = new

        self.count += 1

    def poll(self):
        cur = None
        if self.head is None:
            return cur
        else:
            cur = self.head.value
            self.head = self.head.next
            self.count -= 1
        return cur

    def get_all(self):
        cur = self.head
        while cur is not None:
            print(cur.value)
            cur = cur.next


class singer_stack:
    def __init__(self):
        self.head = None
        self.count = 0

    def add(self, one):
        ac = fuxu_lianbiao(one)
        if self.head is None:
            self.head = ac
        else:
            ac.next = self.head
            self.head = ac

    def get_all(self):
        ans = None
        while self.head is not None:
            ans = self.head.value
            print(ans)
            self.head = self.head.next


if __name__ == '__main__':
    a = singer_stack()
    a.add('a')
    a.add('b')
    a.add('c')
    a.add('d')
    a.get_all()
