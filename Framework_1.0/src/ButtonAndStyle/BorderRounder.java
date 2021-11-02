package ButtonAndStyle;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;

public class BorderRounder implements Border{

	private int radius;
	
	public BorderRounder(int radius){
		
		this.radius = radius;
	}
	
	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {

		g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	}

	@Override
	public Insets getBorderInsets(Component c) {
		
		return new Insets(this.radius+1, this.radius+2, this.radius+2, this.radius);
	}

	@Override
	public boolean isBorderOpaque() {

		return true;
	}

}