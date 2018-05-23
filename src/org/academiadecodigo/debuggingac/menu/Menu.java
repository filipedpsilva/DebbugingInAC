package org.academiadecodigo.debuggingac.menu;

import org.academiadecodigo.debuggingac.simplegraphics.mouse.Mouse;
import org.academiadecodigo.debuggingac.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.debuggingac.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.debuggingac.simplegraphics.mouse.MouseHandler;


public class Menu{
    private MenuEvent menuEvent;
    private int mouseX;
    private int mouseY;


    public Menu() throws InterruptedException{
        new MouseMenu();
        menuEvent = new MenuEvent();
        loading();
    }


    public void selection() throws InterruptedException {
        System.out.println("Selected menu");
    }

    private void loading() throws InterruptedException {
        menuEvent.init();
        menuEvent.soundMenu();
        mainMenu();
    }

    private void mainMenu() {
        menuEvent.mainMenu();
    }


    private class MouseMenu implements MouseHandler{
        private Mouse mouse;

        MouseMenu(){
            this.mouse=new Mouse(this);
            addEventListener();
        }
        void addEventListener(){
            mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            mouseX = (int) e.getX();
            mouseY = (int) e.getY();
        }

        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

}
