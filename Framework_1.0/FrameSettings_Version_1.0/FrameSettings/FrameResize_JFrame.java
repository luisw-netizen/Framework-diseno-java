package FrameSettings;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;

public class FrameResize_JFrame{
	
	public void FrameResize(JFrame a, String useResizeFrame){

		
        Toolkit capture = Toolkit.getDefaultToolkit();    
        Dimension dimensions = capture.getScreenSize();
        
        double width = dimensions.width;
        double height = dimensions.height;
     	
        String screenDl = "Normal";
        String screenDlV = "FullScreen";
        
		switch(useResizeFrame)
		{
		
			case "Default/1.1/Resize/Frame":
						        
		        this.MetaReverseFrame(a,width/1.1,height/1.1,screenDl);
				
			break;
			
			case "Default/1.2/Resize/Frame":
						        
		        this.MetaReverseFrame(a,width/1.2,height/1.2,screenDl);
				
			break;
		
			case "Default/1.3/Resize/Frame":
		        
		        this.MetaReverseFrame(a,width/1.3,height/1.3,screenDl);
				
			break;
			
			case "Default/1.4/Resize/Frame":
						        
		        this.MetaReverseFrame(a,width/1.4,height/1.4,screenDl);
				
			break;

			
			case "Default/1.5/Resize/Frame":
		        
		        this.MetaReverseFrame(a,width/1.5,height/1.5,screenDl);
				
			break;
			
			case "Default/1.6/Resize/Frame":
						        
		        this.MetaReverseFrame(a,width/1.6,height/1.6,screenDl);
				
			break;
		
			case "Default/1.7/Resize/Frame":
		        
		        this.MetaReverseFrame(a,width/1.7,height/1.7,screenDl);
				
			break;
			
			case "Default/1.8/Resize/Frame":
						        
		        this.MetaReverseFrame(a,width/1.8,height/1.8,screenDl);
				
			break;
			
			case "Default/1.9/Resize/Frame":
		        
		        this.MetaReverseFrame(a,width/1.9,height/1.9,screenDl);
				
			break;
			
			case "Default/2.0/Resize/Frame":
						        
		        this.MetaReverseFrame(a,width/2.0,height/2.0,screenDl);
				
			break;
		
			case "Default/2.3/Resize/Frame":
		        
		        this.MetaReverseFrame(a,width/2.3,height/2.3,screenDl);
				
			break;
			
			case "Default/2.5/Resize/Frame":
						        
		        this.MetaReverseFrame(a,width/2.5,height/2.5,screenDl);
				
			break;

			case "Full/Horizontal":
		        
		        this.MetaReverseFrame(a,width,height/1.1,screenDl);
				
			break;
			
			case "Full/Horizontal^Vertical":
						        
		        this.MetaReverseFrame(a,width,height,screenDlV);
				
			break;
			
			case "Full/Vertical":
		        
		        this.MetaReverseFrame(a,width/1.1,height,screenDl);
				
			break;
			
			case "Medium/Horizontal":
						        
		        this.MetaReverseFrame(a,width/1.5,height/1.1,screenDl);
				
			break;

			case "Medium/Horizontal^Vertical":
		        
		        this.MetaReverseFrame(a,width/1.5,height/1.5,screenDl);
				
			break;
			
			case "Medium/Vertical":
		        
		        this.MetaReverseFrame(a,width/1.1,height/1.5,screenDl);
				
			break;
			
			case "Small/Horizontal":
		        
		        this.MetaReverseFrame(a,width/2.5,height/1.1,screenDl);
				
			break;
			
			case "Small/Horizontal^Vertical":
		        
		        this.MetaReverseFrame(a,width/2.5,height/2.5,screenDl);
				
			break;
			
			case "Small/Vertical":
		        
		        this.MetaReverseFrame(a,width/1.1,height/2.5,screenDl);
				
			break;


		}
			
		
	}
	
	public void MetaReverseFrame(JFrame frm, double Width, double Heigth,String status){
		
		if(status == "FullScreen") {
			
			frm.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		}
		else if(status == "Normal") {
			
			frm.setExtendedState(JFrame.NORMAL); 
		}
				
		int widthX = (int) Width;
		int heightX = (int) Heigth;
		
		
		frm.setSize(widthX,heightX);
		frm.setLocationRelativeTo(null);
		
	}
	
}
