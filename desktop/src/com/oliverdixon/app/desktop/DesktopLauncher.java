package com.oliverdixon.app.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.math.Vector2;
import com.oliverdixon.app.controllers.TenPinBowling;
import com.oliverdixon.app.models.Defaults;

public class DesktopLauncher
{
    private static final Vector2 nexus5ResDesktop = new Vector2(800, 480);

    private static final String
            TEXTURES_LOCATION = "../textures/";

	public static void main (String[] arg)
    {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        AtlasPacker.main(new String[]{TEXTURES_LOCATION, "./", Defaults.ATLAS_PACK});

        config.width = (int)nexus5ResDesktop.x;
        config.height = (int)nexus5ResDesktop.y;
        config.useHDPI = true;

		new LwjglApplication(new TenPinBowling(), config);
	}
}
