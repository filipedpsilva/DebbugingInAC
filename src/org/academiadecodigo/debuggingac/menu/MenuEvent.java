package org.academiadecodigo.debuggingac.menu;

import org.academiadecodigo.debuggingac.audio.Audio;
import org.academiadecodigo.debuggingac.simplegraphics.pictures.Picture;


public class MenuEvent {
    private Picture menuBG;
    private Picture menuLoader;
    private Audio menu;
    private Audio loading;


    public MenuEvent() {
        this.menuBG = new Picture(0, 0, "resources/images/menu/menu.png");
        this.menuLoader = new Picture(0, 0, "resources/images/menu/loading.png");
        this.loading = new Audio("/resources/sounds/boot.wav");
    }

    public void init() throws InterruptedException{
        menuLoader.draw();
        Thread.sleep(400);
        loading.start(true);
        Thread.sleep(1750);
        menuLoader.delete();
    }
    public void mainMenu(){

        menuBG.draw();
    }
    public void killSoundMenu(){
        menu.stop();
    }

    public void soundMenu(){
        menu = new Audio("/resources/sounds/menubg.wav");
        menu.createLoop(5);
        menu.start(true);
    }


}
