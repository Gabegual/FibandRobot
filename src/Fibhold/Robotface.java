package Fibhold;
import acm.graphics.*;
import acm.program.*;

import java.awt.Color;
import java.awt.color.*;
public class Robotface extends GraphicsProgram {
	private static final String YELLOW = null;
	private static final Color Color = null;
	public void run () {
		int x=getWidth();
		int y=getHeight();
		GRect Head1 = new GRect(x/4,y/6,HEAD_WIDTH,HEAD_HEIGHT);
		Head1.setFilled(true);
		Head1.setFillColor(Color.GRAY);
		add(Head1);
		
		
		GOval Eye1 = new GOval(x/2.4,y/4,EYE_RADIUS,EYE_RADIUS);
		GOval Eye2 = new GOval(x/3.4,y/4,EYE_RADIUS,EYE_RADIUS);
		Eye1.setFilled(true);
		Eye1.setFillColor(Color.YELLOW);
		Eye2.setFilled(true);
		Eye2.setFillColor(Color.YELLOW);
		add(Eye1);	
		add(Eye2);
		
		GRect Mouth1 = new GRect(x/3.8,y/1.8,MOUTH_WIDTH,MOUTH_HEIGHT);
		Mouth1.setFilled(true);
		Mouth1.setFillColor(Color.WHITE);
		add(Mouth1);
	
	}
private static final int HEAD_WIDTH=100*2;
private static final int HEAD_HEIGHT=150*2;
private static final double EYE_RADIUS=10*4;
private static final int MOUTH_WIDTH=183;
private static final int MOUTH_HEIGHT=20*2;


}
