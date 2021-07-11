package fathers;

import java.awt.Image;

import frame.Frame;

public abstract class ThingTemplate extends Thing implements ThingIO{
	public ThingTemplate(Image img, Frame frame, String name, int volume, int weight, int attack, int defence, int ID) {
		super(img, frame, name, volume, weight, attack, defence, ID);
		// TODO Auto-generated constructor stub
	}
	
	public ThingTemplate(ThingTemplate t) {
		super(t);
		// TODO Auto-generated constructor stub
	}
}
