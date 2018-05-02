package student;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class NewFrame extends JFrame {
	private JList<Student> studentJList;
	
	private JTextField textName;
	private JTextField textKor;
	private JTextField textEng;
	private JTextField textMath;

	
	
	public NewFrame(JList<Student> list) {
		studentJList = list;
		this.setTitle("새창");
		this.setSize(253, 355);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		textName = new JTextField();
		textName.setBounds(30, 40, 116, 21);
		panel.add(textName);
		textName.setColumns(10);

		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setBounds(29, 10, 57, 15);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("국어");
		lblNewLabel_1.setBounds(30, 88, 57, 15);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("영어");
		lblNewLabel_2.setBounds(30, 155, 57, 15);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("수학");
		lblNewLabel_3.setBounds(30, 225, 57, 15);
		panel.add(lblNewLabel_3);

		textKor = new JTextField();
		textKor.setBounds(30, 113, 116, 21);
		panel.add(textKor);
		textKor.setColumns(10);

		textEng = new JTextField();
		textEng.setBounds(30, 194, 116, 21);
		panel.add(textEng);
		textEng.setColumns(10);

		textMath = new JTextField();
		textMath.setBounds(30, 258, 116, 21);
		panel.add(textMath);
		textMath.setColumns(10);
		this.setVisible(true);

		
		
	
		
		JButton btn = new JButton("가져오기");
		btn.setBounds(128, 289, 97, 23);
		panel.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Student student = studentJList.getSelectedValue();

				
				textName.setText(student.getName());
				textKor.setText(student.getKor() + " ");
				textEng.setText(student.getEng() + " ");
				textMath.setText(student.getMath() + " ");
				
			}
		});

	}
}