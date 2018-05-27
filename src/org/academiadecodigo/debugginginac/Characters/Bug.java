package org.academiadecodigo.debugginginac.Characters;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Bug implements Hittable {

    private BugType bugType;
    private boolean swattered;
    private int x;
    private int y;
    private int points;
    private String pic1;
    private String pic2;
    private String picSwattered;


    public Bug(BugType bugType) {
        this.bugType = bugType;
        this.pic1 = bugType.getPic1();
        this.pic2 = bugType.getPic2();
        this.points = bugType.getKillPoints();
    }

    @Override
    public void hit() {

    }

    @Override
    public boolean isSwattered() {
        return swattered;
    }

    @Override
    public void move(int xSpeed, int ySpeed) {

    }

    @Override
    public int getOffsetX() {
        return x + this.getOffsetX();
    }

    @Override
    public int getOffsetY() {
        return y + this.getOffsetY();
    }

    @Override
    public void delete() {

    }

    public BugType getBugType() {
        return bugType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getPoints() {
        return points;
    }
}
