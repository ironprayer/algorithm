### 문제
부분 배열 합 중 가장 큰 수 구하기
> Given an integer array nums, find the subarray with the largest sum, and return its sum.

### 제약 사항
<code> 1 <= nums.length <= 105 </code><br>
<code>-104 <= nums[i] <= 104 </code>

### 풀이 방법
- 총 합이 음수가 될 때까지 계속 더하기
  - 음수가 된 경우 현재 값으로 초기화 하기
- 총 합과 이전 최댓값을 비교해서 현재 최댓값 구하기

### 시간 복잡도
- O(n) [ 배열을 한 번만 순회하면서 구할 수 있다 ]