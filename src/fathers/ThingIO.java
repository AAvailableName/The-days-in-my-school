package fathers;

import java.awt.event.MouseEvent;

public interface ThingIO {
	public void addVolume(ThingTemplate t); //on Player.pick()
	public void deleteVolume(int volume); //if Thing is expendable, delete it when it used;
	public void clearThing(); // on Player.pick()
	public void movedThing(MouseEvent e); //if player use mouse to move things in bag or short-cut bar, use this method
	public void reset(ThingTemplate t); //reset this thing to the thing you give
}
