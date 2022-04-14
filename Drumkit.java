package com.HeadFirstclass;

public class Drumkit {

	boolean snare=true;
	boolean topHat=true;
	void playTopHat() 
	{
		System.out.println("bang bang ba-bang");
	}
	void playSnare()
	{
		System.out.println("ding ding da-ding");
	}
}
class DrumKitTestDrive
{
public static void main(String[] args) {
	Drumkit d= new Drumkit();
	d.playSnare();
	d.snare=false;
	d.playTopHat();
	if(d.snare==true)
	{
		d.playSnare();
	}
}	
}