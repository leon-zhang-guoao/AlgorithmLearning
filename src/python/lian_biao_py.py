class SingQueue:

    def __init__(self, value):
        self.value = value
        self.next = None


class SingleList:
    def __init__(self):
        self.head = None
        self.count = 0

    def is_empty(self):
        return self.count == 0

    def length(self):
        return self.count

    def add(self, item):
        new = SingQueue(item)
        if self.is_empty():
            self.head = new
        else:
            new.next = self.head
            self.head = new
        self.count += 1

    def get_all(self):
        ans = self.head
        while ans is not None:
            print(ans.value)
            ans = ans.next

    def poll(self):
        ans = None
        if self.head is None:
            return ans
        else:
            ans = self.head.value
            self.head = self.head.next
            self.count -= 1
        return ans


if __name__ == '__main__':
    a = SingleList()
    print(a.length())
    a.add(1)
    a.add('dda')
    a.add('ddacc')
    print(a.length())
    a.get_all()
    print('-------------')
    print(a.poll())
    print(a.length())
    print(a.poll())
    print(a.length())
    print(a.poll())
    print(a.length())
    print('--------------------')
    print(a.poll())
    print(a.length())
    print('--------------------')
    print(a.poll())
    print(a.length())
    print(a.get_all())
