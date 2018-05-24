package org.academiadecodigo.debuggingac;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class Swatter implements MouseHandler {


    private int x;
    private int y;
    private Mouse mouse;
    //Sound


    public Swatter() {
        SwatterController();
        // sound = new Sound("path");
    }

    private void hit() {
        /*se imagem clicada fazer som
            aparecer a imagem de impacto na imagem
            adicioar pontos
            Se falhar faz só som...
         */
        System.out.println("Click!");

    }

    private void SwatterController() {
        this.mouse = new Mouse(this);
        addEventListener();
    }

    private void addEventListener() {
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x = (int) e.getX();
        y = (int) e.getY();
        hit();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}



