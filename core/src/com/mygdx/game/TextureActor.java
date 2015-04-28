package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by Ilya on 21.04.2015.
 */
public class TextureActor extends Actor{
    private Texture toDraw;

    public TextureActor(Texture toDraw)
    {
        this.toDraw = toDraw;
        setSize(100,200);
        setPosition(100,100);
    }

    public void draw(Batch batch, float parentAlpha)
    {
        batch.setColor(getColor());
        batch.draw(toDraw,getX(),getY(),getWidth(),getHeight());
    }
}
