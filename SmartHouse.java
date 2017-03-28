package timeGeneration;

public class SmartHouse {
	
	int water_temprecher;
	int radiator_water_level;
	
	public SmartHouse(int water_temprecher){
		this.water_temprecher = water_temprecher;}
	
	public SmartHouse(int water_temprecher, int radiator_water_level){
		this.water_temprecher = water_temprecher;
		this.radiator_water_level = radiator_water_level;}
	
	public int getWaterTemprecher(){
       	return water_temprecher;}

	public int getRadiatorWaterLevel(){
		return radiator_water_level;}
	
	public void heatingWater(){
		for (getWaterTemprecher(); water_temprecher < 40; water_temprecher++);
	}
	
	public void heatingRadiator(){
	}
	
}