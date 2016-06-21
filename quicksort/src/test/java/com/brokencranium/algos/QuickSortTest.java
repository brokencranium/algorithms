package com.brokencranium.algos;

import org.apache.openejb.resource.jdbc.cipher.StaticDESPasswordCipher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vvennava on 6/4/16.
 */
public class QuickSortTest {

    private static List<Integer> listValues = new ArrayList<>();
    static{
        listValues.add(3);
        listValues.add(7);
        listValues.add(8);
        listValues.add(5);
        listValues.add(2);
        listValues.add(1);
        listValues.add(9);
        listValues.add(5);
        listValues.add(4);
    }


    public static void main(String[] args){

        QuickSort quickSort = new QuickSort(listValues);
        quickSort.quickSort(0,listValues.size() - 1);
        List<Integer> results = quickSort.getListValues();

        for(Integer result:results){
            System.out.println("Result " + result );
        }
    }
}
