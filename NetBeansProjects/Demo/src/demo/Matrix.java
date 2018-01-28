/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.List;

/**
 *
 * @author DELL-PC
 */
public class Matrix {
    private String matrixName;
    private List<Label> matrixLabels;
    private int a;
    private int b;

    public Matrix(String matrixName, int a, int b) {
        this.matrixName = matrixName;
        this.a = a;
        this.b = b;
    }

    Matrix() {
    }

    Matrix(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    //lập nhãn mặc định
    public void setDefaultLabel(){
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                matrixLabels.add(new Label(j, i));
            }
        }
    }
    
    public void getDefaultLabel(){
        int t = 0;
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(matrixLabels.get(t).getLabelName() + " ");
                t++;
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

    public List<Label> getMatrixLabels() {
        return matrixLabels;
    }

    public void setMatrixLabels(List<Label> matrixLabels) {
        this.matrixLabels = matrixLabels;
    }
}
