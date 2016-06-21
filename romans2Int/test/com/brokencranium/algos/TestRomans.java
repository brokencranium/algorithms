package com.brokencranium.algos;

/**
 * Created by vvennava on 6/19/16.
 */
public class TestRomans {
    public static void main(String[] args) {
        System.out.println(Romans2Integer.getInteger("MCMLXXXIV"));//1984
        System.out.println(Romans2Integer.getInteger("IL"));//49
        System.out.println(Romans2Integer.getInteger("CIV"));//104
        System.out.println(Romans2Integer.getInteger("MCMIV"));//1904
        System.out.println(Romans2Integer.getInteger("MCMLIV"));//1954
        System.out.println(Romans2Integer.getInteger("MCMXC"));//1990
        System.out.println(Romans2Integer.getInteger("MMXIV"));//2014
    }
}
