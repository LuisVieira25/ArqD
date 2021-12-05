package pt.uma.arq.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;
import java.util.ArrayList;

public abstract class Block {
    private boolean collided;
    private int points;
    private int x;
    private int y;

    public Block(int points, int x, int y) {
        this.collided = false;
        this.points = points;
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public abstract void create();
    public abstract void render();
    public abstract java.awt.Rectangle getBoundingBox();

}
