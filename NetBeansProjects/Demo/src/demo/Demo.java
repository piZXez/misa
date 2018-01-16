/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author DELL-PC
 */
public class Demo extends JFrame{

    /**
     * @param args the command line arguments
     */
//    public static Matrix matrix = new Matrix("Matrix 1", 6, 6);
    
    public Demo (){
        setSize(600, 600);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
    
    public void paint(Graphics g){
        super.paint(g);
    }
    
    public static void main(String[] args) {
//        new Demo();
//        matrix.matrixPrint();
//        Point p1 = new Point("A", 2, 3);
//        Point p2 = new Point("B", 2, 3);
//        Point p3 = new Point("C", 4, 3);
//        
//        System.out.println(p1.trajCompare(p2));
//        System.out.println(p1.trajCompare(p3));
        
        GridMap gridMap = Data.setData();
        gridMap.showAllRoutePoints();
        gridMap.showRoutePoints(1);
//        gridMap.showMatrix();
        gridMap.getMatrix().matrixPrint();
    }
    
}
