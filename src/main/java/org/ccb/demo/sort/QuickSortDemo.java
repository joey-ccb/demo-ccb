package org.ccb.demo.sort;

import java.util.Arrays;

/**
 * Created by cuicb on 2019/11/26.
 */
public class QuickSortDemo {
    /**
     * 快速排序方法
     *
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int[] quickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            quickSort(array, start, smallIndex - 1);
        if (smallIndex < end)
            quickSort(array, smallIndex + 1, end);
        return array;
    }

    /**
     * 快速排序算法——partition
     *
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++)
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex)
                    swap(array, i, smallIndex);
            }
        return smallIndex;
    }

    /**
     * 交换数组内两个元素
     *
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        final int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        //{3(), 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48} temp=3;从右向左找小于temp

        //{2, 44, 38, 5, 47, 15, 36, 26, 27, 2(), 46, 4, 19, 50, 48} temp=3;从左向右找大于temp
        //{2, 44(), 38, 5, 47, 15, 36, 26, 27, 2(44), 46, 4, 19, 50, 48} temp=3;从右向左找小于temp

        //{2, 3, 38(), 5, 47, 15, 36, 26, 27, 44, 46, 4, 19, 50, 48} temp=38;从右向左找小于temp

        //{2, 3, 38(19), 5, 47, 15, 36, 26, 27, 44, 46, 4, 19(), 50, 48} temp=38;从左向右找大于temp
        //{2, 3, 38(19), 5, 47(), 15, 36, 26, 27, 44, 46, 4, 19(47), 50, 48} temp=38;从右向左找小于temp
        //{2, 3, 38(19), 5, 47(4), 15, 36, 26, 27, 44, 46, 4(), 19(47), 50, 48} temp=38;从左向右找大于temp
        //{2, 3, 38(19), 5, 47(4), 15, 36, 26, 27, 44(), 46, 4(44), 19(47), 50, 48} temp=38;从右向左找小于temp
        //{2, 3, 38(19), 5, 47(4), 15, 36, 26, 27, 44(38), 46, 4(44), 19(47), 50, 48}

        //{2, 3, 19, 5, 4, 15, 36, 26, 27, 38, 46, 44, 47, 50, 48}



//        String str = Arrays.toString(QuickSortDemo.quickSort(array, 0, array.length - 1));
        QuickSortDemo.quick_sort(array, 0, array.length - 1);
        String str = Arrays.toString(array);
        System.out.println(Arrays.toString(array));
    }


    static void quick_sort(int s[], int l, int r) {
        if (l < r) {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j) {
                while (i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if (i < j)
                    s[i++] = s[j];
                System.out.println(Arrays.toString(s));
                while (i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if (i < j)
                    s[j--] = s[i];
                System.out.println(Arrays.toString(s));
            }
            s[i] = x;
            System.out.println(Arrays.toString(s));
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }
}
