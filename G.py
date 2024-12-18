l=[]
n=int(input("Enter the length of the list:"))
for i in range(0,n):
    a=input()
    l.append(a)
    l.sort()
print("maximum element in the list is :",l[n-1])