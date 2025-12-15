from typing import List
def threesum(nums: List[int]) -> List[List[int]]:
    my_Set = set()
    n = len(nums)
    for i in range(n):
        for j in range(i+1,n):
            for k in range(j+1,n):
                if nums[i]+nums[j]+nums[k]==0:
                    temp = [nums[i],nums[j],nums[k]]
                    temp.sort()
                    my_Set.add(tuple(temp))
    ans = [list(item) for item in my_Set]
    return ans

def main():
    nums = list(map(int,input().split()))
    print(threesum(nums))

if __name__=="__main__":
    main()