package objectOrientedSoftwareDesignHW;

import java.util.Date;
import java.util.List;

public class FlightManager implements FlightManagerInter{
	private List<Flight> flights;
	
	
	public FlightManager() {
		
	}
	
	@Override
	public void createFlight(String type, String airline, String origin, String destination, String flightNumber, Date departureTime, int numOfPassengers) {
		flights.add(FlightFactory.createFlight(type, airline, origin, destination, flightNumber, departureTime, numOfPassengers));
	}
	
	@Override
	public Flight getFlightByNumber(String flightNum){
		for(Flight f : flights) {
			if(flightNum.equals(f.getFlightNumber())) {
				return f;
			}
		}
		try {
			throw new BadFlightNumException("Flight Number Not Found");
		}
		catch(BadFlightNumException e) {
			e.printStackTrace();
			Flight nf = null;
			return nf;
		}
	}
}