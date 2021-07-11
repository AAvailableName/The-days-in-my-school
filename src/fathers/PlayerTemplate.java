package fathers;

import java.awt.Image;

public abstract class PlayerTemplate extends Character implements PlayerIO {
	public static final int DEFAULT_HEIGHT = 20;
	public static final int DEFAULT_WIDTH = 20;
	public static Image img;             //the image of player
	
	public Thing[][] bag = new Thing[5][5];
	public Thing[] shortcutBar = bag[0]; //this is the short-cut bar of player
}
