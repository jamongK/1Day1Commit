b_list = []
hap = 0
answer = 0

N = int(input())
a_list = list(map(int, input().split()))

a_list = sorted(a_list)

for i in range(N):
    hap += a_list[i]
    b_list.append(hap)
    answer += b_list[i]

print(answer)
