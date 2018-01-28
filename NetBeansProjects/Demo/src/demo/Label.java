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
class Label {
    private String labelName;
    private int count = 0;
    private int x;
    private int y;

    public Label() {
    }

    public Label(int x, int y) {
        this.x = x;
        this.y = y;
        this.labelName = x + "" + y;
    }

    public Label(String labelName, int x, int y) {
        this.labelName = labelName;
        this.x = x;
        this.y = y;
    }
    
    //tăng count lên 1
    public void stackCount(){
        count = count + 1;
    }
    
    //in ra tọa độ (x,y)
    public void printXY(){
        System.out.print("("+x+","+y+") ");
    }
    
    //so sánh vị trí 2 nhãn
    public boolean equalsLabel(Label p1){
        if(this.x == p1.getX() && this.y == p1.getY()){
            return true;
        }
        return false;
    }
    
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
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
    
    public String getXY(){
        return "("+x+","+y+")";
    }
    
    public int getCount(){
        return count;
    }
}
