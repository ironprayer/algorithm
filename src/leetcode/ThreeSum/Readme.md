### 문제
| 15. 3Sum

### 제약 사항
<code> 3 <= nums.length <= 3000 </code><br>
<code> -105 <= nums[i] <= 105 </code>

### 풀이 방법
1. 기준 인덱스와 이동하는 2개의 인덱스를 설정한다.
   - firstIndex : 기준 인덱스
   - secondIndex, thirdIndex : 이동 인덱스 
     - secondIndex 초기 값: firstindex + 1
     - thirdIndex 초기 값: nums.lenght - 1
2. 인덱스에 위치한 숫자의 합에 따라 2개의 인덱스를 조정한다.
   - 0보다 큰 경우 : thirdIndex를 한 칸 내린다
   - 그 이외의 경우 : secondIndex를 한 칸 올린다.
3. 이동하는 인덱스가 인접한 경우 기준 인덱스를 이동시킨다.
   - 기준 인덱스를 한 칸 올린다.
   - secondIndex와 thirdIndex의 위치를 초기화 한다.
4. 인덱스에 위치한 숫자의 합은 result 값에 넣어준다.

### 시간 복잡도
- O(n2) [first가 전체 한 번 도는 것 (n) X second, third가 움직이는 것 (n)]