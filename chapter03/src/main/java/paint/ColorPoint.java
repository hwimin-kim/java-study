package paint;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		super();
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void show() {
		System.out.println(
				"좌표(x:" + super.getX() + 
				", y:" + super.getY() + 
				", color:" + this.color + 
				")를 표시했습니다.");
	}
}
