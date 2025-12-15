from typing import List
def threesum(nums : List[int]) -> List[List[int]]:
    result = set()
    n = len(nums)
    for i in range(n):
        my_set = set()
        for j in range(i+1,n):
            third = -(nums[i]+nums[j])
            if third in my_set:
                temp = [nums[i],nums[j],third]
                temp.sort()
                result.add(tuple(temp))
            my_set.add(nums[j])
    answer = [list(item) for item in result]
    return answer

def main():
    nums = list(map(int,input().split()))
    solution = threesum(nums)
    print(solution)

if __name__ == "__main__":
    main()