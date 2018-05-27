package org.academiadecodigo.debugginginac;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field {

    private static final int PADDING = 10;
    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;
    private static final int FOLDERS_PER_ROW = 6;
    private static final int PADDING_FOLDERS = 150;
    private Picture background;
    private Picture folderPic;

    public Field() {

        //Game Window
        Rectangle gameWindow = new Rectangle(PADDING, PADDING, WIDTH, HEIGHT);
        background = new Picture(0,0,"images/background/background.png");
        background.draw();
        gameWindow.draw();

        //Grid for the folders
        for (int i = 0; i < FOLDERS_PER_ROW; i++) {
            folderPic = new Picture(50 + (PADDING_FOLDERS * i),50,"images/folders/Folders-PNG-File.png");

            folderPic.draw();
        }
    }
}
