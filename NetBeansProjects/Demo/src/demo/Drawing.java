/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author CCNE
 */
public class Drawing extends JPanel{
    
    private GridMap gridmap;

    public Drawing(GridMap gridmap) {
        this.gridmap = gridmap;
    }
    
    @Override
    public void paintComponent(Graphics g){
        
        for(int index = 0; index < gridmap.getRoutes().size(); index++){
            int[] x = new int[gridmap.getRoutePoints(index).size()];
            int[] y = new int[gridmap.getRoutePoints(index).size()];
            for(int i = 0; i < gridmap.getRoutePoints(index).size(); i++){
                x[i] = 100*gridmap.getRoutePoints(index).get(i).getLabel().getX();
            }
        
            for(int j = 0; j < gridmap.getRoutePoints(index).size(); j++){
                y[j] = 100*gridmap.getRoutePoints(index).get(j).getLabel().getY();
            }
            g.drawPolyline(x, y, gridmap.getRoutes().size());
        }
        
    }
}