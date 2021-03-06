package student;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class StudentMainFrame extends JFrame implements Serializable {
	private JTextField tfName;
	private JTextField tfTotal;
	private JTextField tfAverage;
	private JButton btnDetail;
	private JButton btnSelect;
	private JList<Student> studentJList; // 목록을 화면에 보여주는 컴포넌트

	// 학생리스트 보여주고 선택하여 기본정보를 보여주는 화면

	// 데이터: 학생리스트 >>실제학생 정보를 가지고 있는 리스트 객체

	private Vector<Student> sList;
	private JButton btnAdd;
	private JButton btnRemove;
	private JTextField textName;
	private JTextField textKor;
	private JTextField textEng;
	private JTextField textMath;

	private static final String FILE_NAME = "text.data";

	public StudentMainFrame() {
		sList = new Vector<Student>();
		this.setTitle("학생관리");
		this.setSize(573, 365);

		// 기본데이터 생성 및 sList에 데이터 넣기
		// setDefaultData();

		loadData();

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		// 학생 목록을 화면에 보여줄 컴포넌트
		studentJList = new JList<Student>(sList);
		studentJList.setBounds(33, 29, 187, 118);
		
		panel.add(studentJList);

		btnDetail = new JButton("상세보기");
		btnDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 new NewFrame(studentJList);

			}
		});
		btnDetail.setBounds(282, 201, 97, 23);
		panel.add(btnDetail);

		btnSelect = new JButton( "점수보기");
		btnSelect.setBounds(401, 201, 97, 23);
		panel.add(btnSelect);

		btnSelect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 지금 선택된 목록의 학생 객체 가져오기
				Student student = studentJList.getSelectedValue();

				tfName.setText(student.getName());

				// 숫자 +" " >>문자열

				tfTotal.setText(student.getTotal() + " "); // 숫자를 문자열로
				tfAverage.setText(student.getAverage() + " ");
			}
		});

		tfName = new JTextField();
		tfName.setBounds(391, 73, 116, 21);
		panel.add(tfName);
		tfName.setColumns(10);

		tfTotal = new JTextField();
		tfTotal.setBounds(391, 123, 116, 21);
		panel.add(tfTotal);
		tfTotal.setColumns(10);

		tfAverage = new JTextField();
		tfAverage.setBounds(391, 173, 116, 21);
		panel.add(tfAverage);
		tfAverage.setColumns(10);

		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(322, 76, 57, 15);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("총점");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(322, 126, 57, 15);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("평균");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(322, 176, 57, 15);
		panel.add(lblNewLabel_2);

		textName = new JTextField();
		textName.setText("이름");
		textName.setBounds(12, 253, 68, 21);
		panel.add(textName);
		textName.setColumns(10);

		textKor = new JTextField();
		textKor.setText("국점");
		textKor.setBounds(92, 253, 50, 21);
		panel.add(textKor);
		textKor.setColumns(10);

		textEng = new JTextField();
		textEng.setText("영점");
		textEng.setBounds(157, 253, 50, 21);
		panel.add(textEng);
		textEng.setColumns(10);

		textMath = new JTextField();
		textMath.setText("수점");
		textMath.setBounds(221, 253, 44, 21);
		panel.add(textMath);
		textMath.setColumns(10);

		btnAdd = new JButton("추가");
		btnAdd.setBounds(282, 252, 97, 23);
		panel.add(btnAdd);

		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Student student = new Student();

				student.setName(textName.getText());
				student.setKor(Integer.parseInt(textKor.getText()));
				student.setEng(Integer.parseInt(textEng.getText()));
				student.setMath(Integer.parseInt(textMath.getText()));

				sList.add(student);

				studentJList.setListData(sList);

				// int kor = text
				// textName.getText(student.setName);

				// textKor.setText(student.getKor()+ " ");
				// textEng.setText(student.getEng()+ " ");
				// textMath.setText(student.getMath()+ " ");
				//
				// sList.add(student);
			}
		});

		btnRemove = new JButton("삭제");
		btnRemove.setBounds(401, 252, 97, 23);
		panel.add(btnRemove);

		JButton btnNewButton = new JButton("종료");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				saveData();
				System.exit(0);

			}
		});

		btnNewButton.setBounds(429, 293, 97, 23);
		panel.add(btnNewButton);

		btnRemove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (sList.size() == 0) {
					System.out.println("존재하지 않습니다.");
					return;
				}

				// sList.remove(studentJList.getSelectedValue());
				// System.out.println(sList.size());

				sList.remove(studentJList.getSelectedIndex());

				studentJList.setListData(sList);

			}
		});

		this.setVisible(true);
	}

	public void saveData() {
		// 데이터를 파일에 저장하는 기능
		// 파일출력(객체를 파일에 작성)
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("text.data")));

			// 파일에 작성해야 하는 데이터>>>> sList
			oos.writeObject(sList);
			oos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void loadData() {
		// 파일로부터 데이터를 가져오는 기능
		// 파일입력
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("text.data")));
			// 파일에서 sList 객체 가져와서 내가 관리할 sList에
			// 참조 시켜주면 된다.
			sList = (Vector<Student>) ois.readObject();

		} catch (EOFException e) {
			sList = new Vector<Student>();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			sList = new Vector<Student>();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		StudentMainFrame mainFrame = new StudentMainFrame();
	}

	// 임의의 데이터를 만들어주는 메서드 작성
	/*
	 * public void setDefaultData() { sList = new Vector<Student>();
	 * 
	 * sList.add(new Student("홍길동", 3, 100, 100, 100)); sList.add(new Student("이순신",
	 * 2, 0, 0, 100)); sList.add(new Student("신사임당", 1, 100, 100, 80));
	 * sList.add(new Student("김장금", 3, 50, 50, 70)); }
	 */
}
