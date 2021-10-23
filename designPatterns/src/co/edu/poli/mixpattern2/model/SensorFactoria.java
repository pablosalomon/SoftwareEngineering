package co.edu.poli.mixpattern2.model;

/**
 * 
 */
public class SensorFactoria {

    /**
     * Default constructor
     */
    public SensorFactoria() {
    }


    /**
     * @return
     */
    public Sensor crearSensor (String tipoSensor, double voltI, double voltO) {
    	
    	if (tipoSensor==null)
    		return null;
    	
    	if (tipoSensor.equalsIgnoreCase("Temperature"))
    		return new Temperature(voltI, voltO);
    	else if (tipoSensor.equalsIgnoreCase("Pression"))
    		return new Pression(voltI, voltO);
    	
    	return null;
    	
    }

}