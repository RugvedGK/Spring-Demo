package SpringDemo;

public class Car {
private String company;
private String color;
private int topSpeed;

private MusicSystem musicSystem;


public MusicSystem getMusicSystem() {
	return musicSystem;
}




public void setMusicSystem(MusicSystem musicSystem) {
	this.musicSystem = musicSystem;
}




public void setCompany(String company) {
	this.company = company;
}




public void setColor(String color) {
	this.color = color;
}




public void setTopSpeed(int topSpeed) {
	this.topSpeed = topSpeed;
}




@Override
public String toString() {
	return "Car [company=" + company + ", color=" + color + ", topSpeed=" + topSpeed + ", musicSystem=" + musicSystem
			+ "]";
}



}
