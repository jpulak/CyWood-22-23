for i in range(int(input())):
  first= input().split('vs. ')
  second= input().split()
  second= list(second)
  last=second[-1]
  last=list(str(last))
  if last[-1]=='Y' and last[-2]=='L' and last[-3]=='L':
    print("SILLY BILLY WINS")
  else:
    print(first[1],"WINS")
