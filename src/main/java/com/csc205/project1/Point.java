package com.csc205.project1;
public class Point {
   public double x;
   public double y;
    public Point (){
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point b) {
        return java.lang.Math.sqrt((java.lang.Math.pow((b.x - x),2) + java.lang.Math.pow((b.y - y),2)));
    }

    public double getX() {
        return x;
    }

    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }


    //add not subtract for shift
    public void shiftX(double n){
        x = x + n;
    }
    public void shiftY(double n){
        y = y + n;
    }


    public void rotate(double angle){
        x = (x*java.lang.Math.cos(angle)) - (y*java.lang.Math.sin(angle));
        y = (x*java.lang.Math.sin(angle)) + (y*java.lang.Math.cos(angle));
    }

    public String toString(){
       return  "Point{x = " + x + ", y = "+ y + "}";
    }


}
