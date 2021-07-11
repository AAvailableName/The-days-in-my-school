package fathers;

import java.awt.Toolkit;

public abstract class Character {
	public static final int MAXHP = 100, MAXSP = 50, MAXSAN = 100; //this is the default value of hp , sp and san
	public static final int MAXHEALTH = 100, MAXHUNGER = 50, MAXFOCUS = 100; //this is the default value of health , hunger and focus
	
	public int hp, sp, san;
	public int health, hunger, focus;
	public int resolution_width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int resolution_height = Toolkit.getDefaultToolkit().getScreenSize().height;
	public String visionFieldType = "Normal";        //the field's type, it will be changed by the san's value go down
	
	public Character() {
		hp = MAXHP;
		sp = MAXSP;
		san = MAXSAN;
		health = MAXHEALTH;
		hunger = MAXHUNGER;
		focus = MAXFOCUS;
	}
}
