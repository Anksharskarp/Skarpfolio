package dev.anksharskarp.raindrops.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import dev.anksharskarp.raindrops.Raindrops;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Raindrops";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new Raindrops(), config);
	}
}
