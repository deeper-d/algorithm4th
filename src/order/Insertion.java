package order;

import edu.princeton.cs.algs4.*;

//插入排序
public class Insertion
{
    // “排序算法类模板”
    private static boolean less(Comparable v, Comparable w)
    { return v.compareTo(w) < 0; }

    private static void exch(Comparable[] a, int i, int j)
    { Comparable t = a[i]; a[i] = a[j]; a[j] = t; }

    private static void show(Comparable[] a)
    { // 在单行中打印数组
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a)
    { // 测试数组元素是否有序
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    public static void sort(Comparable[] a)
    { // 将a[]按升序排列
        int N = a.length;
        for (int i = 1; i < N; i++)
        { // 将 a[i] 插入到 a[i-1]、a[i-2]、a[i-3]...之中
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
            exch(a, j, j-1);
        }
    }

    public static void main(String [] args) {
        Comparable[] nums = {1, 4, 5, 2, 3};
        sort(nums);

        for(Comparable n:nums)
            System.out.println(n);
    }

    //
    //   i
    // 1 2 4 5 3
    // <-j
}

