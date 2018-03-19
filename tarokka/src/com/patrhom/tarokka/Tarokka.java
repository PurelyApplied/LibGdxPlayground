package com.patrhom.tarokka;

import java.util.List;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class Tarokka extends ApplicationAdapter {
  private List<Card> deck;
  private Rectangle deckRectangle;
  private Texture deckTexture;

  private Card upCard;

  private Texture dropImage;
  private Texture bucketImage;
  private Sound dropSound;
  private Music rainMusic;
  private SpriteBatch batch;
  private OrthographicCamera camera;
  private Rectangle bucket;
  private Array<Rectangle> raindrops;
  private long lastDropTime;

  @Override
  public void create() {
    // create the camera and the SpriteBatch
    camera = new OrthographicCamera();
    camera.setToOrtho(false, 800, 480);

    batch = new SpriteBatch();
    deck = Deck.buildDeck();
    deckRectangle = new Rectangle(100, 100,
        DeckGraphicLoader.CARD_WIDTH, DeckGraphicLoader.CARD_HEIGHT);
    deckTexture = DeckGraphicLoader.getCardback();
  }

  @Override
  public void render() {
    // clear the screen with a dark blue color. The
    // arguments to glClearColor are the red, green
    // blue and alpha component in the range [0,1]
    // of the color to be used to clear the screen.
    Gdx.gl.glClearColor(0, 0, 0.2f, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    // tell the camera to update its matrices.
    camera.update();

    // tell the SpriteBatch to render in the
    // coordinate system specified by the camera.
    batch.setProjectionMatrix(camera.combined);

    // begin a new batch and draw the bucket and
    // all drops
    batch.begin();
    batch.draw(deckTexture, deckRectangle.x, deckRectangle.y);
    batch.end();

//    // process user input
//    if(Gdx.input.isTouched()) {
//      Vector3 touchPos = new Vector3();
//      touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
//      camera.unproject(touchPos);
//      bucket.x = touchPos.x - 64 / 2;
//    }
//    if(Gdx.input.isKeyPressed(Keys.DOWN)){
//
//    }
//      bucket.x -= 200 * Gdx.graphics.getDeltaTime();
//    if(Gdx.input.isKeyPressed(Keys.RIGHT))
//      bucket.x += 200 * Gdx.graphics.getDeltaTime();
//
//    // make sure the bucket stays within the screen bounds
//    if(bucket.x < 0) bucket.x = 0;
//    if(bucket.x > 800 - 64) bucket.x = 800 - 64;
//
//    // move the raindrops, remove any that are beneath the bottom edge of
//    // the screen or that hit the bucket. In the later case we play back
//    // a sound effect as well.
//    Iterator<Rectangle> iter = raindrops.iterator();
//    while(iter.hasNext()) {
//      Rectangle raindrop = iter.next();
//      raindrop.y -= 200 * Gdx.graphics.getDeltaTime();
//      if(raindrop.y + 64 < 0) iter.remove();
//      if(raindrop.overlaps(bucket)) {
//        // dropSound.play();
//        iter.remove();
//      }
//    }
  }

  @Override
  public void dispose() {
    // dispose of all the native resources
//    dropImage.dispose();
//    bucketImage.dispose();
    // dropSound.dispose();
    // rainMusic.dispose();
//    batch.dispose();
  }
}
