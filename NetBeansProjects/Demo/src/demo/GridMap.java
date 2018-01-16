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
public class GridMap {
    private String gridMapName;
    private Matrix matrix;
    private List<Route> routes;

    public GridMap(String gridMapName, Matrix matrix, List<Route> routes) {
        this.gridMapName = gridMapName;
        this.matrix = matrix;
        this.routes = routes;
    }

    public GridMap(String gridMapName, Matrix matrix) {
        this.gridMapName = gridMapName;
        this.matrix = matrix;
    }

    GridMap() {
    }
        
    //thêm route vào gridmap
    public void addRoute(Route route1) {
        this.routes.add(route1);
    }

    //show tọa độ các điểm của 1 route đã chọn
    public void showRoutePoints(int a) {
        System.out.println("RoutePoints " + (a) + " is: ");
        for (int i = 0; i < this.routes.get(a).getRoutePoints().size(); i++) {
            this.routes.get(a).getRoutePoints().get(i).getXY();
        }
        System.out.println("");
    }

    //show tọa độ các điểm của tất cả các route trên gridmap
    public void showAllRoutePoints() {
        System.out.println("All routePoints is: ");
        for (int i = 0; i < routes.size(); i++) {
            for (int j = 0; j < routes.get(i).getRoutePoints().size(); j++) {
                routes.get(i).getRoutePoints().get(j).getXY();
            }
            System.out.println("");
        }
    }
    
    //in ra ma trận
    public void showMatrix(){
        for (int i=0; i<matrix.getA(); i++){
            for(int j=0; j<matrix.getB(); j++){
                System.out.print(i + "" + j + " ");
            }
            System.out.println("");
        }
    }
    
    public String getGridMapName() {
        return gridMapName;
    }

    public void setGridMapName(String gridMapName) {
        this.gridMapName = gridMapName;
    }

    public Matrix getMatrix() {
        return matrix;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }
}
