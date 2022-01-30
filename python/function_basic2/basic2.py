# Countdown

def decrease(num):
    arr=[]
    for x in range(num,0,-1):
        arr.append(x)
    return arr
print(decrease(8))

# Print and Return
def back(num1,num2):
    print(num1)
    return num2
print(back(5,7))

# First Plus Length
def sum(arr):
    return len(arr)+arr[0]
print (sum([1,2,3,4,5,6,7,8,9]))

# Values Greater than Second 
newarr=[]
def count(arr):
    for i in range(0,len(arr),1):
        if arr[i]>arr[1]:
            newarr.append(arr[i])
    if len(newarr)<2:
        print("False")
    else:
        print(len(newarr))
    return newarr
print(count([1,2,5,7]))

# This Length, That Value
arr=[]
def numbers(number1,number2):
    for i in range(0,number1,1):
        arr.append(number2)
    return arr
print(numbers(4,7))


