n=int(input())
rsfive=int((n-4)/5)
if (n-rsfive*5)%2==0:
  rsone=2
elif (n-rsfive*5)%2!=0:
  rsone=1
rstwo=int((n-rsfive*5-rsone*1)/2)
total_no_of_coins=rsfive+rsone+rstwo
print(total_no_of_coins,rsfive,rstwo,rsone)

