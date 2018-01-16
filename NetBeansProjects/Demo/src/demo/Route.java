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
public class Route {
    private String routeName;
    private List<RoutePoint> routePoints;

    public Route(String routeName, List<RoutePoint> routePoints) {
        this.routeName = routeName;
        this.routePoints = routePoints;
    }

    public Route(List<RoutePoint> routePoints) {
        this.routePoints = routePoints;
    }

    Route() {
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
    
    
}
