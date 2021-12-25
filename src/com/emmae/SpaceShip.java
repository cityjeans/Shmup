package com.emmae;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.ArrayList;

public class SpaceShip extends Sprite {

	private int dx, dy;
	private List<Missile> missiles;

	public SpaceShip(int x, int y) {
		super(x, y);

		initSpaceShip();
	}

	private void initSpaceShip() {
		missiles = new ArrayList<>();

		ImageIcon icon  = new ImageIcon(getClass().getResource("/resources/craft.png"));
		image = icon.getImage();
		getImageDimensions();
	}

	public void move() {
		x += dx;
		y += dy;

		if (x < 1) {
			x = 1;
		}

		if (y < 1) {
			y = 1;
		}
	}

	public List<Missile> getMissiles() {
		return missiles;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_SPACE) {
			fire();
		}

		if (key == KeyEvent.VK_LEFT) {
			dx = -2;
		}
		if (key == KeyEvent.VK_RIGHT) {
			dx = 2;
		}
		if (key == KeyEvent.VK_UP) {
			dy = -2;
		}
		if (key == KeyEvent.VK_DOWN) {
			dy = 2;
		}
	}

	public void fire() {
		missiles.add(new Missile(x + width, y + height / 2));
	}

	public void keyReleased(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = 0;
		}
		if (key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
		if (key == KeyEvent.VK_UP) {
			dy = 0;
		}
		if (key == KeyEvent.VK_DOWN) {
			dy = 0;
		}
	}
}
