package GameArea;

import Game.Player;

public class Tiles {
    public int x;
    public int y;
    public Player owner;
    public int dice_num;
    public int dice_value;
    public int numberOfTiles = 0;
    
    public Tiles(int x, int y, Player owner, int numberOfTiles){
        this.x = x;
        this.y = y;
        this.owner = owner;
        //this.dice_value = dice_value;
        dice_num = generateDiceNumber();
        this.numberOfTiles = numberOfTiles;
    }

    public Tiles(int x, int y, Player owner){
        this.x = x;
        this.y = y;
        this.owner = owner;
        dice_num = 0;
        numberOfTiles++;
    }

    public static int generateDiceNumber(){
        int numberGenerated = (int) Math.floor(Math.random() * 8-1) + 1; 
        if(numberGenerated==0){
            numberGenerated++;
        }
        return numberGenerated;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public Player getOwner() {
        return owner;
    }
    public void setOwner(Player owner) {
        this.owner = owner;
    }
    public int getDice_num() {
        return dice_num;
    }
    public int getDice_value(){
        return dice_value;
    }
    public void setDice_num(int dice_num) {
        this.dice_num = dice_num;
    }
}
