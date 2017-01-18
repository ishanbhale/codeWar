package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

 
 public static void main(String[] args) {
   ComparatorCountry indiaCountry=new ComparatorCountry(1, "India");
   ComparatorCountry chinaCountry=new ComparatorCountry(4, "China");
   ComparatorCountry nepalCountry=new ComparatorCountry(3, "Nepal");
   ComparatorCountry bhutanCountry=new ComparatorCountry(2, "Bhutan");
   
         List<ComparatorCountry> listOfCountries = new ArrayList<ComparatorCountry>();
         listOfCountries.add(indiaCountry);
         listOfCountries.add(chinaCountry);
         listOfCountries.add(nepalCountry);
         listOfCountries.add(bhutanCountry);
  
         System.out.println("Before Sort by id : ");
         for (int i = 0; i < listOfCountries.size(); i++) {
    ComparatorCountry country=(ComparatorCountry) listOfCountries.get(i);
    System.out.println("ComparatorCountry Id: "+country.getCountryId()+"||"+"ComparatorCountry name: "+country.getCountryName());
   }
         Collections.sort(listOfCountries,new CountrySortIdByComparator());
         
         System.out.println("After Sort by id: ");
         for (int i = 0; i < listOfCountries.size(); i++) {
    ComparatorCountry country=(ComparatorCountry) listOfCountries.get(i);
    System.out.println("ComparatorCountry Id: "+country.getCountryId()+"|| "+"ComparatorCountry name: "+country.getCountryName());
   }
         
         //Sort by countryName
         Collections.sort(listOfCountries,new Comparator<ComparatorCountry>() {

    @Override
    public int compare(ComparatorCountry o1, ComparatorCountry o2) {
     return o1.getCountryName().compareTo(o2.getCountryName());
    }
   });
   
   System.out.println("After Sort by name: ");
         for (int i = 0; i < listOfCountries.size(); i++) {
    ComparatorCountry country=(ComparatorCountry) listOfCountries.get(i);
    System.out.println("ComparatorCountry Id: "+country.getCountryId()+"|| "+"ComparatorCountry name: "+country.getCountryName());
   }
 }

}