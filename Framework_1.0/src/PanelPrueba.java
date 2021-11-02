import javax.swing.JButton;
import javax.swing.JPanel;

import ButtonAndStyle.ButtonStyle;
import ButtonAndStyle.ButtonStyle_Extend;
import ColorAndBackground.ColorsRecomend;


public class PanelPrueba extends JPanel {

	/**
	 * Create the panel.
	 */
	
	public PanelPrueba() {
	
		ButtonStyle btnStyleV1 = new ButtonStyle();
		ColorsRecomend ColorAdapter = new ColorsRecomend();
		
		setLayout(null);
		
		JButton btnNewButton = new JButton("Btn");
		btnNewButton.setBounds(45, 54, 20, 20);
				
		btnStyleV1.Button_focus_all_cont("focusAll-disable", btnNewButton);
		btnStyleV1.button_border_radius(20,btnNewButton);
		
		btnNewButton.setBackground(ColorAdapter.Color_DarkGoldenRod());
		btnNewButton.setForeground(ColorAdapter.Color_White());
		
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setBounds(75, 195, 89, 23);
		ButtonStyle_Extend btn = new ButtonStyle_Extend(btnNewButton_1);
		add(btnNewButton_1);
		
		
		
	}
	

}
