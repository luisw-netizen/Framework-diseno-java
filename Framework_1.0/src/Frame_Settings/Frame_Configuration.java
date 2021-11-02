package Frame_Settings;

import java.awt.*;
import javax.swing.*;

public class Frame_Configuration extends JFrame{

	public Frame_Configuration(String layoutUse, ImageIcon iconS) {
		
		this.frame_design_fast(); // Metodo que regresa un diseno rapido y elegante del marco base
		this.FrameSetting(); // Este metodo utiliza las configuraciones necesarias para que el marco funcione perfectamente
		this.FrameResize(); // Este metodo captura el tamano de la pantalla y ajusta para que el marco se adapte segun la medida de cada pantalla
		this.frameLayout(layoutUse); // Este metodo captura el layout que necesitas usar de manera rapida y eficiente con solo usar el nombre de el layout
		this.frameObjectsResize(layoutUse); // Este metodo es prioridad para que los objetos puedan hacer resize con especificar el layout que usas y automaticamente hara resize
		this.frameIcon(iconS); // Este metodo pide un icono para el marco
	}
	
	public void FrameSetting() {
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public void FrameResize(){

        Toolkit capture = Toolkit.getDefaultToolkit();    
        Dimension dimensions = capture.getScreenSize();
        
        double Anchos = dimensions.width/1.1;
        double Largo = dimensions.height/1.1;
        
        int CoversionAncho = (int) Anchos;
        int ConversionAlto = (int) Largo;
 
        setSize(CoversionAncho,ConversionAlto);
		setLocationRelativeTo(null);

	}
	
	public void frame_design_fast(){
		
		setUndecorated(true);
	}
	
	public void frameLayout(String nameLayout) {
		
		
	}
	
	public void frameObjectsResize(String layoutUseRuntime) {
		
		
	}
	
	public void frameIcon(ImageIcon icon){
				
		String urlIcon = "";
		Image iconFrame = Toolkit.getDefaultToolkit().getImage(getClass().getResource(urlIcon));
		setIconImage(iconFrame);

	}
	
	
}
