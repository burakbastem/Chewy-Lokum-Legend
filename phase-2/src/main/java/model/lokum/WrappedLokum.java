package model.lokum;

import java.awt.Color;
import java.awt.Graphics;

import model.adapter.*;
import model.interfaces.*;
import model.lokum.*;

public class WrappedLokum extends Lokum implements Movable, Destructible {

	public WrappedLokum() {
		// TODO Auto-generated constructor stub
		super(Color.WHITE, 0, 0, 0, 0);
	}

	public WrappedLokum(Color color, int x, int y, int width, int height) {
		// TODO Auto-generated constructor stub
		super(color, x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		AdapterManager.getInstance().getCurrentDrawingAdapter().draw(g, this);
	}
	
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		setX(getX()+x);
		setY(getY()+y);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		AdapterManager.getInstance().getCurrentLokumDestroyerAdapter().destroy(this);
	}

}
