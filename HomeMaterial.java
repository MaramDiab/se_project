package fall2020Project;

import java.util.List;

public class HomeMaterial {

	private static List<String> allMaterials = List.of("WOOD", "BRICK","STONE");
	private String material;
	
	public HomeMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return this.material;
	}
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public static boolean isHomeMaterial(String spec) {
		return allMaterials.contains(spec);
	}
}
