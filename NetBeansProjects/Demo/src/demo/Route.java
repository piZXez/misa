/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author DELL-PC
 */
public class Route {
    private String routeName;
    private List<RoutePoint> routePoints;
    private int frequentCount = 0;

    public Route(String routeName, List<RoutePoint> routePoints) {
        this.routeName = routeName;
        this.routePoints = routePoints;
    }

    public Route(List<RoutePoint> routePoints) {
        this.routePoints = routePoints;
    }

    Route() {
    }
    
    public void stackFrequentCount(){
        frequentCount = frequentCount + 1;
    }
    
    //kiểm tra route này có là chuỗi con route kia không
    public boolean isSubSequence(Route parentRoute){
        Set<String> parentRoutePoints = new HashSet<>();
        Set<String> subRoutePoints = new HashSet<>();
        
        for (int i = 0; i < parentRoute.getRoutePoints().size(); i++){
            parentRoutePoints.add(parentRoute.getRoutePoints().get(i).getLabel().getXY());
        }
        for (int j = 0; j < routePoints.size(); j++){
            subRoutePoints.add(routePoints.get(j).getLabel().getXY());
        }
        
        return parentRoutePoints.containsAll(subRoutePoints);
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public List<RoutePoint> getRoutePoints() {
        return routePoints;
    }

    public void setRoutePoints(List<RoutePoint> routePoint) {
        this.routePoints = routePoint;
    }

    public int getFrequentCount() {
        return frequentCount;
    }
    
}
