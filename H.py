n=int(input("Enter the number to check the number is armstrong or not:"))
f=n
sum=0
if n<=0:
    print("every negative number and the 0 are armdtrong:")
elif n>0 and n<100:
    print("every two digit number is a Amstrong")
elif n>99 and n<1000:
    for i in range(0,3):
        rem=n%10
        a=int(rem)
        sum=sum+(a*a*a)
        n/=10
if sum==f:
    print(f," is Armstrong number.")
else:
    print(f," is not an armstrong number")