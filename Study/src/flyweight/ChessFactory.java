package flyweight;


import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.activation.FileTypeMap;

//享元工厂类:通过此类的XXX方法获取白棋,黑棋的引用
public class ChessFactory {
	FileType f = new FileTypeMap() {
		
		@Override
		public String getContentType(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getContentType(File arg0) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	private static Map<String, ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();
	
	//传入颜色,返回该颜色对应的棋对象
	public static ChessFlyWeight getChessByColor(String color) {
		
		if(map.get(color) != null) {
			return map.get(color);
		}else {
			ContrateChess chessFlyWeight = new ContrateChess();
			chessFlyWeight.setColor(color);
			map.put(color, chessFlyWeight);
			return chessFlyWeight;
		}
		
	}
}
