package com.example.frame;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

// JFrame에 구현되어 있는 메소드가 가상에 70개가 있음
// 그 중에서 1개 setTitle을 가져와서 기능을 추가하고 싶음

// 상속은 받아와서 수정하거나 추가하여 쓰기 위해 하는 것
public class MyFrame extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	public MyFrame() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(87, 114, 57, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(87, 164, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(165, 111, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBounds(87, 227, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(196, 227, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(165, 161, 116, 21);
		getContentPane().add(passwordField);
		
		this.setTitle("제목");
		this.setSize(400, 500);
		this.setVisible(true);
		
	}
}
