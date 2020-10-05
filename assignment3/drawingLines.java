package assignment3;
import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;



public class drawingLines extends GraphicsProgram{
	
	//variables
	private GLine line;
	
	public void run() {
		addMouseListeners();
	}
	

	
	public void pressMouse(MouseEvent mouse) {
		double x = mouse.getX();
		double y = mouse.getY();
		line = new GLine(x, y, x, y);
		add(line);
	}
	
	public void releaseMouse(MouseEvent mouse) {
		double x = mouse.getX();
		double y = mouse.getY();
		line.setEndPoint(x, y);
	}
	
	
}
