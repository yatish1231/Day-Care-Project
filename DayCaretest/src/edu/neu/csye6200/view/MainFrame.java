package edu.neu.csye6200.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import edu.neu.csye6200.model.Registration;

public class MainFrame extends JFrame{
		private JTextArea textarea;
		private JButton button;
		private TextPanel textpanel;
		private ToolBar toolbar;
		private FormPanel leftpanel;
		private MainTabPannel tabs;
		public MainFrame() {
			super("DayCare");
			setLayout(new BorderLayout());
			textarea = new JTextArea();
			textpanel = new TextPanel();
			button = new JButton("Click this!");
			toolbar = new ToolBar();
			leftpanel= new FormPanel();
			tabs = new MainTabPannel();
			
			toolbar.setTextListener((s)->textpanel.appendText(s));
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					textpanel.appendText(String.valueOf(Registration.getRegistrationRecord()));
				}
			});
			//add(textarea, BorderLayout.CENTER);
			//add(leftpanel, BorderLayout.WEST);
			//add(toolbar, BorderLayout.NORTH);
			//add(textpanel, BorderLayout.CENTER);
			add(tabs, BorderLayout.CENTER);
			add(button, BorderLayout.PAGE_END);
			setSize(1000,1000);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
}
