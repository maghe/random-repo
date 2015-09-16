package nl.airport.assignment.main;

import java.util.List;

import nl.airport.assignment.core.AirportsManager;
import nl.airport.assignment.elements.Airport;

public class MainParser {

	public static void main(String[] args) {

		AirportsManager am = new AirportsManager();
		List<Airport> airportsDataFromCountryName = am.getAirportsDataFromCountryName("Italy");
		
		for (Airport airport: airportsDataFromCountryName){
			System.out.println(airport.toString());
		}
	}

}
