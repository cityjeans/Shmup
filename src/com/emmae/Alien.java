package com.emmae;

import javax.swing.*;

public class Alien extends Sprite {

	private final int INITIAL_X = 400;

	public Alien(int x, int y) {
		super(x, y);

		initAlien();
	}

	private void initAlien() {
		ImageIcon icon = new ImageIcon(getClass().getResource("/resources/alien.png"));
		image = icon.getImage();
		getImageDimensions();
	}

	public void move() {
		if (x < 0) {
			x = INITIAL_X;
		}

		x -= 1;
	}
}
