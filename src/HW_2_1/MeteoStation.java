package HW_2_1;

public class MeteoStation{
	public static void main(String[] args){
		MeteoStore meteoDb = new MeteoStore();
		
		MeteoSensor ms200_1 = new MS200(1);
		meteoDb.save(ms200_1);

		ST500Info ms500_1 = new ST500Info();
		meteoDb.save(new ST500SensorAdapter(ms500_1.getData()));

	}
}