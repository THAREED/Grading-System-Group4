package View;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DetailPanel extends JPanel {
	private JButton settingBtn , saveBtn , fillScoreBtn;
	private JLabel fullLabel , accumulatedLabel , assignLabael , midLabel,finalLabel;
	private JTextField assfTxt , midfTxt , finalfTxt, assaTxt , midaTxt , finalaTxt;
	private JPanel panel;

	public DetailPanel() {
		panel = new JPanel();
		JPanel panelBtn = new JPanel();
		JPanel panelLabel = new JPanel();
		
		settingBtn = new JButton("Setting");
		saveBtn = new JButton("Save");
		fillScoreBtn = new JButton("FillScore");
		panel.setLayout(new GridLayout(4, 0));
		settingBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getActionCommand().equals("Setting")) 
				{
					setTxtTrue();
					settingBtn.setText("Save");
				}
				if(e.getActionCommand().equals("Save")) 
				{
					setTxtFalse();
					settingBtn.setText("Setting");					
				}		
				
			}
		});
		fillScoreBtn.setActionCommand("fill");
		panel.setBorder(BorderFactory.createTitledBorder("Course Detail"));
		panelBtn.add(settingBtn);
		panelBtn.add(fillScoreBtn);
		
		JLabel empty = new JLabel("                              ");
		fullLabel = new JLabel("                                                    Full Score");
		accumulatedLabel = new JLabel("Accumulated Score");
		panelLabel.add(fullLabel);
		panelLabel.add(empty);
		panelLabel.add(accumulatedLabel);
		panel.add(panelLabel);
		setAssign();
		setMidterm();
		setfinalterm();
		setTxtFalse();
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(450, 450));
		this.add(panel,BorderLayout.CENTER);
		this.add(panelBtn, BorderLayout.SOUTH);
		this.setVisible(true);		
	}
	public void setAssign() {
		JPanel assPanel = new JPanel();
		JLabel assLabel = new JLabel("                        ");
		assignLabael = new JLabel("Assignment                 ");
		assfTxt = new JTextField();
		assfTxt.setPreferredSize(new Dimension(100, 20));
		assfTxt.setText("100");
		assaTxt = new JTextField();
		assaTxt.setPreferredSize(new Dimension(100, 20));
		assaTxt.setText("30");
		assPanel.add(assignLabael);
		assPanel.add(assfTxt);
		assPanel.add(assLabel);
		assPanel.add(assaTxt);
		panel.add(assPanel);
	}
	public void setMidterm() {
		JPanel midPanel = new JPanel();
		JLabel midtermLabel = new JLabel("                         ");
		midLabel = new JLabel("Midterm                        ");
		midfTxt = new JTextField();
		midfTxt.setPreferredSize(new Dimension(100, 20));
		midfTxt.setText("100");
		midaTxt = new JTextField();
		midaTxt.setPreferredSize(new Dimension(100, 20));
		midaTxt.setText("50");
		
		midPanel.add(midLabel);
		midPanel.add(midfTxt);
		midPanel.add(midtermLabel);
		midPanel.add(midaTxt);
		panel.add(midPanel);
		
	}
	public void setfinalterm() {
		JPanel finalPanel = new JPanel();
		JLabel fiLabel = new JLabel("                         ");
		finalLabel = new JLabel("Final                               ");
		finalfTxt = new JTextField();
		finalfTxt.setPreferredSize(new Dimension(100, 20));
		finalfTxt.setText("100");
		finalaTxt = new JTextField();
		finalaTxt.setPreferredSize(new Dimension(100, 20));
		finalaTxt.setText("20");
		
		finalPanel.add(finalLabel);
		finalPanel.add(finalfTxt);
		finalPanel.add(fiLabel);
		finalPanel.add(finalaTxt);
		panel.add(finalPanel);
		
	}
	public void setTxtFalse() {
		assfTxt.setEditable(false);
		assaTxt.setEditable(false);
		midfTxt.setEditable(false);
		midaTxt.setEditable(false);
		finalfTxt.setEditable(false);
		finalaTxt.setEditable(false);
	}
	public void setTxtTrue() {
		assfTxt.setEditable(true);
		assaTxt.setEditable(true);
		midfTxt.setEditable(true);
		midaTxt.setEditable(true);
		finalfTxt.setEditable(true);
		finalaTxt.setEditable(true);
	}
	
	

}
