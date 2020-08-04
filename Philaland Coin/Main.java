t=int(input())
for test in range(t):
  count=0
  max_price=int(input())
  while(max_price!=0):
    count=count+1
    max_price=int(max_price/2)
  print(count)