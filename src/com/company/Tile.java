package com.company;

public class Tile {
    private String letter;
    private int value;

    public Tile (String let, int val) {
        letter = let;
        value = val;
    }
    public String getLetter() {
        return letter;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
	// write your code here
    }
}