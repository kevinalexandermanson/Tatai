package Tatai.Levels;

import java.util.Random;


public class PractiseEasy implements LevelInterface {
	
	private String label;
	private String number;
	
	public PractiseEasy() {
	}
	
	public String getLabel() {
		return label;
	}
	
	public String getEquation() {
		return number;
	}
	

	public void calculate() {
		label = "Now Playing - [Practise Mode - Easy]";
		number = Integer.toString(randomNumber());
	}
	
	private int randomNumber() {

		int randomNumber = 0;
		Random rand = new Random();
		
		randomNumber = rand.nextInt(9) + 1; //Range is now 1-9, as specified, rather than 0-9
		
		return randomNumber;
	}
}