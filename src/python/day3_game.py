import random


def printCode32(num):
    for i in range(32):
        if num & (1 << (32 - i - 1)) == 0:
            a = 0
        else:
            a = 1
        print(a, end="")


def random_a():
    count = 1
    for i in range(1000000000):
        if random.randint(1, 10) < 4:
            count += 1

    print(count)


# dd
if __name__ == '__main__':
    print(299994829 / 1000000000)
