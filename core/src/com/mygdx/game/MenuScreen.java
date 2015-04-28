package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import java.awt.event.InputEvent;

/**
 * Created by Ilya on 21.04.2015.
 */
public class MenuScreen implements Screen {
    private TextureActor button;
    private Stage stage;

    class GoToGameClickListener extends ClickListener
    {
        public void clicked (com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
            MyGdxGame.getInstance().showGame();
            System.out.println("hi");
        }
    }

    public MenuScreen(SpriteBatch batch)
    {
        button = new TextureActor(new Texture("C:\\Users\\Ilya\\Desktop\\Stone2.png"));
        button.setPosition(250,250);
        button.addListener(new GoToGameClickListener());
        stage = new Stage();
        stage.addActor(button);
    }

    public void render(float delta)
    {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(delta);
        stage.draw();
    }

    public void resize(int width, int height)
    {

    }

    public void show()
    {
        Gdx.input.setInputProcessor(stage);
    }


    public void hide(){}
    public void pause(){}
    public void resume(){}
    public void dispose(){}
}
