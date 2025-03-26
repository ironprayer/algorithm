### 문제
| 57 Insert Interval


### 제약 사항
<code>0 <= intervals.length <= 104</code><br>
<code>intervals[i].length == 2</code><br>
<code>0 <= starti <= endi <= 105</code><br>
<code>intervals is sorted by starti in ascending order.</code><br>
<code>newInterval.length == 2</code><br>
<code>0 <= start <= end <= 105</code><br>

### 풀이 방법
그림을 그려가며 패턴 파악을 했을 때, 아래 4가지 경우에 따라 동작이 달라졌다.
- 새로운 범위의 끝이 비교 대상 범위의 시작보다 작은 경우</br>- 새로운 범위 결과에 추가 [ 한 번도 추가가 안되었을 경우 ]</br> - 비교 대상 범위 결과에 추가 
- 새로운 범위의 시작이 비교 대상 범위의 끝보다 큰 경우</br>- 비교 대상 범위 결과에 추가
- 새로운 범위의 시작이 비교 대상 범위에 속하는 경우</br>- 새로운 범위 시작을 비교 대상 범위 시작 값으로 대치
- 새로운 범위의 끝이 비교 대상 범위에 속하는 경우</br>- 새로운 범위 끝을 비교 대상 범위 끝 값으로 대치

### 시간 복잡도
- O(n) [ 배열을 한 번만 순회하면서 구할 수 있다 ]