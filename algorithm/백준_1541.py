a = input().split('-')
num = 0
b = a[0].split('+')
for i in b:
    num += int(i)

for j in a[1:]:
    for k in j.split('+'):
        num -= int(k)

print(num)
