# 1

def big(arr):
    for i in range(0,len(arr),1):
        if arr[i]>0 :
            arr[i]="big"
    return arr
print(big([-1, 3, 5, -5]))

# 2
def sum(arr):
    count=0
    for i in range(0,len(arr),1):
        if arr[i]>0:
            count+=arr[i]
    arr[(len(arr))-1]=count
    return arr
print (sum([-1,1,2,1]))

# 3
def summation(arr):
    count=0
    for i in range(0,len(arr),1):
        count+=arr[i]
    return count
print(summation([1,2,3,4]))

# 4
def avarage(arr):
    count=0
    for i in range(0,len(arr),1):
        count+=arr[i]
    avg=count/len(arr)
    return avg
print(avarage([1,2,3,4]))

# 5
def length(arr) :
    return len(arr)
print(length ([]))

# 6
def min(arr):
    mini=arr[0]
    if len(arr)>0:
        for i in range(1,len(arr),1):
            if arr[i]<mini:
                mini=arr[i]
    else:
        print("False")
    return mini
print(min([2,6,8,7]))

# 7
def max(arr):
    maxi=arr[0]
    if len(arr)>0:
        for i in range(1,len(arr),1):
            if arr[i]>maxi:
                maxi=arr[i]
    else:
        print("False")
    return maxi
print(max([2,6,8,7]))

#8
def ultimate_analysis(arr):
    sum=0
    mini=arr[0]
    maxi=arr[len(arr)-1]
    for x in range (0,len(arr),1):
        sum=sum+arr[x]
        if arr[x]>maxi :
            maxi=arr[x]
        elif arr[x]<mini:
            mini=arr[x]
            
    avg=(sum/len(arr))
    return ([sum,avg,mini,maxi,len(arr)])

print(ultimate_analysis([2,3,4,5,6,7]))

#9
def reverse(arr):
    for x in range (0,int(len(arr)/2),1):
        temp=arr[x]
        arr[x]=arr[len(arr)-1-x]
        arr[len(arr)-1-x]=temp
    return arr

print(reverse([4,1,2,5,2,4,3,6]))








