package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Ilya on 21.04.2015.
 */
public class MyGdxGame extends Game{
	private SpriteBatch batch;
	private MenuScreen menuScreen;
	private GameScreen gameScreen;
	private float x,y;

	private static MyGdxGame instance = new MyGdxGame();



	public static MyGdxGame getInstance() {
		return instance;
	}


	class MyinputListener implements InputProcessor
	{
		public boolean keyDown(int keycode)
		{
			switch (keycode)
			{
				case Input.Keys.UP :
					y += 5;
					break;
				case Input.Keys.DOWN:
					y -= 5;
					break;
				case Input.Keys.LEFT:
					x -= 5;
					break;
				case Input.Keys.RIGHT:
					x += 5;
					break;
			}
			return false;
		}

		public boolean keyUp(int keycode)
		{
			return false;
		}

		public boolean keyTyped(char keyCode)
		{
			return false;
		}

		public boolean touchDown(int x,int y,int pointer,int button)
		{
			return true;
		}

		public boolean touchUp(int x,int y,int pointer,int button)
		{
			return true;
		}

		public boolean touchDragged(int x,int y,int pointer)
		{

			return true;
		}

		public boolean scrolled(int amount)
		{
			return false;
		}

		public boolean mouseMoved(int x,int y)
		{
			return false;
		}

	}

	@Override
	public void create()
	{
		batch = new SpriteBatch();
		menuScreen = new MenuScreen(batch);
		gameScreen = new GameScreen(batch);
		Gdx.input.setInputProcessor(new MyinputListener());
		//setScreen(menuScreen);
	}

	public void render()
	{
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(new Texture("C:\\Users\\Ilya\\Desktop\\Stone2.png"), x, y);
		batch.end();
	}

	public void showMenu()
	{
		setScreen(menuScreen);
	}

	public  void showGame()
	{
		setScreen(gameScreen);
		this.render();
	}
}
