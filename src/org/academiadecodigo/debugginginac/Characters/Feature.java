package org.academiadecodigo.debugginginac.Characters;

public class Feature implements Hittable {

    private FeatureType featureType;
    private boolean swattered;
    private int x;
    private int y;
    private String pic1;
    private String pic2;
    private String picSwattered;

    public Feature(FeatureType featureType) {
        this.featureType = featureType;
        this.pic1 = featureType.getPic1();
        this.pic2 = featureType.getPic2();
    }


    @Override
    public void hit() {

    }

    @Override
    public void move(int xSpeed, int ySpeed) {

    }

    @Override
    public boolean isSwattered() {
        return swattered;
    }

    @Override
    public int getOffsetX() {
        return x + this.getOffsetX();
    }

    @Override
    public int getOffsetY() {
        return y + this.getOffsetY();
    }

    @Override
    public void delete() {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
