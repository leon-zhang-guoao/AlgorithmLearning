def selectSort(arr):
    for i in range(len(arr)):
        minIndex = i

        for j in range(i + 1, len(arr)):
            if arr[j] < arr[minIndex]:
                minIndex = j
        if minIndex != i:
            arr[minIndex], arr[i] = arr[i], arr[minIndex]
    return arr


def budderSort(arr):
    for i in range(len(arr)):
        for j in range(len(arr) - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr


def insertSort(arr):
    for i in range(len(arr)):

        for j in range(i + 1, len(arr)):
            if arr[i] > arr[j]:
                arr[i], arr[j] = arr[j], arr[i]
    return arr


if __name__ == '__main__':
    arr = [10, 1, -1, 0, 1, 2, 3, 1, 4564, 5, 3]
    print(insertSort(arr))
