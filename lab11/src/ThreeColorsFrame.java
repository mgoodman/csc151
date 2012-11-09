import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;

public class ThreeColorsFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int FRAME_WIDTH = 250;
	private static final int FRAME_HEIGHT = 250;
	
	private JComboBox comboBox;
	private JPanel panel;
	
	public ThreeColorsFrame() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLayout(new BorderLayout());

		createPanel();
		createComboBox();
	}
	
	private void createPanel() {
		panel = new JPanel();
		panel.setBackground(Color.RED);
		
		add(panel, BorderLayout.CENTER);
	}
	
	private void createComboBox() {
		String[] colors = {"Red", "Green", "Blue"};
		
		comboBox = new JComboBox(colors);
		comboBox.setSelectedIndex(0);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String color = comboBox.getSelectedItem().toString();
				
				if (color.equals("Red")) {
					panel.setBackground(Color.RED);
				} else if (color.equals("Green")) {
					panel.setBackground(Color.GREEN);
				} else if (color.equals("Blue")) {
					panel.setBackground(Color.BLUE);
				}
			}
		});
		
		add(comboBox, BorderLayout.SOUTH);	
	}
	
}