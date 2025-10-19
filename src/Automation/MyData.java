package Automation;

import java.util.Random;

public class MyData

{
	
	Random rand = new Random();
	
	String [] firstNames = {"Shatha" , "zainab" , "ayham" , "abdulrahman","ammar" , "sana"};
	String [] lastNames = {"mohammad","Mahmoud","ali","omar","noor","rami"};
	String domain = "@gmail.com";
	int randomNumberForTheEmail = rand.nextInt(9583);
	int randomFirstNameIndex = rand.nextInt(firstNames.length);
	int randomLastNameIndex = rand.nextInt(lastNames.length);
	
	String TheFirstName = firstNames[randomFirstNameIndex];
	String TheLastNames = lastNames[randomLastNameIndex];
	String TheEmail= TheFirstName+TheLastNames+randomNumberForTheEmail+domain;
	
	String telephoneNumber = "0792682544";
	String theFax = "232445";
	String theAdressOne = "Amman-Jordan";
	
	int TheSelectIndex = rand.nextInt(1,10);


}
