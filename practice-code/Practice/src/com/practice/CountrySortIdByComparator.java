package com.practice;

import java.util.Comparator;

public class CountrySortIdByComparator implements Comparator<ComparatorCountry>, Comparable<ComparatorCountry> {

	@Override
	public int compareTo(ComparatorCountry o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(ComparatorCountry country1, ComparatorCountry country2) {
		return (country1.getCountryId() < country2.getCountryId() ) ? -1: (country1.getCountryId() > country2.getCountryId() ) ? 1:0 ;  
		
	}

}
