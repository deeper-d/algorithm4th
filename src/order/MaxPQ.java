package order;

// 优先队列、二叉堆
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N = 0;

    public MaxPQ(int maxN) { // 创建一个初始容量为 max 的优先队列
        pq = (Key[]) new Comparable[maxN + 1]; // 为了方便计算， 我们不使用 p[0], 所以要 maxN + 1
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void insert(Key v) { // 将新元素加到数组末尾，增加堆的大小并让这个新元素上浮到合适的位置
        pq[++N] = v;
        swim(N);
    }

    public Key delMax() { // 从数组顶端删去最大的元素并将数组的最后一个元素放到顶端， 减小堆的大小并让这个元素下沉到合适的位置
        Key max = pq[1];
        exch(1, N--);
        pq[N+1] = null;
        sink(1);
        return max;
    }

    private void swim(int k) { // 利用在数组中无需指针即可沿树上下移动的便利和以下性质，算法保证了对数复杂度的性能
        while (k > 1 && less(k/2, k)) {
            exch(k/2, k);
            k = k/2;
        }
    }

    public void sink(int k) {
        while (2*k < N) {
            int j = 2*k;
            if (j < N && less(j, j+1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }

    public boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    public void exch(int i, int j) {
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    public static void main(String [] args) {

    }
}
