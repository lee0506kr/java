package test;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chatting3.copy.Protocol;

public class ChatClient extends JFrame {
	private JTextField textField;
	private JTextField textip;
	private JLabel labelip;
	private JButton connect;
	private JButton sendbutton;
	private JTextArea textArea;

	private Socket socket;
	private ObjectOutputStream out;
	private BufferedWriter writer;
	private JLabel lblNewLabel;
	private JTextField textNick;
	private JButton btnEntry;

	public ChatClient() {
		this.setTitle("채팅");
		this.setSize(550, 368);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 20, 174, 234);
		panel.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		sendbutton = new JButton("보내기");
		sendbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sendMessage();
			}
		});
		sendbutton.setBounds(303, 280, 97, 39);
		panel.add(sendbutton);

		textField = new JTextField();
		textField.setBounds(35, 281, 256, 38);
		panel.add(textField);
		textField.setColumns(10);

		
		labelip = new JLabel("IP주소");
		labelip.setBounds(248, 25, 97, 15);
		panel.add(labelip);

		textip = new JTextField();
		textip.setText("192.168.0.70");
		textip.setBounds(248, 50, 149, 21);
		panel.add(textip);
		textip.setColumns(10);

		connect = new JButton("접속");
		connect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// makeConnection();
			}
		});
		connect.setBounds(409, 49, 105, 23);
		panel.add(connect);
		
		lblNewLabel = new JLabel("닉네임");
		lblNewLabel.setBounds(248, 123, 57, 15);
		panel.add(lblNewLabel);
		
		textNick = new JTextField();
		textNick.setBounds(248, 163, 149, 21);
		panel.add(textNick);
		textNick.setColumns(10);
		
		btnEntry = new JButton("입장");
		btnEntry.setBounds(409, 162, 97, 23);
		panel.add(btnEntry);

		btnEntry.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//btnEntry  = textNick.getText();
				
			}
		});
		
		
		connect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				makeConnection();

			}
		});
		this.setVisible(true);
	}
	public void sendMessage() {
		
		try {
			String msg = textField.getText();
			
			System.out.println(msg);
			
			writer.write(msg);
			writer.newLine();
			writer.flush();
			
			textArea.append(msg);
			textField.setText("");
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private void entry() {
		
	}

	private void makeConnection() {
		InetAddress ip = null;

		try {
			ip = InetAddress.getByName(textip.getText());
			System.out.println("1");
			socket = new Socket(ip, 8000);
			System.out.println("2");
			out = new ObjectOutputStream(socket.getOutputStream());
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			Thread receiver = new Thread(new Receiver());
			receiver.start();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	class Receiver implements Runnable {
		public void run() {

			ObjectInputStream in = null;
			String msg = null;

			try {
				in = new ObjectInputStream(socket.getInputStream());

				while (true) {
					Protocol p = (Protocol) in.readObject();
					textArea.append(msg + "\n");

				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		ChatClient client = new ChatClient();

	}
}
