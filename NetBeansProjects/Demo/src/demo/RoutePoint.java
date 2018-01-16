/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author DELL-PC
 */
public class RoutePoint {
    private String routePointName;
    private int x;
    private int y;

    public RoutePoint(String routePointName, int x, int y) {
        this.routePointName = routePointName;
        this.x = x;
        this.y = y;
    }

    public RoutePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //so sánh vị trí 2 điểm
    public boolean equals(RoutePoint p1){
        if(this.x == p1.getX() && this.y == p1.getY()){
            return true;
        }
        return false;
    }

    public void getXY(){
        System.out.print("("+x+","+y+") ");
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getRoutePointName() {
        return routePointName;
    }

    public void setRoutePointName(String routePointName) {
        this.routePointName = routePointName;
    }
}
