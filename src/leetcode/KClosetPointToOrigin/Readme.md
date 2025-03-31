### 문제
| 973. K Closest Points to Origin


### 제약 사항
<code>1 <= k <= points.length <= 104</code><br>
<code>-104 <= xi, yi <= 104</code>

### 풀이 방법
1. 거리 계산을 하기 위해 (x * x) + (y * y) 값을 계산한다.
2. 계산된 값의 최대와 위치를 저장해둔다.
3. 결과에 저장된 개수가 k개가 넘어가면 현재값을 최댓값과 위치와 비교 및 교체한다.

### 시간 복잡도
- O(n x k)