package org.academiadecodigo.debugginginac.Characters;

public enum FeatureType {

    TOAD_RED(2, 1, "PATH", "PATH2"),
    TOAD_PURPLE(1, 1, "PATH", "PATH2"),
    TOAD_BROWN(2, 1, "PATH", "PATH2"),
    TOAD_GREEN(1, 1, "PATH", "PATH2");

    private int speed;
    private int livesLost;
    private String pic1;
    private String pic2;

    FeatureType(int speed, int killPoints, String pic1, String pic2){
        this.speed = speed;
        this.livesLost = killPoints;
        this.pic1 = pic1;
        this.pic2 = pic2;
    }

    public static FeatureType getRandomFeature(){
        return FeatureType.values()[(int)(Math.random()*FeatureType.values().length)];
    }

    public int getSpeed() {
        return speed;
    }

    public int getLivesLost() {
        return livesLost;
    }

    public String getPic1() {
        return pic1;
    }

    public String getPic2() {
        return pic2;
    }
}