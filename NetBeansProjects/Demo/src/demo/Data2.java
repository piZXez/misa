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
public class Data2 {  
    
    private static Matrix matrix = new Matrix();
    private static GridMap gridMap = new GridMap();
    private static List<Route> routes = new ArrayList<>();
    
    private static Route route1 = new Route();
    private static Route route2 = new Route();
    private static Route route3 = new Route();
    private static Route route4 = new Route();
    
    private static List<Label> matrixLabels = new ArrayList<>();
    
    private static List<RoutePoint> routePoints1 = new ArrayList<>();
    private static List<RoutePoint> routePoints2 = new ArrayList<>();
    private static List<RoutePoint> routePoints3 = new ArrayList<>();
    private static List<RoutePoint> routePoints4 = new ArrayList<>();
    
    public static GridMap setData(){
        matrix.setA(7);
        matrix.setB(5);
        
        matrix.setMatrixLabels(matrixLabels);
        matrix.setDefaultLabel();
        
        gridMap.setMatrix(matrix);
        
        routePoints1.add(new RoutePoint(1, 3));
        routePoints1.add(new RoutePoint(4, 5));
        routePoints1.add(new RoutePoint(6, 4));
        routePoints1.add(new RoutePoint(7, 6));
        routePoints1.add(new RoutePoint(8, 10));
        routePoints1.add(new RoutePoint(7, 12));
        routePoints1.add(new RoutePoint(9, 13));
        routePoints1.add(new RoutePoint(11, 17));
        routePoints1.add(new RoutePoint(11, 19));
        routePoints1.add(new RoutePoint(13, 18));
        
        routePoints2.add(new RoutePoint(3, 2));
        routePoints2.add(new RoutePoint(3, 3));
        routePoints2.add(new RoutePoint(7, 5));
        routePoints2.add(new RoutePoint(9, 4));
        routePoints2.add(new RoutePoint(11, 8));
        routePoints2.add(new RoutePoint(11, 10));
        routePoints2.add(new RoutePoint(9, 14));
        routePoints2.add(new RoutePoint(10, 17));
        routePoints2.add(new RoutePoint(14, 15));
        
        routePoints3.add(new RoutePoint(0, 4));
        routePoints3.add(new RoutePoint(2, 8));
        routePoints3.add(new RoutePoint(3, 6));
        routePoints3.add(new RoutePoint(7, 6));
        routePoints3.add(new RoutePoint(6, 11));
        routePoints3.add(new RoutePoint(6, 13));
        routePoints3.add(new RoutePoint(6, 17));
        routePoints3.add(new RoutePoint(10, 16));
        routePoints3.add(new RoutePoint(9, 20));
        
        routePoints4.add(new RoutePoint(3, 1));
        routePoints4.add(new RoutePoint(3, 4));
        routePoints4.add(new RoutePoint(3, 8));
        routePoints4.add(new RoutePoint(6, 7));
        routePoints4.add(new RoutePoint(9, 6));
        routePoints4.add(new RoutePoint(11, 10));
        routePoints4.add(new RoutePoint(11, 14));
        routePoints4.add(new RoutePoint(10, 15));
        routePoints4.add(new RoutePoint(9, 19));
       
        
        route1.setRoutePoints(routePoints1);
        route2.setRoutePoints(routePoints2);
        route3.setRoutePoints(routePoints3);
        route4.setRoutePoints(routePoints4);
       
        gridMap.setRoutes(routes);

        gridMap.addRoute(route1);
        gridMap.addRoute(route2);
        gridMap.addRoute(route3);
        gridMap.addRoute(route4);
        
        gridMap.convertPointToLabel();
        
        return gridMap;
    }
    
}
