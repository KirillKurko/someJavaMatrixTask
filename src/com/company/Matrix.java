package com.company;

public class Matrix {

    private int size;

    private int matrix[][];

    public Matrix() {
        size = 0;
        matrix = null;
    }

    public Matrix(int size) {
        this.size = size;
        matrix = new int [size][size];
    }

    public void randomizeElements() {
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                matrix[i][j] = Main.getRandomInt();
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public double findDiagonalElementsRatio() {
        int mainDiagonalElementsSum = findMainDiagonalElementsSum();
        int sideDiagonalElementsSum = findSideDiagonalElementsSum();
        return (double) mainDiagonalElementsSum / sideDiagonalElementsSum;
    }

    private int findMainDiagonalElementsSum() {
        int sum = 0;
        for (int i = 0; i < size; ++i) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private int findSideDiagonalElementsSum() {
        int sum = 0;
        for (int i = 0; i < size; ++i) {
            sum += matrix[i][size - i - 1];
        }
        return sum;
    }

}
