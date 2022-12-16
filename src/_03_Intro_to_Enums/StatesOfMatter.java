package _03_Intro_to_Enums;

public enum StatesOfMatter {
	SOLID(0), LIQUID(25.55), GAS(100);
	double celciusTemp;
	//why does this only work when double celciusTemp is written after the enums
	//why do the enums need a semicolon only when they are given a values?
	StatesOfMatter(double celciusTemp) {
		this.celciusTemp = celciusTemp;
	}
	
	public double convertToFahrenheit(double C) {
		double F;
		F = (C * 9/5) + 32;
		return F;
	}
	
}
