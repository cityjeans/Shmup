package com.emmae;

import javax.swing.*;

public class Missile extends Sprite {

	private final int BOARD_WIDTH = 390, MISSILE_SPEED = 2;

	public Missile(int x, int y) {
		super(x, y);

		initMissile();
	}

	private void initMissile() {
		ImageIcon icon  = new ImageIcon(getClass().getResource("/resources/missile.png"));
		image = icon.getImage();
		getImageDimensions();
	}

	public void move() {
		x += MISSILE_SPEED;

		if (x > BOARD_WIDTH) {
			visible = false;
		}
	}

}
