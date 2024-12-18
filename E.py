n=int(input("Enter the nummber to check the number is prime or not:"))
count=0
for i in range(1,n+1):
    n%i
    if n%i==0:
        count+=1
if count==2:
    print("prime number")
else:
    print("Not a prime number")