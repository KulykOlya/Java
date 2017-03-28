package timeGeneration;

public class HotWater extends SmartHouse {
	
	public HotWater(int water_temprecher) {
		super(water_temprecher);}

	public void heatingWater(){ 
		for (getWaterTemprecher(); water_temprecher < 50; water_temprecher++);}
}
