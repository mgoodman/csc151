import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Timer;

public class StopWatch extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int FRAME_WIDTH = 350;
	private static final int FRAME_HEIGHT = 200;
	
	private JLabel time;
	private JButton button;
	
	private Timer timer;
	private int currentTimeMillis = 0;
	
	public StopWatch() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLayout(new BorderLayout());
		
		class ButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (timer.isRunning()) {
					timer.stop();
					button.setText("START");
				} else {
					timer.start();
					button.setText("STOP");
				}
			}
		}
		
		class TimerListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				currentTimeMillis += 100;
				time.setText("TIME: " + getMinutes() + ":" + getSeconds());
			}
		}
		
		timer = new Timer(100, new TimerListener());
		
		time = new JLabel("Press START to begin", JLabel.CENTER);
		time.setFont(new Font("monospaced", Font.PLAIN, 24));
		
		button = new JButton("START");
		button.setFont(new Font("monospaced", Font.PLAIN, 18));
		button.addActionListener(new ButtonListener());
		
		add(time, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
	}
	
	private String getMinutes() {
		int minutes = (int) Math.floor(currentTimeMillis / 60000);
		return String.format("%02d", minutes);
	}
	
	private String getSeconds() {
		double seconds = ((double) (currentTimeMillis % 60000) / 1000.0);
		return String.format("%04.1f", seconds);
	}
	
	public static void main(String[] args) {
		JFrame f = new StopWatch();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
