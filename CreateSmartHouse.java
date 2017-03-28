package timeGeneration;

import timeGeneration.SmartHouse;

public class CreateSmartHouse {
	
	public static void main(String[] args) {
		
		SmartHouse house1 = new HotWater(20);
		SmartHouse house2 = new HotRadiator(10,10);
		System.out.println("Basically we have hot water tempriture: " + house1.getWaterTemprecher());
		System.out.println("Radiator tempriture: " + house2.getRadiatorWaterTemprecher() + " with radiator level: " + house2.getRadiatorWaterLevel());
		
		if (new String("19:30").equals(TimeGeneration.currentTime())){
			house1.heatingWater();} else
				{System.out.println("That's not time for heating water");}
		
		if (new String("19:30").equals(TimeGeneration.currentTime())){
			house2.heatingRadiator();
			} else
				{System.out.println("That's not time for heating radiator");}
		
		System.out.println("Now we have hot water tempriture: " + house1.getWaterTemprecher());
		System.out.println("And radiator tempriture: " + house2.getRadiatorWaterTemprecher() + " with water level: " + house2.getRadiatorWaterLevel());}
}
