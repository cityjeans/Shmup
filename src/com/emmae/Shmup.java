package com.emmae;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Shmup extends JFrame {

	public Shmup() {
		initUI();
	}
	
	private void initUI() {
		add(new Board());

		setResizable(false);
		pack();

		setTitle("Collision Detection");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			Shmup ex = new Shmup();
			ex.setVisible(true);
		});
	}
}
