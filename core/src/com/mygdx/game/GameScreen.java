package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class GameScreen implements Screen {
    private TextureActor menuButton;
    private Stage stage;

    class GoToMenuListener extends ClickListener {
        @Override
        public void clicked(InputEvent event, float x, float y) {
            MyGdxGame.getInstance().showMenu();
        }
    }

    public GameScreen(SpriteBatch batch) {
        menuButton = new TextureActor(new Texture("C:\\Users\\Ilya\\Desktop\\stone2.png"));
        menuButton.addListener(new GoToMenuListener());
        menuButton.setPosition(50,50);
        stage = new Stage();
        stage.addActor(menuButton);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {}

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void hide() {}
    @Override
    public void pause() {}
    @Override
    public void resume() {}
    @Override
    public void dispose() {}
}
