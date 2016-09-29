package com.nagarro.javatraining.assignment3.model;

import java.util.Comparator;

public class FlightPriceComparator implements Comparator<Flight>
{
	public int compare(Flight arg0, Flight arg1) {
		return arg0.getFare()-arg1.getFare();
	}
}
