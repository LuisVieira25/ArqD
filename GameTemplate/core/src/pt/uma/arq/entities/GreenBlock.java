package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

public class GreenBlock extends Block{
    private Animator animator;
    private java.awt.Rectangle boundingBox;

    public GreenBlock(SpriteBatch batch, int points, int x, int y) {
        super(points, x, y);
        animator = new Animator(batch, "green.png", 2,1);
    }

    public java.awt.Rectangle getBoundingBox(){
        return boundingBox;
    }

    public void create(){
        animator.create();
        boundingBox = new java.awt.Rectangle(super.getX(),super.getY(), animator.getWidth(), animator.getHeight());
    }

    public void render() {
        animator.render(super.getX(),super.getY());
    }
}
