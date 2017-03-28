package timeGeneration;

import timeGeneration.SmartHouse;

public class CreateSmartHouse {
	
	public static void main(String[] args) {
		
		SmartHouse house2 = new HotWater(10);
		System.out.println(house2.getWaterTemprecher());
		//System.out.println(house2.getRadiatorWaterLevel());
		
		/*if (new String("16:49").equals(TimeGeneration.currentTime())){
			house2.heatingRadiator();
			//System.out.println(my_house.heatingWater());
			} else
				{System.out.println("That's not time for heating radiator");}*/
		
		if (new String("16:52").equals(TimeGeneration.currentTime())){
			house2.heatingWater();} else
				{System.out.println("That's not time for heating water");}
		
		System.out.println(house2.getWaterTemprecher());
		//System.out.println(house2.getRadiatorWaterLevel());
}}