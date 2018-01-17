/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL-PC
 */
public class Data1 {  
    
    private static Matrix matrix = new Matrix();
    private static GridMap gridMap = new GridMap();
    private static List<Route> routes = new ArrayList<>();
    
    private static Route route1 = new Route();
    private static Route route2 = new Route();
    private static Route route3 = new Route();
    private static Route route4 = new Route();
    
    private static List<RoutePoint> routePoints1 = new ArrayList<>();
    private static List<RoutePoint> routePoints2 = new ArrayList<>();
    private static List<RoutePoint> routePoints3 = new ArrayList<>();
    private static List<RoutePoint> routePoints4 = new ArrayList<>();
    private static List<RoutePoint> routePointsMatrix = new ArrayList<>();
    
    public static GridMap setData(){
        matrix.setA(7);
        matrix.setB(5);
        matrix.setRoutePoints(routePointsMatrix);
        matrix.setDefaultPoints();
        
        gridMap.setMatrix(matrix);
        
        routePoints1.add(new RoutePoint(0, 1));
        routePoints1.add(new RoutePoint(1, 1));
        routePoints1.add(new RoutePoint(2, 1));
        routePoints1.add(new RoutePoint(2, 2));
        routePoints1.add(new RoutePoint(2, 3));
        routePoints1.add(new RoutePoint(2, 4));
        routePoints1.add(new RoutePoint(3, 4));
        routePoints1.add(new RoutePoint(3, 5));
        routePoints1.add(new RoutePoint(3, 6));
        routePoints1.add(new RoutePoint(4, 6));
        
        routePoints2.add(new RoutePoint(1, 0));
        routePoints2.add(new RoutePoint(1, 1));
        routePoints2.add(new RoutePoint(2, 1));
        routePoints2.add(new RoutePoint(3, 1));
        routePoints2.add(new RoutePoint(3, 2));
        routePoints2.add(new RoutePoint(3, 3));
        routePoints2.add(new RoutePoint(3, 4));
        routePoints2.add(new RoutePoint(3, 5));
        routePoints2.add(new RoutePoint(4, 5));
        
        routePoints3.add(new RoutePoint(0, 1));
        routePoints3.add(new RoutePoint(0, 2));
        routePoints3.add(new RoutePoint(1, 2));
        routePoints3.add(new RoutePoint(2, 2));
        routePoints3.add(new RoutePoint(2, 3));
        routePoints3.add(new RoutePoint(2, 4));
        routePoints3.add(new RoutePoint(2, 5));
        routePoints3.add(new RoutePoint(3, 5));
        routePoints3.add(new RoutePoint(3, 6));
        
        routePoints4.add(new RoutePoint(1, 0));
        routePoints4.add(new RoutePoint(1, 1));
        routePoints4.add(new RoutePoint(1, 2));
        routePoints4.add(new RoutePoint(2, 2));
        routePoints4.add(new RoutePoint(3, 2));
        routePoints4.add(new RoutePoint(3, 3));
        routePoints4.add(new RoutePoint(3, 4));
        routePoints4.add(new RoutePoint(3, 5));
        routePoints4.add(new RoutePoint(3, 6));
       
        
        route1.setRoutePoints(routePoints1);
        route2.setRoutePoints(routePoints2);
        route3.setRoutePoints(routePoints3);
        route4.setRoutePoints(routePoints4);
       
        gridMap.setRoutes(routes);

        gridMap.addRoute(route1);
        gridMap.addRoute(route2);
        gridMap.addRoute(route3);
        gridMap.addRoute(route4);

        
        return gridMap;
    }
    
}
