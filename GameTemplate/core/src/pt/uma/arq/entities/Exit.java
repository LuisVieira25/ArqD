package pt.uma.arq.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Exit {

    private Texture background;
    private Sprite sprite;
    SpriteBatch spriteBatch;

    public Exit(SpriteBatch batch) {
        this.spriteBatch = batch;
        background = new Texture("exit2.png");
        sprite = new Sprite(background);
        sprite.setPosition(Gdx.graphics.getWidth() - sprite.getWidth() - 20, Gdx.graphics.getHeight() - sprite.getHeight() - 20);
    }

    public void closeGame(){
    }

    public void render() {
        sprite.draw(spriteBatch);
    }

}
