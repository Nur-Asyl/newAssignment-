package things;

import java.util.Scanner;
public class Matrix {

    private int rows, columns;
    private double[][] matrix;

    public Matrix(int rows, int columns){
        Scanner sc = new Scanner(System.in);
        this.rows = rows;
        this.columns = columns;

        System.out.println("Enter matrix:");
        matrix = new double[this.rows][this.columns];
        for(int i=0; i < this.rows; i++){
            for(int j=0; j< this.columns;j++){
                this.matrix[i][j] = sc.nextDouble();
            }
        }

    }

    public void printout(){
        for(int i=0;i<this.rows; i++){
            for(int j=0;j<this.columns;j++){
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void additionWithAnotherMatrix(Matrix outMatrix){

        if(this.rows != outMatrix.rows || this.columns != outMatrix.columns) return;

        for(int i=0;i<this.rows; i++){
            for(int j=0;j<this.columns;j++){
                this.matrix[i][j] += outMatrix.matrix[i][j];
            }
        }
    }

    public void multiplicationByNumber(int n){
        for(int i=0;i<this.rows; i++){
            for(int j=0;j<this.columns;j++){
                this.matrix[i][j] *= n;
            }
        }
    }

    public double[][] matrixMultiplication(Matrix outMatrix){
        if(this.rows == outMatrix.columns){
            double[][] newMatrix = new double[this.rows][outMatrix.columns];

            for(int row = 0; row < this.rows; row++) {
                for(int outCol = 0; outCol < outMatrix.columns;outCol++){
                    for (int outRow = 0, col = 0; outRow < outMatrix.rows; outRow++, col++) {
                        newMatrix[row][outCol] += this.matrix[row][col] * outMatrix.matrix[outRow][outCol];
                    }
                }
            }
            return newMatrix;
        }
        else{
            System.out.println("Rows and Columns are not equal");
            return this.matrix;
        }
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }

    public int getRows() {
        return rows;
    }

    private void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    private void setColumns(int columns) {
        this.columns = columns;
    }
}
