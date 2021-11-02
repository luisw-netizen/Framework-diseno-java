package ColorAndBackground;

import java.awt.Color;

public class ColorFramework {

	public Color ColorRGB(int R, int G, int B) {
		
		Color colorRgb = new Color(R,G,B);
		return colorRgb;
	}
	
	public Color ColorHex(String codigohex) {
		
		Color Colorget = Color.decode(codigohex);	
				
		return Colorget;
	}
	
	public Color ColorRGBA(int R, int G, int B, int A) {
		
		Color colorRgba = new Color(R,G,B,A);
		return colorRgba;
	}
	
}
