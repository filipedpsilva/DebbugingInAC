package org.academiadecodigo.debugginginac;

public enum FolderType {
    CAR_CRASH("images/folders/Folders-PNG-File.png"),
    SNIPER_ELITE("images/folders/Folders-PNG-File.png"),
    GUESS_A_NUMBER("images/folders/Folders-PNG-File.png"),
    ARABIAN_NIGHT("images/folders/Folders-PNG-File.png"),
    HOTEL("images/folders/Folders-PNG-File.png"),
    MONEY_IN_THE_BANK("images/folders/Folders-PNG-File.png"),
    ROCK_PAPER_SCISSORS("images/folders/Folders-PNG-File.png"),
    HELLO_WORLD("images/folders/Folders-PNG-File.png");

    private String folderPic;

    FolderType(String folderPic){
        this.folderPic = folderPic;
    }

    public FolderType getRandomFolder(){
        return FolderType.values()[(int)(Math.random() * FolderType.values().length)];
    }
}
