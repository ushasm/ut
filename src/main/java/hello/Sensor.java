package hello;

import org.springframework.data.annotation.Id;

public class Sensor {

	@Id private String id;

	private String deviceId;

	private int temperature;

  private String latitude;

	private String longitude;

	private String time;

	public void setdeviceId(String deviceId){
		this.deviceId = deviceId;
	}

	public String getdeviceId(){
		return this.deviceId;
	}

	public void setlatitude(String latitude){
		this.latitude = latitude;
	}

	public String getlatitude(){
		return this.latitude;
	}

	public void setlongitude(String longitude){
		this.longitude = longitude;
	}

	public String getlongitude(){
		return this.longitude;
	}

	public void settime(String time){
		this.time = time;
	}

	public String gettime(){
		return this.time;
	}

	public void settemperature(int temperature){
		this.temperature = temperature;
	}

	public int gettemperature(){
		return this.temperature;
	}

}
