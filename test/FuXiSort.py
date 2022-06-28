def selectSort(arr):
    for i in range(len(arr)):
        minIndex = i

        for j in range(i + 1, len(arr)):
            if arr[j] < arr[minIndex]:
                minIndex = j
        if minIndex != i:
            arr[minIndex], arr[i] = arr[i], arr[minIndex]
    return arr


if __name__ == '__main__':
    arr = [10, 1, -1, 0, 1, 2, 3, 1, 4564, 5, 3]
    print(selectSort(arr))
