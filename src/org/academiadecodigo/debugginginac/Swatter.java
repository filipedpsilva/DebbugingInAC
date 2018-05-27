package org.academiadecodigo.debugginginac;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class Swatter implements MouseHandler {

    private Mouse swatter;
    private int swatterX;
    private int swatterY;

    public Swatter() {
        this.swatter = new Mouse(this);
        addEventListener();
    }

    private void addEventListener() {
        swatter.addEventListener(MouseEventType.MOUSE_CLICKED);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        swatterX = (int) e.getX();
        swatterY = (int) e.getY();
        System.out.println("click on: X " + swatterX + " - Y " + swatterY);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    public int getSwatterX() {
        return swatterX;
    }

    public int getSwatterY() {
        return swatterY;
    }

    public Mouse getSwatter() {
        return swatter;
    }
}

