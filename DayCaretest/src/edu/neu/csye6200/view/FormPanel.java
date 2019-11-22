package edu.neu.csye6200.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicLookAndFeel;

public class FormPanel extends JPanel{
		private JLabel namelabel;
		private JLabel occupationlabel;
		private JTextField namefield;
		private JTextField occupationfeild;
		private JButton ok;
	
		public FormPanel() {
			Dimension dim = getPreferredSize();
			dim.width = 250;
			setPreferredSize(dim);
			
			namelabel = new JLabel("Name");
			occupationlabel = new JLabel("Occupation");
			namefield = new JTextField("Jim",10);
			occupationfeild = new JTextField("Teacher",10);
			ok = new JButton("Ok");
			Border innerborder = BorderFactory.createLineBorder(Color.BLACK);
			Border innerborder1 = BorderFactory.createTitledBorder(innerborder,"Students",TitledBorder.CENTER , TitledBorder.ABOVE_TOP);
			Border outerborder = BorderFactory.createEmptyBorder(3, 3, 3, 3);
			setBorder(BorderFactory.createCompoundBorder(outerborder, innerborder1));
			
			setLayout(new GridBagLayout());
			GridBagConstraints gc = new GridBagConstraints();
			//firstrow first column
			gc.weightx = 1;
			gc.weighty = 0.1;
			gc.gridx = 0;
			gc.gridy = 0;
			gc.fill = GridBagConstraints.NONE;
			gc.anchor = GridBagConstraints.LINE_START;
			add(namelabel, gc);
			gc.gridx = 1;
			gc.gridy = 0;
			gc.anchor = GridBagConstraints.LINE_START;
			add(namefield, gc);
			
			//secondrow first column
			gc.weightx = 1;
			gc.weighty =0.1;
			gc.gridx = 0;
			gc.gridy = 1;
			gc.anchor = GridBagConstraints.LINE_START;
			add(occupationlabel,gc);
			gc.gridx = 1;
			gc.gridy = 1;
			gc.anchor = GridBagConstraints.LINE_START;
			add(occupationfeild,gc);
			//thirdrow
			gc.weightx = 1;
			gc.weighty =1;
			gc.gridx = 1;
			gc.gridy = 2;
			gc.anchor = GridBagConstraints.FIRST_LINE_START;
			add(ok,gc);
			
		}
}
