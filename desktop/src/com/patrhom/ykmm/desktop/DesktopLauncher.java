package com.patrhom.ykmm.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.patrhom.tarokka.Tarokka;

public class DesktopLauncher {
  public static void main(String[] arg) {
    LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
    cfg.title = "hello-world";
    cfg.width = 400;
    cfg.height = 320;
    cfg.useGL30 = false;

    new LwjglApplication(new Tarokka(), cfg);

  }
}
