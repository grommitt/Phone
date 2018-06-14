package com.codingdojo.phone;

// Create IPhone and Galaxy classes. 
// Both classes should extend from the Phone abstract class and implement the Ringable interface.
public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	System.out.println("IPhone ringtone makes the sound: ");
        return this.getRingTone();
    }
    @Override
    public String unlock() {
    	System.out.println("Carrier is: ");
        return this.getCarrier();
    }
    @Override
    public void displayInfo() {
    	System.out.println("IPhone Version Number: "+this.getVersionNumber());     
    }
}
