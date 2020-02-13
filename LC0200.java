import java.util.*;

class UnionFind {
    private int size;
    private int numComponents;
    private int[] sz;
    private int[] id;
    public UnionFind(int size) {
      if (size <= 0) {
        throw new IllegalArgumentException("size <= 0 is not allowed");
      }
      this.size = numComponents = size;
      id = new int[size];
      sz = new int[size];
      for (int i = 0; i < size; i ++) {
        id[i] = i;
        sz[i] = 1;
      }
    }

    public int find(int p) {
      int root = p;
      while (id[root] != root) root = id[root]; 
      while (root != p) {
        int next = id[p];
        id[p] = root;
        p = next;
      }
      return root;
    }

    public void unify(int p, int q) {
      int rootp = find(p);
      int rootq = find(q);
      if (rootp == rootq) return;
      if (sz[rootp] > sz[rootq]) {
        id[rootq] = rootp;
        sz[rootp] += sz[rootq];
      } else {
        id[rootp] = rootq;
        sz[rootq] += sz[rootp];
      }
      numComponents --;
    }

    public int componentSize() {
      return numComponents;
    }

    public boolean connected(int p, int q) {
      return find(p) == find(q);
    }
};

public class LC0200 {
    public static int numIslands(char[][] grid) {
        int rows = grid.length;
        if (rows == 0) {
            return 0;
        }
        int cols = grid[0].length;
        UnionFind uf = new UnionFind(rows * cols + 1);
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < cols; j ++) {
                if (grid[i][j] == '1') {
                    if (j < cols - 1 && grid[i][j+1] == '1') {
                    uf.unify(i * cols + j, i * cols + j + 1);
                    }
                    if (i < rows - 1 && grid[i+1][j] == '1') {
                    uf.unify(i * cols + j, (i + 1) * cols + j);
                    }
                } else {
                    uf.unify(i * cols + j, cols * rows);
                }
            }
        }
        return uf.componentSize() - 1;
    }
}