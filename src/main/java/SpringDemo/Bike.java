package SpringDemo;

public class Bike {
private String brand;
private String color;
private int topSpeed;

private MusicSystem musicSystem;

public Bike(String brand, String color, int topSpeed, MusicSystem musicSystem) {
	super();
	this.brand = brand;
	this.color = color;
	this.topSpeed = topSpeed;
	this.musicSystem = musicSystem;
}

@Override
public String toString() {
	return "Bike [brand=" + brand + ", color=" + color + ", topSpeed=" + topSpeed + ", musicSystem=" + musicSystem
			+ "]";
}


}
