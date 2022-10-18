package com.muzili.strategy;

/**
 * 排序方法
 * @author lizuoliang
 * @create 2022/10/18 14:13
 */
public class Sorter<T> {

    public void sort(T[] arr, Comparator<T> comparator){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    void swap(T[] arr, int i, int minPos) {
        T temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }

}
