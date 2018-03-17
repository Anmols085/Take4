package UISplash;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.border.EmptyBorder;

public class LoadingWindow extends JWindow {
	
	private int loadStatus;
	private JPanel loadingPanel;
	private JProgressBar loadingProgress;
	private JLabel progress;
	
	public LoadingWindow() {
		loadStatus = 0;
		//createComponents();
		//arrangeComponents();
		//setWindowsProperties();
	}
	
	private void setWindowsProperties() {
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				super.windowOpened(e);
				//start();
			}
		});
	}
	
	private void arrangeComponents() {
		setLayout(new BorderLayout());
		add(loadingPanel);
	}
	
	private void createComponents() {
		loadingPanel = new JPanel();
		loadingPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		loadingPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(4, 4, 4, 4);
		gbc.gridx = 0;
		gbc.gridy = 0;
		loadingPanel.add(new JLabel("<html><body><b>UI Tester</b></body></html>"));
		gbc.gridy++;
		
		loadingProgress = new JProgressBar();
		loadingPanel.add(loadingProgress, gbc);
		gbc.gridy++;
		
		progress = new JLabel("...");
	}
}
