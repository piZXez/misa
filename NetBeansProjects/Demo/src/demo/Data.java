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
public class Data {  
    
    private static Matrix matrix = new Matrix();
    private static GridMap gridMap = new GridMap();
    private static List<Route> routes = new ArrayList<>();
    
    private static Route route1 = new Route();
    private static Route route2 = new Route();
    private static Route route3 = new Route();
    private static Route route4 = new Route();
    private static Route route5 = new Route();
    
    private static List<Label> matrixLabels = new ArrayList<>();
    
    private static List<RoutePoint> routePoints1 = new ArrayList<>();
    private static List<RoutePoint> routePoints2 = new ArrayList<>();
    private static List<RoutePoint> routePoints3 = new ArrayList<>();
    private static List<RoutePoint> routePoints4 = new ArrayList<>();
    private static List<RoutePoint> routePoints5 = new ArrayList<>();
    
    public static GridMap setData(){
        matrix.setA(5);
        matrix.setB(5);
        
        matrix.setMatrixLabels(matrixLabels);
        matrix.setDefaultLabel();
        
        gridMap.setMatrix(matrix);
        
        routePoints1.add(new RoutePoint(3, 2));
        routePoints1.add(new RoutePoint(4, 4));
        routePoints1.add(new RoutePoint(6, 4));
        routePoints1.add(new RoutePoint(8, 6));
        routePoints1.add(new RoutePoint(8, 10));
        routePoints1.add(new RoutePoint(11, 9));
        routePoints1.add(new RoutePoint(13, 9));
        
        routePoints2.add(new RoutePoint(0, 1));
        routePoints2.add(new RoutePoint(4, 2));
        routePoints2.add(new RoutePoint(5, 3));
        routePoints2.add(new RoutePoint(7, 5));
        routePoints2.add(new RoutePoint(8, 7));
        routePoints2.add(new RoutePoint(8, 10));
        routePoints2.add(new RoutePoint(10, 10));
        routePoints2.add(new RoutePoint(13, 10));
        routePoints2.add(new RoutePoint(14, 12));
        
        routePoints3.add(new RoutePoint(2, 7));
        routePoints3.add(new RoutePoint(5, 7));
        routePoints3.add(new RoutePoint(7, 6));
        routePoints3.add(new RoutePoint(7, 10));
        routePoints3.add(new RoutePoint(6, 13));
        
        routePoints4.add(new RoutePoint(1, 8));
        routePoints4.add(new RoutePoint(3, 7));
        routePoints4.add(new RoutePoint(7, 8));
        routePoints4.add(new RoutePoint(7, 10));
        routePoints4.add(new RoutePoint(8, 14));
        routePoints4.add(new RoutePoint(10, 13));
        routePoints4.add(new RoutePoint(12, 13));
        
        routePoints5.add(new RoutePoint(1, 0));
        routePoints5.add(new RoutePoint(1, 3));
        routePoints5.add(new RoutePoint(1, 6));
        routePoints5.add(new RoutePoint(3, 7));
        routePoints5.add(new RoutePoint(7, 7));
        routePoints5.add(new RoutePoint(8, 9));
        routePoints5.add(new RoutePoint(8, 13));
        routePoints5.add(new RoutePoint(10, 12));
        routePoints5.add(new RoutePoint(13, 12));
        
        route1.setRoutePoints(routePoints1);
        route2.setRoutePoints(routePoints2);
        route3.setRoutePoints(routePoints3);
        route4.setRoutePoints(routePoints4);
        route5.setRoutePoints(routePoints5);
       
        gridMap.setRoutes(routes);

        gridMap.addRoute(route1);
        gridMap.addRoute(route2);
        gridMap.addRoute(route3);
        gridMap.addRoute(route4);
        gridMap.addRoute(route5);

        gridMap.convertPointToLabel();
        
        return gridMap;
    }
    
}
