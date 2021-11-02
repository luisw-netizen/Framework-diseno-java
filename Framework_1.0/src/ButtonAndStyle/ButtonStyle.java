package ButtonAndStyle;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

public class ButtonStyle{
	

	public void button_border_radius(int numberRadius, JButton btn_border_radius) {
		
		btn_border_radius.setBorder(new BorderRounder(numberRadius));
		int ancho = numberRadius;
		int largo = numberRadius;
	}

	public void Button_Background_Cont(String background, JButton buttonSelection) {
		
		if(background == "background-disable") {
			
			buttonSelection.setContentAreaFilled(false);
		}
		else {
			
			buttonSelection.setContentAreaFilled(true);
		}
		
	}
	
	public void Button_Border_Cont(String BorderJbutton,JButton buttonSelector) {
		
		if(BorderJbutton == "border-disable"){
			
			buttonSelector.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
	}
	
	public void Button_focus_all_cont(String focusBtn, JButton btnSelector) {
		
		if(focusBtn == "focusAll-disable"){
			
			btnSelector.setFocusable(false);
			btnSelector.setFocusPainted(false);
		}
	}
	
	public void Button_boxshadow(JButton btnShadow){
		
		
		
	}
	
}
