import sys
input = sys.stdin.readline
t = int(input())
for _ in range(t):
    n = int(input())
    arr = list(map(int,input().split()))
    freq = [0]*10
    for i in arr:
        freq[i%10] += 1
    reduced = []
    for j in range(10):
        reduced.extend([j]*min(freq[j],3))
    found = False
    m = len(reduced)
    for i in range(m):
        for j in range(i+1,m):
            for k in range(j+1,m):
                if (reduced[i]+reduced[j]+reduced[k]) % 10 == 3:
                    found = True
                    break
            if found:
                break
        if found:
            break

    print("YES" if found else "NO") 