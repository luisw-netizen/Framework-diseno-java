package ButtonAndStyle;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;

public class ButtonStyle_Extend extends JButton{
	

	public ButtonStyle_Extend(JButton sk) {
		
		sk.setBounds(300, 95, 89, 23);
	}

	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
        g.setColor (Color.red);
        g.fillRoundRect (250, 70, 100, 100, 100, 100);

        g2d.setColor(Color.RED);
        g2d.fillOval(100, 200, 100, 100);

	}

}
