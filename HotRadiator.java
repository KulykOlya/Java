package timeGeneration;

public class HotRadiator extends SmartHouse {

	public HotRadiator(int temprecher, int water_level) {
		super(temprecher, water_level);}
	
	public void heatingRadiator(){
		if (getRadiatorWaterTemprecher() < 60){
			decreaseRadiator();
			heatingWater(60);
			fillRadiator();}}
	
	public void decreaseRadiator(){
		for (getRadiatorWaterLevel(); radiator_water_level > 20; radiator_water_level--);}
	
	public void fillRadiator(){
		for (getRadiatorWaterLevel(); radiator_water_level < 40; radiator_water_level++);}
}
