 package Entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.Set;

import Game.Main;
import Listener.SnakeListener;

public class Food extends Point{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Color foodColor;
	
	

	public void setFoodColor(Color foodColor) {
		this.foodColor = foodColor;
	}

	public Color getFoodColor() {
		return foodColor;
	}

	public void newFood(Point p) {
		setLocation(p);
	}
	
	public boolean isFoodEated(Snake snake) {			
		return 	this.equals(snake.getHead());
	}
	
	// i is used to print out different foods
	public void drawMe(Graphics g, int i) {
		Image img;
		if(i==0){
			img = Toolkit.getDefaultToolkit().getImage("img/timg-3.jpeg");
		}else if(i==1){
			img = Toolkit.getDefaultToolkit().getImage("img/timg-3.jpeg");
		}else if(i==2){
			img = Toolkit.getDefaultToolkit().getImage("img/timg-4.jpeg");
		}else if (i==3) {
			img = Toolkit.getDefaultToolkit().getImage("img/timg.jpeg");
		}else{
			img = Toolkit.getDefaultToolkit().getImage("img/timg.png");
		}
		
		g.drawImage(img, x*Main.UnitSize, y*Main.UnitSize, Main.UnitSize, Main.UnitSize, null);
	}
}

