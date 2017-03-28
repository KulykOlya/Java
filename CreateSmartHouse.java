package timeGeneration;

import timeGeneration.SmartHouse;

public class CreateSmartHouse {
	
	public static void main(String[] args) {
		
		SmartHouse house2 = new HotRadiator(10,10);
		System.out.println(house2.getWaterTemprecher());
		System.out.println(house2.getRadiatorWaterLevel());
		
		if (new String("16:47").equals(TimeGeneration.currentTime())){
			house2.heatingRadiator();
			} else
				{System.out.println("That's not time for heating radiator");}
		
		if (new String("16:46").equals(TimeGeneration.currentTime())){
			house2.heatingWater();} else
				{System.out.println("That's not time for heating water");}
		
		System.out.println(house2.getWaterTemprecher());
		System.out.println(house2.getRadiatorWaterLevel());
}}
