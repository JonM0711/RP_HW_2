package HW_2_1;

import java.time.LocalDateTime;

public class ST500SensorAdapter implements MeteoSensor {
    SensorTemperature sensor;
    public ST500SensorAdapter(SensorTemperature sensor){
        this.sensor = sensor;
    }
    public int getId(){
        return sensor.identifier()+1;
    }
    public Float getTemperature(){
        return (float) sensor.temperature();
    }
    public Float getHumidity(){
        return null;
    }
    public Float getPressure(){
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.of(sensor.year(), 1, 1, 0, 0, 0).
                plusDays(sensor.day()-1).plusSeconds(sensor.second());
    }
}
