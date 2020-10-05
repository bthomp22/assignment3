package assignment3;
import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.*;
 
public class circlesProgram extends GraphicsProgram{
	//constants
	private static final int totalCircles = 10;
	private static final int maxRadius = 50;
	private static final int minRadius = 5;
	
	//set instance
	private RandomGenerator generator = RandomGenerator.getInstance();
	
	public void run() {
		for (int i = 0; i < totalCircles; i++) {
			double radius = generator.nextDouble(minRadius, maxRadius);
			double x = generator.nextDouble(0 , getWidth() - radius*2);
			double y = generator.nextDouble(0, getHeight() - radius*2);
			GOval circle = new GOval(x, y, radius, radius);
			circle.setFilled(true);
			circle.setColor(generator.nextColor());
			add(circle);
		}
	}

}
