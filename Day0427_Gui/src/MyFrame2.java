import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;

public class MyFrame2 extends JFrame {
	private JTextField textField;

	public MyFrame2() {
		// 생성자 안에다가 만들기

		this.setSize(500, 400);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(297, 31, 97, 23);
		panel.add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(12, 32, 273, 21);
		panel.add(textField);
		textField.setColumns(10);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 67, 382, 184);
		panel.add(textArea);

	}
}
