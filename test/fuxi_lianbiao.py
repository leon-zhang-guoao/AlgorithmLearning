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


if __name__ == '__main__':
    a = singer_list()
    print(a.is_emptye())
    print(a.length())
    a.add('a')
    print(a.is_emptye())
    print(a.length())
    a.add('b')
    a.add('c')
    a.add('d')
    print(a.length())
    a.get_all()
    print('-----------------')
    print(a.poll())
    print(a.poll())
    print(a.poll())
    print(a.poll())
    print(a.poll())
    print(a.poll())
