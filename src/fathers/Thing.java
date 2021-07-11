package fathers;

import java.awt.Image;

import frame.Frame;

public abstract class Thing {
	public Frame frame;
	public Image img;
	public String name; 
	public int volume; //the number of this thing
	public int weight;
	public int attack; //the value to hit others
	public int defence; //the value of defend other's hit
	public int ID; //to let program know its name, use 0x?
	
	public Thing(Image img, Frame frame, String name, int volume, int weight, int attack, int defence, int ID) {
		this.img = img;
		this.frame = frame;
		this.name = name;
		this.volume = volume;
		this.weight = weight;
		this.attack = attack;
		this.defence = defence;
		this.ID = ID;
	}
	
	public Thing(ThingTemplate t) {
		img = t.img;
		frame = t.frame;
		name = t.name;
		volume = t.volume;
		weight = t.weight;
		attack = t.attack;
		defence = t.defence;
		ID = t.ID;
	}
}
