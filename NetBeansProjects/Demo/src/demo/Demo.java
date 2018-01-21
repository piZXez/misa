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
        GridMap gridMap = Data.setData();
        GridMap gridMap1 = Data1.setData();
        GridMap gridMap2 = Data2.setData();
        
//        gridMap.showAllRoutePoints();
//        gridMap.showRoutePoints(1);
//        gridMap.getMatrix().setDefaultPoints();
//        gridMap.getMatrix().getDefaultPoints();
//        for(int i=0; i<gridMap.getRoutePoints(0).size(); i++){
//            if(gridMap.getRoutePoints(0).get(i).getCount() == 0){
//                gridMap.getRoutePoints(0).get(i).printXY();
//            }
//        }
        gridMap2.showAllRouteLabels();
        gridMap2.showAllRoutePoints();
        gridMap2.countStack(1);
        
    }
    
}
