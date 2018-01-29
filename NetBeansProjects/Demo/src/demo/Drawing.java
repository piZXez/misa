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
    
    private List<RoutePoint> routePoints;

    public Drawing(List<RoutePoint> routePoints) {
        this.routePoints = routePoints;
    }
    
    @Override
    public void paintComponent(Graphics g){
        int[] x = new int[routePoints.size()];
        int[] y = new int[routePoints.size()];
        for(int i = 0; i < routePoints.size(); i++){
            x[i] = 100*routePoints.get(i).getLabel().getX();
        }
        
        for(int j = 0; j < routePoints.size(); j++){
            y[j] = 100*routePoints.get(j).getLabel().getY();
        }
        g.drawPolyline(x, y, routePoints.size());
    }
}