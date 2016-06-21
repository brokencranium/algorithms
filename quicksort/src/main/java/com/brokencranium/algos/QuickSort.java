package com.brokencranium.algos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by vvennava on 6/4/16.
 */
public class QuickSort {
    private List<Integer> listValues;

    private QuickSort() {
    }

    public QuickSort(List<Integer> listValues) {
        this.listValues = listValues;
    }

    public List<Integer> getListValues() {
        return listValues;
    }

    public void setListValues(List<Integer> listValues) {
        this.listValues = listValues;
    }

    public Integer partition(int start, int end) {
       int index = start;
        int pivotLoc = end;
        int pivotVal = listValues.get(end);

       for(int j=start;j<end;j++){
           if(listValues.get(index) >= pivotVal ){
               int indexVal = listValues.get(index);
                listValues.set(index, listValues.get(pivotLoc - 1));
                listValues.set(pivotLoc, indexVal);
               listValues.set(pivotLoc - 1,pivotVal);
               pivotLoc--;
           }else
            index++;
       }

        return pivotLoc;

    }

    public void quickSort(int start, int end) {
        if (start < end) {
            int partitionIndex = this.partition(start, end);
            this.quickSort(start, partitionIndex - 1);
            this.quickSort(partitionIndex + 1, end);
        }
    }

}
