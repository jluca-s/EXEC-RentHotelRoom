package entities;

public class Room {
	
	private String name;
	private String email;
	
	public Room(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Room() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public void rentRoom(String name, String email) {
		this.setName(name);
		this.setEmail(email);
	}
	
	public String toString() {
		return this.name
				+"\n"
				+this.email;
	}

}
