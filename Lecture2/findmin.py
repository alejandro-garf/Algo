## Finding the min of a lst

def findMin(lst):
    if lst == 0:
        return 
    else:
        min = lst[0]
        for int in lst:
            if (min > int):
                min = int
    return min


print(findMin([6,2,1,5,6]))


    