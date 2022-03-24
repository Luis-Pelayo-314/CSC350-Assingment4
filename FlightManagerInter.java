package objectOrientedSoftwareDesignHW;

import java.util.Date;

public interface FlightManagerInter{
	void createFlight(String type, String airline, String origin, String destination, String flightNumber, Date departureTime, int numOfPassengers);
	Flight getFlightByNumber(String FlightNum);
}

