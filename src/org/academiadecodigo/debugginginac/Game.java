package org.academiadecodigo.debugginginac;

import org.academiadecodigo.debugginginac.Characters.Bug;
import org.academiadecodigo.debugginginac.Characters.CharactersFactory;
import org.academiadecodigo.debugginginac.Characters.Feature;
import org.academiadecodigo.debugginginac.Characters.Hittable;

import java.awt.*;

public class Game {

    private static final int TOTAL_CHARACTERS = 40;
    private Swatter swatter;
    private Field field;
    private boolean finished;
    private int gameLevel = 1;
    private int lives = 3;
    private int score = 0;
    private int currentCharacter = 0;
    private Hittable[] gameCharacters = new Hittable[TOTAL_CHARACTERS];


    public Game() {
    }

   /* public void menu() throws InterruptedException {
        finished = false;
        Menu menu = new Menu();
        menu.menuSelection();
        init();

    }*/

    public void init() {

        CharactersFactory factory = new CharactersFactory();

        for (int i = 0; i < TOTAL_CHARACTERS; i++) {
            int random = (int) (Math.random() * 10);

            if (random > 3) {
                gameCharacters[i] = factory.createBugs();
            } else {
                gameCharacters[i] = factory.createFeatures();
            }
        }

        swatter = new Swatter();
        field = new Field();

    }

    public void start() {

        while (!finished && currentCharacter < TOTAL_CHARACTERS) {

            for (int i = 0; i < TOTAL_CHARACTERS; i++) {
                showRandomCharacter();
                //field.updateScore();
                currentCharacter++;
            }
        }

        //levelUp();
        //nextLevelMenu();

    }

    private Hittable chooseRandomCharacter() {
        Hittable randomChar = gameCharacters[(int) (Math.random() * gameCharacters.length)];
        return randomChar;
    }

    private void showRandomCharacter() {

        //para aparecer apenas 1 character de cada vez
        Hittable character = gameCharacters[currentCharacter];

        //criar o movimento do boneco no local correto


        if (character instanceof Bug) {

            Bug bug = (Bug) character;


            if (swatter.getSwatterX() >= bug.getX() && swatter.getSwatterX() <= bug.getOffsetX()
                    && swatter.getSwatterY() >= bug.getY() && swatter.getSwatterY() <= bug.getOffsetY()) {

                character.hit();

                score += bug.getPoints();
                return;
            }
        }


        if (character instanceof Feature) {

            Feature feature = (Feature) character;

            if (swatter.getSwatterX() >= feature.getX() && swatter.getSwatterX() <= feature.getOffsetX()
                    && swatter.getSwatterY() >= feature.getY() && swatter.getSwatterY() <= feature.getOffsetY()) {

                character.hit();
            }

            lives--;

            if (lives == 0) {
                gameOver();
            }
            return;
        }

    }

    /* private void levelUp(){

         if(score >= LevelScores(gameLevel)){
             gameLevel++;
             gameMenu();
         } else {
             gameOverMenu();
         }
     }
 */
    private void gameOver() {
        finished = true;
        //gameOverMenu();

    }


}
