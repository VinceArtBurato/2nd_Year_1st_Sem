//Name: Burato, Vince Art | Section Code: T209 | Date: 11/17/2022
package practicalswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends JFrame{

	DefaultTableModel tableModel;
	JTabbedPane tabbedpane;
	
	// Frame 1
	public MainFrame() {
		
		this.setName("mainFrame");
		this.setTitle("Student Information System");
		this.setMinimumSize(new Dimension(900, 600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		// TabbedPane
		tabbedpane=new JTabbedPane();
		tabbedpane.setName("Java Tab Pane");
		
		student();
		subject();
		tableData();
		this.setVisible(true);
		
	}
	
	// The data will be printed and to display the scroll pane
	private void tableData() {
		
		for (int i = 1; i <= 50; i++) {
			Student s = new Student( "2101105721", "Vince Art Burato", "Barangay 1", "20");
			addStudent(s);
		}
		
	}

	private void student() {
		
		String data[][] = { };    
	    String column[] = {"STUDENT ID","NAME","ADDRESS", "AGE"};
	    
		// Panel 1
		JPanel studentPanel = new JPanel();
		studentPanel.setName("Student panel");
		studentPanel.setBackground(Color.red);
		studentPanel.setSize(this.getWidth(), this.getHeight());
		studentPanel.setLayout(new BorderLayout());
		
		
		// Panel 2
		JPanel studentOptionPanel = new JPanel();
		studentOptionPanel.setName("Student Option Panel");
		studentOptionPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		studentOptionPanel.setBackground(Color.blue);
		
		// Button 1
		JButton buttonAddStudent = new JButton("Add Student");
		buttonAddStudent.setName("Add Student Button");
		studentOptionPanel.add(buttonAddStudent,ComponentOrientation.RIGHT_TO_LEFT);
		
		// Panel 3
		JPanel studentContentPanel = new JPanel();
		studentContentPanel.setName("Student Content Panel");
		studentContentPanel.setLayout(new BorderLayout());
		studentContentPanel.setBackground(Color.cyan);
		
		
		tableModel = new DefaultTableModel(column, 0);
		
		JTable studentTable = new JTable(tableModel);
		studentTable.setName("Table for Student");
		
		studentTable.getTableHeader().setReorderingAllowed(false);
		studentTable.getTableHeader().setResizingAllowed(false);
		
		// Scrollpane
		JScrollPane sp = new JScrollPane(studentTable);
		sp.setName("Scroll Pane for Table");
		studentContentPanel.add(sp, BorderLayout.CENTER);
		
		
		studentPanel.add(studentOptionPanel, BorderLayout.NORTH);
		studentPanel.add(studentContentPanel, BorderLayout.CENTER);
		
		
		tabbedpane.add("Student", studentPanel);
		
		buttonAddStudent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// call the showAddStudent method.
				showAddStudent();
				
			}
		});
		
		this.add(tabbedpane);
		
	}
	
	private void subject(){
		
		JPanel studentContentPanel = new JPanel();
		tabbedpane.addTab("Subject", studentContentPanel);
		this.add(tabbedpane);
	}

	private void showAddStudent() {
		
		new AddStudent(this);
		
	}
	
	public boolean idHasLetter(String id) {
		
		boolean check = false;
		for (int i = 0; i < id.length(); i++) {
			if (Character.isLetter(id.charAt(i))|| !Character.isLetter(id.charAt(i)) && !Character.isDigit(id.charAt(i))) {
				check = true;
				break;
			}
		}
		return check;
	}
	
	public void addStudent (Student s) {
		
		if (idHasLetter(s.getId())) {
			JOptionPane.showMessageDialog(null, "Invalid ID! \nID should not have letter or special character", "Error", JOptionPane.ERROR_MESSAGE);
			return;
			
		} else if(s.getId().trim().length()<=0||
			s.getName().trim().length()<=0||
			s.getAddress().trim().length()<=0||
			s.getAge().trim().length()<=0) {
			
			JOptionPane.showMessageDialog(null, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		tableModel.addRow(new Object[] {s.getId(), s.getName(), s.getAddress(), s.getAge()});
	}
}
