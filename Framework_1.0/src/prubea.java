import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Frame_Settings.Frame_Configuration;

public class prubea{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ImageIcon iconoApp = new ImageIcon("ss");
					
					Frame_Configuration frame = new Frame_Configuration("null",iconoApp);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public prubea() {
	}

}
