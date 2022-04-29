package com.douzone.paint.point;

import com.douzone.paint.i.Drawable;

public class Point implements Drawable {
	
	private int x;
	private int y;
	
	
	public Point() {
		this(0,0);
	}
	 
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void show() {
		System.out.println("좌표(x:"+x+", y:"+y+")을 표시했습니다.");
	}
	
	public void show(boolean visible) {
		if(visible)
		this.show();
		else
		System.out.println("좌표(x:"+x+", y:"+y+")을 지웠습니다.");
	}

	@Override
	public void draw() {
		show();	
	}
	
	/*
	 * public void disapear() { System.out.println("좌표(x:"+x+", y:"+y+")을 지웠습니다.");
	 * }
	 */
}
