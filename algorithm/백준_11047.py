N, K = map(int, input().split())
money = [int(input()) for _ in range(N)]
num = 0

for i in range(1, N+1):
    coin = money[-i]
    if K >= coin:
        mok = K // coin
        K -= mok * coin
        num += mok

print(num)
