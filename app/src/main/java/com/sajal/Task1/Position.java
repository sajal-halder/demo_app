package com.sajal.Task1;

import org.springframework.stereotype.Component;

@Component
public class Position {
    private Integer x_axis;
    private Integer y_axis;

    public void getLocation(){
        System.out.println("Position on x axis "+ x_axis);
        System.out.println("Position on Y axis "+ y_axis);
    }
    Position(){
        this.x_axis =0;
        this.y_axis =0;
    }

    public Integer getX_axis() {
        return x_axis;
    }

    public void setX_axis(Integer x_axis) {
        this.x_axis = x_axis;
    }

    public Integer getY_axis() {
        return y_axis;
    }

    public void setY_axis(Integer y_axis) {
        this.y_axis = y_axis;
    }
}
