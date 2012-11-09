import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class PizzaPricerFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int FRAME_WIDTH = 200;
	private static final int FRAME_HEIGHT = 150;
	
	private JPanel sizePanel;
	private JPanel extraPanel;
	private JPanel totalPanel;
	
	private JRadioButton sizeSmall;
	private JRadioButton sizeMedium;
	private JRadioButton sizeLarge;
	private JCheckBox extraPepperoni;
	private JCheckBox extraMushrooms;
	
	private ButtonGroup sizes;
	
	private JTextField totalField;
	private JLabel totalLabel;
	
	private double sizePrice = 0.00;
	private double extraPrice = 0.00;
	String price;
	
	public PizzaPricerFrame() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLayout(new BorderLayout());
		
		createSizePanel();
		createExtraPanel();
		createTotalPanel();
	}
	
	private void updatePrice() {
		price = "$" + (sizePrice + extraPrice);
		totalField.setText(price);
	}
	
	private void createTotalPanel() {
		totalPanel = new JPanel(new FlowLayout());
		
		totalLabel = new JLabel("Your Total:");
		
		totalField = new JTextField();
		totalField.setPreferredSize(new Dimension(70, 25));
		totalField.setEditable(false);
		
		totalPanel.add(totalLabel);
		totalPanel.add(totalField);
		
		add(totalPanel, BorderLayout.SOUTH);
	}
	
	private void createSizePanel() {
		class SizeListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				String size = e.getActionCommand();
				
				if (size.equals("Small")) {
					sizePrice = 5.25;
				} else if (size.equals("Medium")) {
					sizePrice = 7.55;
				} else if (size.equals("Large")) {
					sizePrice = 9.35;
				}
				
				updatePrice();
			}	
		}
		ActionListener sizeListener = new SizeListener();
		sizePanel = new JPanel(new GridLayout(3, 1));
		sizePanel.setBorder(new TitledBorder(new EtchedBorder(), "Size"));
		
		sizeSmall = new JRadioButton("Small");
		sizeMedium = new JRadioButton("Medium");
		sizeLarge = new JRadioButton("Large");
		
		sizes = new ButtonGroup();
		
		sizes.add(sizeSmall);
		sizes.add(sizeMedium);
		sizes.add(sizeLarge);
		
		sizePanel.add(sizeSmall);
		sizePanel.add(sizeMedium);
		sizePanel.add(sizeLarge);
		
		sizeSmall.addActionListener(sizeListener);
		sizeMedium.addActionListener(sizeListener);
		sizeLarge.addActionListener(sizeListener);
		
		add(sizePanel, BorderLayout.WEST);
	}
	
	private void createExtraPanel() {
		class ExtraListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				extraPrice = 0.0;
				
				if (extraPepperoni.isSelected()) {
					extraPrice += 1.25;
				}
				if (extraMushrooms.isSelected()) {
					extraPrice += 1.15;
				}
			
				updatePrice();
			}
		}
		ActionListener extraListener = new ExtraListener();
		extraPanel = new JPanel(new GridLayout(2, 1));
		
		extraPepperoni = new JCheckBox("Pepperoni");
		extraMushrooms = new JCheckBox("Mushrooms");
		
		extraPanel.add(extraPepperoni);
		extraPanel.add(extraMushrooms);
		
		extraPepperoni.addActionListener(extraListener);
		extraMushrooms.addActionListener(extraListener);
		
		add(extraPanel, BorderLayout.EAST);
	}
}
