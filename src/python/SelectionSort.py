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


if __name__ == '__main__':
    a = [1, 2, 3, 4, 5, 432, 67, 0, 43]
    print(selectMinValue(a))
