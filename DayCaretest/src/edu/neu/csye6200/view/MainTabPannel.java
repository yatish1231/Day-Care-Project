package edu.neu.csye6200.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class MainTabPannel extends JPanel{
		
	private static JTabbedPane tabs;
	private static JTabbedPane tabs1;
	public MainTabPannel() {
		tabs = new JTabbedPane();
		tabs1 = new JTabbedPane(SwingConstants.LEFT);
		//JComponent panel1 = new JPanel();
		JComponent panel3 = new JPanel();
		JComponent panel4 = new JPanel();		
		panel3.add(new JTextArea("adding student"), BorderLayout.CENTER);
		panel4.add(new JTextArea("This is student data"), BorderLayout.CENTER);
		tabs1.add("Add Student", panel3);
		tabs1.add("Show Student", panel4);
//		panel1.setLayout(new BorderLayout());
//		panel1.add(new JTextArea("Hey"), BorderLayout.CENTER);
//		panel1.add(panel3, BorderLayout.WEST);
//		panel1.setPreferredSize(new Dimension(950,900));
		tabs.addTab("Students", tabs1);
		JComponent panel2 = new JPanel();
		tabs.addTab("Teachers", panel2);
		add(tabs);
	}
}
