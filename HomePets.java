package fall2020Project;

public class HomePets {
private String isAllowed;
	
	public String isAllowed() {
		return isAllowed;
	}
	
	@Override
	public String toString() {
		return this.isAllowed;
	}

	public void setAllowed(String isAllowed) {
		this.isAllowed = isAllowed;
	}

	public HomePets(String isAllowed) {
		this.isAllowed = isAllowed;
	}
	
	
}
