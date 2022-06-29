def printCode32(num):
    for i in range(32):
        if num & (1 << (32-i-1)) == 0:
            a = 0
        else:
            a = 1
        print(a, end="")


if __name__ == '__main__':
    printCode32(32)


