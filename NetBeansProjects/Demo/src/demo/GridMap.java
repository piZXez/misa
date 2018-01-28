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
    public Route getRoute(int i){
        return routes.get(i);
    }

    //show tọa độ các điểm của 1 route đã chọn
    public void showRoutePoints(int a) {
        System.out.println("RoutePoints " + (a) + " is: ");
        for (int i = 0; i < this.routes.get(a).getRoutePoints().size(); i++) {
            this.routes.get(a).getRoutePoints().get(i).printXY();
        }
        System.out.println("");
    }

    //show tọa độ các điểm của tất cả các route trên gridmap
    public void showAllRoutePoints() {
        System.out.println("All routePoints is: ");
        for (int i = 0; i < routes.size(); i++) {
            for (int j = 0; j < routes.get(i).getRoutePoints().size(); j++) {
                routes.get(i).getRoutePoints().get(j).printXY();
            }
            System.out.println("");
        }
    }
    
    //convert điểm về nhãn
    public void convertPointToLabel(){
        for (int i = 0; i < routes.size(); i++){
            for (int j = 0; j < routes.get(i).getRoutePoints().size(); j++){
                int px = routes.get(i).getRoutePoints().get(j).getX();
                int py = routes.get(i).getRoutePoints().get(j).getY();
                routes.get(i).getRoutePoints().get(j).setLabel(new Label((px/3), (py/3)));
            }
        }
    }
    
    //show các nhãn của tất cả các route trên gridmap
    public void showAllRouteLabels() {
        System.out.println("All route labels is: ");
        for (int i = 0; i < routes.size(); i++) {
            for (int j = 0; j < routes.get(i).getRoutePoints().size(); j++) {
                System.out.print(routes.get(i).getRoutePoints().get(j).getLabel().getXY() + "");
            }
            System.out.println("");
        }
    }
    
    //get về tập routePoints của route(i)
    public List<RoutePoint> getRoutePoints(int i){
        return routes.get(i).getRoutePoints();
    }
    
    //in ra các nhãn trùng nhau 'stack' lần giữa các route
    public void countStack (int stack){
        for(int t = 0; t < (matrix.getMatrixLabels().size()); t++){
            for(int i = 0; i < routes.size(); i++){
                for(int j = 0; j < routes.get(i).getRoutePoints().size(); j++){
                    if(matrix.getMatrixLabels().get(t).equalsLabel(routes.get(i).getRoutePoints().get(j).getLabel()) == true){
                        matrix.getMatrixLabels().get(t).stackCount();                       
                    }
                }
            }
            if(matrix.getMatrixLabels().get(t).getCount() == stack){
                matrix.getMatrixLabels().get(t).printXY();
                System.out.println("");
            }
        }
    }
    
    public int frequentStack(Route route){
        for (int i = 0; i < routes.size(); i++){
            if (routes.get(i).isSubSequence(route)){
                route.stackFrequentCount();
            }
        }
        return route.getFrequentCount();
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
