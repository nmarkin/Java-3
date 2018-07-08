package Java_3;

import java.util.ArrayList;

public class Stats<T> {
    private T[] arr;

    public Stats(T[] arr) {
        this.arr = arr;
    }

    public void swap(int ind1, int ind2 ){
        T var = arr[ind1];
        arr[ind1] =  arr[ind2];
        arr[ind2] = var;
    }

    public void transform(){
        ArrayList list = new ArrayList();
        for(int i = 0; i<arr.length; i++)
            list.add(arr[i]);
    }

    public void print(){
        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
