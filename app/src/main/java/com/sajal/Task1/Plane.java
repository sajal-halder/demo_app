package com.sajal.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Plane implements MoveAble{
    @Autowired
    private Position position;

    @Override
    public void moveUp() {
        position.setY_axis(position.getY_axis()+2);
        System.out.println("plane  moved down direction 2 unit ");
    }

    @Override
    public void moveDown() {
        position.setY_axis(position.getY_axis()-2);
        System.out.println("plane  moved down direction 2 unit ");
    }

    @Override
    public void moveFront() {
        position.setX_axis(position.getX_axis()+2);
        System.out.println("plane  moved front direction 2 unit ");
    }

    @Override
    public void moveBack() {
        position.setX_axis(position.getX_axis()-2);
        System.out.println("plane  moved back direction 2 unit ");
    }

    public void getPosition(){
        position.getLocation();
    }
}
