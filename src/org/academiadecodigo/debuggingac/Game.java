package org.academiadecodigo.debuggingac;

import java.awt.*;
import java.util.Timer;

public class Game {

    private Swatter swatter;
    private Field field;
    private Timer time;
    private boolean timeUp;
    private boolean finished;
    private Menu gameMenu;
    private int gameLevel;
    private int lives;
    private int score;

    // o 6 será o número máximo de characters existentes. Depois é para alterar
    private CharactersFactory[] characters = new CharactersFactory[6];

    public Game() {
    }

    public void menu() throws InterruptedException {
        exit = false;
        Menu menu = new Menu();
        menu.menuSelection();
        init();

    }

    public void init() {
        swatter = new Swatter();
        field = new Field();
        gameMenu = new Menu();
        gameLevel = 1;
        lives = 3;
        score = 0;
        createdBugs = 0;
        hittedBugs = 0;
        // timer
        for (int i = 0; i < characters.length; i++) {
            characters[i] = new CharactersFactory();
        }

        start();
    }

    public void start() {

        //verificar como funciona o timer

        while (!finished && time > 0) {
            field.updateScore();
            showRandomCharacter();
        }

        levelUp();
        gameMenu();

    }

    private CharactersFactory chooseRamdomCharacter() {
        CharactersFactory randomChar = characters[(int) (Math.random() * characters.length)];
        return randomChar;
    }

    private void showRandomCharacter() {

        //para aparecer apenas 1 character de cada vez
        CharactersFactory character = chooseRamdomCharacter();

        //criar o movimento do boneco no local correto


        //verificar se o hit foi em cima da imagem do character
        if(swatter.getX() >= character.getX() && swatter.getX() <= character.getXOffSet()
                && swatter.getY() >= character.getY() && swatter.getY() <= character.getYOffSet()) {

            character.hit();

            if (character.getType() == BUG) {
                score += character.getPoints();
                return;
            }

            if (character.getType() == FEATURE) {
                score -= character.getPoints();
                lives--;
                if (lives == 0) {
                    finished = true;
                }
                return;
            }
        }
    }

    private void levelUp(){

        if(score >= LevelScores(gameLevel)){
            gameLevel++;
            gameMenu();
        } else {
            finished = true;
            gameOverMenu();
        }
    }


}