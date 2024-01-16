
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	JLabel jl = new JLabel("Buona Lezione");
			
	public MyFrame() {
		super("Prima finestra");
		
		Container c = this.getContentPane();
		c.add(jl);
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
