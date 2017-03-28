package timeGeneration;

public class HotRadiator extends SmartHouse {

	public HotRadiator(int temprecher, int water_level) {
		super(temprecher, water_level);
		// TODO Auto-generated constructor stub
	}
	
	public void heatingRadiator(){
		heatingWater();	
		fillRadiator();}
	
	public void fillRadiator(){
		for (getRadiatorWaterLevel(); radiator_water_level < 40; radiator_water_level++);}
}