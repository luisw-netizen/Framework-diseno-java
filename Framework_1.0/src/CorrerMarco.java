import java.awt.Color;

import javax.swing.ImageIcon;
import BackgroundColor.*;
import ColorAndBackground.ColorsRecomend;
import Frame_Settings.Frame_Configuration;

public class CorrerMarco {

	public static void main(String[] args) {
		
		String layoutUse = new String("Layout=none");
		ImageIcon iconFrame = new ImageIcon();
		
		// Importaciones de libreria base
		
		ColorsRecomend ColorAdapter = new ColorsRecomend();
		Frame_Configuration FrameLeal = new Frame_Configuration(layoutUse,iconFrame);
		
				
		PanelPrueba pnp = new PanelPrueba();
		
		FrameLeal.add(pnp);
	}

}
