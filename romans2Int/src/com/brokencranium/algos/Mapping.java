package com.brokencranium.algos;

/**
 * Created by vvennava on 6/19/16.
 */
public class Mapping {
    private char symbol;
    private int value;

    public Mapping() {
    }

    public Mapping(char symbol, int value) {
        this.symbol = symbol;
        this.value = value;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
