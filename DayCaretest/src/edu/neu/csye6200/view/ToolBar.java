package edu.neu.csye6200.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel implements ActionListener{
	private JButton hello;
	private JButton goodbye;
	private TextPanel textpanel;
	private TextListener textlistener;
	public ToolBar() {
		super();
		hello = new JButton("Hello");
		goodbye = new JButton("GoodBye");
		setLayout(new FlowLayout(FlowLayout.LEFT ));
		hello.addActionListener(this);
		goodbye.addActionListener(this);
		add(hello);
		add(goodbye);
		
	}
	
public void setTextListener(TextListener textlistener) {
	this.textlistener = textlistener;
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton)e.getSource();
		if(clicked == hello) {
			if(textlistener != null) {
				textlistener.textemitter("Hello\n");
			}
		}
		else {
			if(textlistener != null) {
				textlistener.textemitter("GoodBye\n");
			}
		}
	}
	
}
