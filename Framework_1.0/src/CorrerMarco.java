import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;

import ColorAndBackground.BackgroundGradient;
import ColorAndBackground.ColorFramework;
import ColorAndBackground.ColorsRecomend;
import Frame_Settings.Frame_Configuration;

public class CorrerMarco {

	public static void main(String[] args) {
		
		String layoutUse = new String("Layout=none");
		ImageIcon iconFrame = new ImageIcon();
		
		// Importaciones de libreria base
		
		ColorFramework colorSelector = new ColorFramework();
		ColorsRecomend ColorAdapter = new ColorsRecomend();
		BackgroundGradient backgroundAdapt = new BackgroundGradient();
		Frame_Configuration FrameLeal = new Frame_Configuration(layoutUse,iconFrame);
		FrameLeal.setLayout(null);
		FrameLeal.setVisible(true);
		
				
		PanelPrueba pnp = new PanelPrueba();
		pnp.setBounds(0,0,1000,800);
		pnp.setBackground(ColorAdapter.Color_Brown());
		FrameLeal.add(pnp);
	}
	

}
