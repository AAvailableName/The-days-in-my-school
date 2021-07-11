package resources.things;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;

import fathers.ThingTemplate;
import frame.Frame;

public class Book extends ThingTemplate{
	public Book(Image img, Frame frame, String name, int volume, int weight, int attack, int defence, int ID) {
		super(img, frame, name, volume, weight, attack, defence, ID);
		// TODO Auto-generated constructor stub
	}

	public Book(Book book) {
		// TODO Auto-generated constructor stub
		super(book);
	}

	@Override
	public void addVolume(ThingTemplate t) {
		// TODO Auto-generated method stub
		volume += t.volume;
		t.clearThing();
	}

	@Override
	public void deleteVolume(int volume) {
		// TODO Auto-generated method stub
		this.volume -= volume;
		if(volume <= 0) {
			clearThing();
		}
	}

	@Override
	public void clearThing() {
		// TODO Auto-generated method stub
		volume = 0;
	}

	@Override
	public void movedThing(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g = frame.getGraphics();
		g.drawImage(img, e.getX(), e.getY(), null);
	}
	
	@Override
	public void reset(ThingTemplate t) {
		// TODO Auto-generated method stub
		img = t.img;
		name = t.name;
		volume = t.volume;
		weight = t.weight;
		attack = t.attack;
		defence = t.defence;
		ID = t.ID;
		t.clearThing();
	}
}
