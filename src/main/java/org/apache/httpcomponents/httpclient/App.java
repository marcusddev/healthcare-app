package org.apache.httpcomponents.httpclient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main(String[] args) {
	        List<HealthcareData> healthcareDataList = HealthcareDataReader.readDataFromCSV("Meaningful-Use-Acceleration-Scorecard.csv");

	        // Filter data for the year 2014
	        List<HealthcareData> data2014 = filterDataByYear(healthcareDataList, 2014);

	        // Sort by pctHospitalsMu in descending order
	        Collections.sort(data2014, Comparator.comparingDouble(HealthcareData::getPctHospitalsMu).reversed());

	        // Print sorted data
	        System.out.println("Healthcare Data for the year 2014 sorted by eligible and critical access hospitals that have demonstrated Meaningful Use of CEHRT in descending order:");
	        for (HealthcareData data : data2014) {
	            System.out.println(data.getRegion() + ": " + data.getPctHospitalsMu());
	        }
	    }

	 // Helper method to filter data by year
	    private static List<HealthcareData> filterDataByYear(List<HealthcareData> dataList, int year) {
	        return new ArrayList<>(dataList.stream()
	                .filter(data -> data.getPeriod() == year)
	                .toList());
	    }
	}