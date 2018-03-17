package UIClass;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;

import UISplash.LoadingWindow;

public class HelloWorldUI {

	private JFrame frame;

	public static void main(String[] args) {
		new HelloWorldUI();
	}


	public HelloWorldUI() {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					setupLnF();
					showSplashScreen();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			private void setupLnF() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				}catch(Exception e) {
				}
			}
			
			private void showSplashScreen() {
				new LoadingWindow();
			}
		});
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
