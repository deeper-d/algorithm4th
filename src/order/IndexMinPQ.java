package order;

import edu.princeton.cs.algs4.*;

// 关联索引的泛型优先队列的 API
public class IndexMinPQ<Item extends Comparable<Item>>
{
    IndexMinPQ(int maxN) {} // 创建一个最大容量为 maxN 的优先队列，索引的取值范围为 0 至 maxN-1

    void insert(int k, Item item) {} // 插入一个元素，将它和索引 k 相关联void insert(int k, Item item) 插入一个元素，将它和索引 k 相关联

    void change(int k, Item item) {} // 将索引为 k 的元素设为 item

    boolean contains(int k) {} // 是否存在索引为 k 的元素

    void delete(int k) {} // 删去索引 k 及其相关联的元素
    Item min() {} // 返回最小元素
    int minIndex() {} // 返回最小元素的索引
    int delMin() {} // 删除最小元素并返回它的索引
    boolean isEmpty() {} // 优先队列是否为空
    int size() {} // 优先队列中的元素数量
}