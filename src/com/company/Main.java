package com.company;

import java.util.Random;

public class Main {

    private static final Random randomGenerator = new Random();

    public static int getRandomInt() {
        return randomGenerator.nextInt(10);
    }

    public static void main(String[] args) {
	    Matrix matrix = new Matrix(3);
	    matrix.randomizeElements();
	    matrix.printMatrix();
	    double diagonalElementsRatio = matrix.findDiagonalElementsRatio();
        System.out.println(diagonalElementsRatio);
    }
}
