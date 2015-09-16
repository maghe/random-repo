package nl.airport.assignment.core;

import java.util.List;
import java.util.Map;

import nl.airport.assignment.elements.Airport;

public class AirportsManager {
	private Parser parser;

	public AirportsManager() {

		parser = new Parser();
		parser.parse();

	}

	public List<Airport> getAirportsDataFromCountryCode(String countryCode) {

		String countryCodeLowerCase = countryCode.toLowerCase();

		Map<String, List<Airport>> airportsMap = parser.getAirportsMap();
		if (airportsMap.containsKey(countryCodeLowerCase)) {
			return airportsMap.get(countryCodeLowerCase);
		}
		return null;

	}

	public List<Airport> getAirportsDataFromCountryName(String countryName) {

		String countryNameLowerCase = countryName.toLowerCase();

		if (parser.getCountriesMap().containsKey(countryNameLowerCase)) {

			return getAirportsDataFromCountryCode(parser.getCountriesMap().get(countryNameLowerCase));
		}
		return null;
	}
}
