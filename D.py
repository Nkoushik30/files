l=input("Enter the string to count owels in the string :")
count=0
for j in range(0,len(l)):
    if l[j] in 'AEIOUaeiou':
        count+=1
print('count of vowels is :',count)