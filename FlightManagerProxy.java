package objectOrientedSoftwareDesignHW;

import java.util.Date;
import java.util.logging.Logger;

public class FlightManagerProxy implements FlightManagerInter{
	Logger LOG = Logger.getLogger(FlightManagerProxy.class.getName());
	
	@Override
	public void createFlight(String type, String airline, String origin, String destination, String flightNumber, Date departureTime, int numOfPassengers) {
		FlightManager fm = new FlightManager();
		LOG.info("A flight is being created");
		fm.createFlight(type, airline, origin, destination, flightNumber, departureTime, numOfPassengers);
		
	}

	@Override
	public Flight getFlightByNumber(String FlightNum) {
		FlightManager fm = new FlightManager();
		LOG.info("Flight number: " + FlightNum + " is being retrieved.");
		return fm.getFlightByNumber(FlightNum);
	}
	
}
