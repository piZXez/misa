/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author DELL-PC
 */
public class Matrix {
    private String matrixName;
    private int a;
    private int b;

    public Matrix(String matrixName, int a, int b) {
        this.matrixName = matrixName;
        this.a = a;
        this.b = b;
    }

    Matrix() {
    }

    Matrix(int i, int i0) {
    }
    
    //in ma trận
    public void matrixPrint(){
        for (int i=0; i<this.a; i++){
            for(int j=0; j<this.b; j++){
                System.out.print(i + "" + j + " ");
            }
            System.out.println("");
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getMatrixName() {
        return matrixName;
    }

    public void setMatrixName(String matrixName) {
        this.matrixName = matrixName;
    }
}
