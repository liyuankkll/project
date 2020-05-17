package flyweight;
//具体的棋子类: 颜色
public class ContrateChess implements ChessFlyWeight{
	private String color ;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void display(Location loc) {
		System.out.println("颜色:" + getColor()+"位置:"+loc.getX()+","+loc.getY());
	}

}
