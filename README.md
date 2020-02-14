# 如何字面审题
1. 题目要求
2. 题目输入数据结构
3. 题目输出数据结构
4. 题目典型特征，题型分类（树、图、搜索、查询、合并...）

# 典型问题名家讲解(只做搬运工)
## 1. DP
## 2. Greedy
## 3. Design
## 4. QuickSort
   
# Problem List
num | Problem | Tags | FastSolution | date | note
-------- | :-----------:  | :-----------: | :-----------: | :-----------: | :-----------: 
0001 | [Two Sum](https://leetcode-cn.com/problems/two-sum/) | Array<br>HashTable | HashTable | 20200213 | - |
0200 | [Number of Islands](https://leetcode-cn.com/problems/number-of-islands/) | UnionFind<br>DFS<br>BFS | [DFS](https://leetcode.com/problems/number-of-islands/discuss/403934/Java-100-100) | 20200213 | 并查集非最优解。dfs遍历标记提速 |
0005 | [Longest Palindromic Substring](https://leetcode-cn.com/problems/longest-palindromic-substring/) | String<br>DP | [DP](https://leetcode-cn.com/problems/longest-palindromic-substring/solution/zhong-xin-kuo-san-dong-tai-gui-hua-by-liweiwei1419/) | 20200213 | 学到了状态转移的概念, 参考[liweiwei动态规划教程](https://leetcode-cn.com/problems/longest-palindromic-substring/solution/zhong-xin-kuo-san-dong-tai-gui-hua-by-liweiwei1419/)
0146 | [LRU Cache](https://leetcode-cn.com/problems/lru-cache/) | Design | [Design](https://leetcode-cn.com/problems/lru-cache/solution/lru-ce-lue-xiang-jie-he-shi-xian-by-labuladong/) | 20200214 | 根据不同的特性选用数据结构 |
0002 | [Add Two Numbers](https://leetcode-cn.com/problems/lru-cache/) | Math<br>LinkedList | [K-way merge](https://leetcode-cn.com/problems/add-two-numbers/solution/hua-jie-suan-fa-2-liang-shu-xiang-jia-by-guanpengc/) | 20200214 | 把结果合并至其中一个数组来提速 |
0973 | [K Closest Points to Origin](https://leetcode-cn.com/problems/k-closest-points-to-origin/) | Heap<br>Sort<br>Divide and Conquer | Quick Sort | 20200214 | 《算法导论》快速排序实际情况下效果最好;Java的Arrays.sort对基本数据类型使用[双轴快速排序](https://www.cnblogs.com/nullzx/p/5880191.html),对对象与Collections.sort一样使用[归并排序](https://blog.csdn.net/qq_39309971/article/details/81629561)