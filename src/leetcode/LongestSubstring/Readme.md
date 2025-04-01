### 문제
| 3. Longest Substring Without Repeating Characters


### 제약 사항
<code>0 <= s.length <= 5 * 104</code><br>
<code>s</code> consists of English letters, digits, symbols and spaces.

### 풀이 방법
1. Queue에 순서대로 값을 넣는다
   - Map에 Queue 안에 들어간 숫자를 넣어준다.
2. Map에 값이 이미 있는 경우 Queue에서 현재 문자가 나올 때까지 뺀다.
   - Queue에서 빠진 값을 Map에서 빼준다.
3. 현재 최대 길이와 Queue의 사이즈를 비교한다.

### 시간 복잡도
- O(n x k) 이라고 생각하는데 찾아보면 O(n) 이라고 한다.