package timeGeneration;

public class SmartHouse {
	
	int water_temprecher;
	int radiator_water_temprecher;
	int radiator_water_level;
	
	public SmartHouse(int water_temprecher){
		this.water_temprecher = water_temprecher;}
	
	public SmartHouse(int radiator_water_temprecher, int radiator_water_level){
		this.radiator_water_temprecher = radiator_water_temprecher;
		this.radiator_water_level = radiator_water_level;}
	
	public int getWaterTemprecher(){
       	return water_temprecher;}
	
	public int getRadiatorWaterTemprecher(){
       	return radiator_water_temprecher;}

	public int getRadiatorWaterLevel(){
		return radiator_water_level;}
	
	public void heatingWater(){
	}
	
	public void heatingWater(int max_temp){
		if (water_temprecher == max_temp){
			radiator_water_temprecher = water_temprecher;} else{
				do{radiator_water_temprecher++;}
				while (radiator_water_temprecher < max_temp);}}
	
	public void heatingRadiator(){
	}
	
}
