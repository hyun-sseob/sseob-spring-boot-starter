package me.sseob;

public class Seob {
	
	String name;
	int howLong;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHowLong() {
		return howLong;
	}

	public void setHowLong(int howLong) {
		this.howLong = howLong;
	}

	@Override
	public String toString() {
		return "Seob{" +
				"name='" + name + '\'' +
				", howLong=" + howLong +
				'}';
	}
}
