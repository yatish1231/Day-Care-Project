package edu.neu.csye6200.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel{
	
		private JTextArea textarea;

		public TextPanel() {
			super();
			textarea = new JTextArea();
			setLayout(new BorderLayout());
			add(new JScrollPane(textarea),BorderLayout.CENTER);
		};
		public void appendText(String s) {
			textarea.append(s);
		}
}
