import java.awt.*;
	import javax.swing.*;

	public class MainFrameMan {
		public static void main(String[] args) {
			FrameMan fm = new FrameMan();
		}
	}


public FrameMan(){

	System.out.println("Aloha2!");

	//
	class FrameMan{
		JFrame Frame;
		JPanel Panel;
		JLabel Label;

	Frame = new JFrame();
	//
	Frame.setLocation(200,200);
	Frame.setSize(300, 300);
	Frame.setDeFaultCloseOpretion(JFrame.EXIT_ON_CLOSE);
	Frame.setVisible(true);
    }
 }