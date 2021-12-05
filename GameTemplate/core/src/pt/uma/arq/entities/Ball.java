package pt.uma.arq.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import pt.uma.arq.game.Animator;

public class Ball {
    private int x;
    private int y;
    private int direcaoX;
    private int direcaoY;
    private int velocity;
    private boolean gameStatus;
    private Animator animator;
    private java.awt.Rectangle boundingBox;
    int centerX = Gdx.graphics.getWidth() /2;
    int centerY = 122;

    public Ball(SpriteBatch batch) {
        this.x = centerX;
        this.y = centerY;
        this.gameStatus = true;
        this.velocity = 7;
        this.direcaoX = 1;
        this.direcaoY = 1;
        animator = new Animator(batch, "ball.png", 2,2);
    }

    public java.awt.Rectangle getBoundingBox(){
        return boundingBox;
    }

    public boolean getGameStatus(){
        return gameStatus;
    }

    public void updatePosition(){
        x = x + (velocity * direcaoX);
        y = y + (velocity * direcaoY);

        if(x >= Gdx.graphics.getWidth() - animator.getWidth()){
            direcaoX = -1;
        }
        if(x <= 0){
            direcaoX = 1;
        }

        if(y >= Gdx.graphics.getHeight() - animator.getHeight()){
            direcaoY = -1;
        }
        if(y <= 0){
            gameStatus = false;
        }
        boundingBox.setLocation(x,y);
    }

    public void changeDirection(){
        if(direcaoY == 1){
            direcaoY = -1;
        }else{
            direcaoY = 1;
        }

        x = x + (velocity * direcaoX);
        y = y + (velocity * direcaoY);
    }

    public void create(){
        animator.create();
        boundingBox = new java.awt.Rectangle(x,y, animator.getWidth(), animator.getHeight());
    }

    public void render() {
        animator.render(x,y);
    }

}
