//Name: Burato, Vince Art | Section Code: T209 | Date: 11/17/2022
package practicalswing;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddStudent extends JFrame{

	JTextField textfieldID;
	JTextField textfieldName;
	JTextField textfieldAddress;
	JTextField textfieldAge;
	JLabel labelID;
	JLabel labelName;
	JLabel labelAddress;
	JLabel labelAge;
	MainFrame mframe;
	
	public AddStudent(MainFrame mframe) {
		
		this.mframe = mframe;
		this.setTitle("Add Student");
		this.setMinimumSize(new Dimension(400, 200));
		this.setMaximumSize(new Dimension(400, 200));
		this.setResizable(false);
		
		textfieldID = new JTextField(10);
		textfieldName = new JTextField(20);
		textfieldAddress = new JTextField(20);
		textfieldAge = new JTextField(5);
		
		labelID = new JLabel("ID:");
		labelName = new JLabel("Name:");
		labelAddress = new JLabel("Address:");
		labelAge = new JLabel("Age:");
		
		JPanel panel = new JPanel();
		panel.add(labelID);
		panel.add(textfieldID);
		panel.add(labelName);
		panel.add(textfieldName);
		panel.add(labelAddress);
		panel.add(textfieldAddress);
		panel.add(labelAge);
		panel.add(textfieldAge);
		
		JButton save = new JButton("Save");
		save.setMaximumSize(new Dimension(20,30));
		
		JPanel savePanel = new JPanel();
		savePanel.add(save);
		
		JPanel main = new JPanel(new GridLayout(3,0));
		main.add(panel);
		main.add(savePanel);
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				addStudent();
			}
		});

		this.add(main);
		// To put all label and text field in one line
		this.pack();
		// To put in center the Frame 2
		this.setLocationRelativeTo(mframe);
		this.setVisible(true);

	}

	private void addStudent() {
		
		mframe.addStudent(new Student(textfieldID.getText(), textfieldName.getText(), textfieldAddress.getText(), textfieldAge.getText()));
		resetFom();
		
	}
	
	// Reset after the user inputs the data.
	private void resetFom() {
		
		textfieldID.setText("");
		textfieldName.setText("");
		textfieldAddress.setText("");
		textfieldAge.setText("");
		
	}
	
	
}
