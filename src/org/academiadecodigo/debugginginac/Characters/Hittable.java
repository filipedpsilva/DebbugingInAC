package org.academiadecodigo.debugginginac.Characters;

public interface Hittable {

    void move(int xSpeed, int ySpeed);

    int getOffsetX();

    int getOffsetY();

    void hit();

    boolean isSwattered();

    void delete();
}
