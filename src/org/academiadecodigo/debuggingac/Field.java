package org.academiadecodigo.debuggingac;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Field {

    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;

    private static final int PADDING = 10;

    public Field() {

        Rectangle gameWindow = new Rectangle(PADDING, PADDING, WIDTH, HEIGHT);
        gameWindow.fill();
    }


}
