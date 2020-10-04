package fall2020Project;

import java.util.List;

public class HomeType {
	private static List<String> allTypes = List.of("HOUSE", "APARTMENT");
	private String type;
	
	
	public HomeType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return this.type;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public static boolean isHomeType(String spec) {
		return allTypes.contains(spec);
	}
}
