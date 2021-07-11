package frame;

import java.awt.Graphics;
import java.util.Iterator;
import java.util.Random;

import javax.management.RuntimeErrorException;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

import fathers.NPCTemplate;
import fathers.Thing;
import resources.Player;

public class Frame extends JFrame{
	private final long versionID = 1L;
	private final String gameName = "The days in my school";
	private final String gameVersion = "Beta v1.0";
	
	
	public int frame_width, frame_height;
	public final int DEFAULT_WIDTH = 800, DEFAULT_HEIGHT = 600;
	
	public Player player;
	
	public JProgressBar hp;
	public JProgressBar sp;
	public JProgressBar san;
	
	public NPCTemplate[] NPCList;
	public NPCTemplate[] NPCShowList;
	
	public Obstacle[] obstacleList;
	public Obstacle[] obstacleShowList;
	
	public Thing[] thingList;
	public Thing[] thingShowList;
	
	public BGI bgi;
	public BGM bgm;
	
	public boolean isInitMap = false;
	
	public int[][] map;
	public int[][] showedMap;
	
	public Frame(int width, int height) {
		this.frame_width = width;
		this.frame_height = height;
		add(hp);
		add(sp);
		add(san);
	}
	
	public Frame() {
		frame_width = DEFAULT_WIDTH;
		frame_height = DEFAULT_HEIGHT;
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics gTemp = getGraphics();
		gTemp.drawImage(bgi.img, 0, 0, frame_width, frame_height, this);
		
		paintVariable(hp, sp, san);
		
		gTemp.drawImage(Player.img, player.x, player.y, Player.DEFAULT_WIDTH, Player.DEFAULT_HEIGHT, this);
	
		paintMap(gTemp, showedMap);
		
		createThings(gTemp);
	}
	
	private void paintVariable(JProgressBar hp, JProgressBar sp, JProgressBar san) {
		hp.setValue(player.hp/Player.MAXHP);
		sp.setValue(player.sp/Player.MAXSP);
		san.setValue(player.san/Player.MAXSAN);
	}
	
	private void paintMap(Graphics g, int[][] map) {
		int q;
		for(int[] i : map) {
			q++;
			for(int j : i) {
				switch(i[j]) {
				case 1:
					g.drawImage(Block.img, j*20, q*20, Block.DEFAULT_WIDTH, Block.DEFAULT_HEIGHT, this);
					break;
				case 2:
					g.drawImage(Ground.img, j*20, q*20, Ground.DEFAULT_WIDTH, Ground.DEFAULT_HEIGHT, this);
					break;
				case 3:
					g.drawImage(Tree.img, j*20, q*20, Tree.DEFAULT_WIDTH, Tree.DEFAULT_HEIGHT, this);
					break;
				case 4:
					g.drawImage(Wall.img, j*20, q*20, wall.width, wall.height, this);
					break;
				default:
					throw new RuntimeErrorException(null, "map has a wrong value");
					break;
				}
			}
		}
		q = 0;
		isInitMap = true;
	}
	
	private void createThings(Graphics g) {
		Random rnd = new Random();
		int thingsQuantity = rnd.nextInt(64);
		for(int i=0;i<=thingsQuantity;i++) {
			g.drawRect(rnd.nextInt(frame_width), rnd.nextInt(frame_height), 4, 4);
		}
	}
}
