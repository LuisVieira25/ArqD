package pt.uma.arq.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import pt.uma.arq.game.Animator;

public class PlayerPaddle {
    private int x;
    private int y;
    private int direcao;
    private int velocity;
    private Animator animator;
    private java.awt.Rectangle boundingBox;

    int centerX = Gdx.graphics.getWidth() /2;


    public PlayerPaddle(SpriteBatch batch) {
        this.x = centerX;
        this.y = 86;
        this.velocity = 10;
        this.direcao = 1;
        animator = new Animator(batch, "full_paddle.png", 6,1);
    }

    public void updatePositionRight(){
        if(x <= Gdx.graphics.getWidth() - animator.getWidth()){
            x+= 10;
        }
        boundingBox.setLocation(x,y);
    }

    public void updatePositionLeft(){
        if(x >= 2){
            x -= 10;
        }
        boundingBox.setLocation(x,y);
    }

    public java.awt.Rectangle getBoundingBox(){
        return boundingBox;
    }

    public void create(){
        animator.create();
        boundingBox = new java.awt.Rectangle(x,y, animator.getWidth(), animator.getHeight());
    }

    public void render() {
        animator.render(x,y);
    }


}
