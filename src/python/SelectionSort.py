def selectMinValue(arr):
    """

    :type arr: list
    """
    for i in range(len(arr)):
        minValueIndex = i
        for j in range(i + 1, len(arr)):
            if arr[j] < arr[minValueIndex]:
                minValueIndex = j
        if minValueIndex != i:
            arr[i], arr[minValueIndex] = arr[minValueIndex], arr[i]

    return arr


def buddSor(arr):
    for i in range(len(arr)):
        for j in range(len(arr) - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr


def insertSort(arr):
    for i in range(1, len(arr)):
        while i - 1 >= 0 and arr[i] < arr[i - 1]:
            arr[i], arr[i - 1] = arr[i - 1], arr[i]
            i -= 1
    return arr


if __name__ == '__main__':
    a = [1, 2, 3, 4, 5, 432, 67, 0, 43]
    print(insertSort(a))
