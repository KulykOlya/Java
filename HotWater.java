package timeGeneration;

public class HotWater extends SmartHouse {
	

	public HotWater(int water_temprecher) {
		super(water_temprecher);
		// TODO Auto-generated constructor stub
	}

	public void heatingWater(){ 
		for (getWaterTemprecher(); water_temprecher < 50; water_temprecher++);
		}
}