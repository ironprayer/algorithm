### 문제
| 102. Binary Tree Level Order Traversal


### 제약 사항
The number of nodes in the tree is in the range<code>[0, 2000]</code><br>
<code>-1000 <= Node.val <= 1000</code>
### 풀이 방법
1. 전체 탐색을 하면서 각 뎁스에 맞게 값을 저장해둔다.
   - Recursive와 Map을 사용
2. 각 뎁스의 값을 꺼내서 리스트에 넣어서 반환해준다.

### 시간 복잡도
- O(n) [ 전체 노드를 한 번씩 방문 ]