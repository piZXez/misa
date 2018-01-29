/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.swing.JFrame;

/**
 *
 * @author CCNE
 */
public class Demo extends JFrame{

    /**
     * @param args the command line arguments
     */
    public Demo (){
//        Container cp = getContentPane();
//        cp.add(draw);
        GridMap gridMap  = Data.setData();
        GridMap gridMap1 = Data1.setData();
        GridMap gridMap2 = Data2.setData();
        
        gridMap.showAllRouteLabels();
        System.out.println(gridMap.frequentStack(gridMap.getRoute(4)) + "");

        setContentPane(new Drawing(gridMap2));
        
        setSize(600, 600);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Demo();
        
        
        
//        gridMap.showAllRoutePoints();
//        gridMap.showRoutePoints(1);
//        gridMap.getMatrix().setDefaultPoints();
//        gridMap.getMatrix().getDefaultPoints();
//        for(int i=0; i<gridMap.getRoutePoints(0).size(); i++){
//            if(gridMap.getRoutePoints(0).get(i).getCount() == 0){
//                gridMap.getRoutePoints(0).get(i).printXY();
//            }
//        }
//        gridMap2.showAllRouteLabels();
//        gridMap2.showAllRoutePoints();
//        gridMap2.countStack(1);
//        System.out.println(gridMap.getRoute(0).isSubSequence(gridMap.getRoute(1)) + "");
//        System.out.println(gridMap.getRoute(2).isSubSequence(gridMap.getRoute(1)) + "");
//        System.out.println(gridMap.getRoute(2).isSubSequence(gridMap.getRoute(3)) + "");
//        System.out.println(gridMap.getRoute(2).isSubSequence(gridMap.getRoute(4)) + "");
//        System.out.println(gridMap.getRoute(3).isSubSequence(gridMap.getRoute(4)) + "");
    }
    
}
