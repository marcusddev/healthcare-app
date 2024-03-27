package org.apache.httpcomponents.httpclient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class HealthcareDataReader {
	
    public static List<HealthcareData> readDataFromCSV(String csvFile) {
        String line;
        String csvSplitBy = ",";
        List<HealthcareData> healthcareDataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine(); // Skip the header line

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                if (data.length < 15) {
                   // System.err.println("Invalid data row: " + line);
                    continue;
                }

                // Parse data with error handling
                try {
                    String region = data[0];
                    String regionCode = data[1];
                    int period = Integer.parseInt(data[2]);
                    double pctMdPaNpMuAiu = parseDoubleWithEmpty(data[3]);
                    double pctMdPaNpMu = parseDoubleWithEmpty(data[4]);
                    double pctMdMuAiu = parseDoubleWithEmpty(data[5]);
                    double pctMdMu = parseDoubleWithEmpty(data[6]);
                    double pctNpMuAiu = parseDoubleWithEmpty(data[7]);
                    double pctNpMu = parseDoubleWithEmpty(data[8]);
                    double pctPaMuAiu = parseDoubleWithEmpty(data[9]);
                    double pctPaMu = parseDoubleWithEmpty(data[10]);
                    double pctHospitalsMuAiu = parseDoubleWithEmpty(data[11]);
                    double pctHospitalsMu = parseDoubleWithEmpty(data[12]);
                    double pctCahSmallRuralMuAiu = parseDoubleWithEmpty(data[13]);
                    double pctCahSmallRuralMu = parseDoubleWithEmpty(data[14]);

                    HealthcareData healthcareData = new HealthcareData(region, regionCode, period, pctMdPaNpMuAiu,
                            pctMdPaNpMu, pctMdMuAiu, pctMdMu, pctNpMuAiu, pctNpMu, pctPaMuAiu, pctPaMu,
                            pctHospitalsMuAiu, pctHospitalsMu, pctCahSmallRuralMuAiu, pctCahSmallRuralMu);

                    healthcareDataList.add(healthcareData);
                } catch (NumberFormatException e) {
                   // System.err.println("Invalid data row: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return healthcareDataList;
    }

    // Helper method to parse doubles, handling empty strings
    private static double parseDoubleWithEmpty(String s) {
        return s.isEmpty() ? 0.0 : Double.parseDouble(s);
    }
	}


