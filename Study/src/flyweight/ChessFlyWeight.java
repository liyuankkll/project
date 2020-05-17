package flyweight;

/**
 * 享元类不可共享的类
 * 
 * @author Administrator
 *
 */

public interface ChessFlyWeight {
	String getColor();

	void display(Location loc);

}
