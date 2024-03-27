/**
 * 
 */
package org.apache.httpcomponents.httpclient;


class HealthcareData {
    private String region;
    private String regionCode;
    private int period;
    private double pctMdPaNpMuAiu;
    private double pctMdPaNpMu;
    private double pctMdMuAiu;
    private double pctMdMu;
    private double pctNpMuAiu;
    private double pctNpMu;
    private double pctPaMuAiu;
    private double pctPaMu;
    private double pctHospitalsMuAiu;
    private double pctHospitalsMu;
    private double pctCahSmallRuralMuAiu;
    private double pctCahSmallRuralMu;
    
    public HealthcareData(String region, String regionCode, int period, double pctMdPaNpMuAiu, double pctMdPaNpMu,
            double pctMdMuAiu, double pctMdMu, double pctNpMuAiu, double pctNpMu, double pctPaMuAiu,
            double pctPaMu, double pctHospitalsMuAiu, double pctHospitalsMu, double pctCahSmallRuralMuAiu,
            double pctCahSmallRuralMu) {
    	
    	this.region = region;
    	this.regionCode = regionCode;
    	this.period = period;
    	this.pctMdPaNpMuAiu = pctMdPaNpMuAiu;
    	this.pctMdPaNpMu = pctMdPaNpMu;
    	this.pctMdMuAiu = pctMdMuAiu;
    	this.pctMdMu = pctMdMu;
    	this.pctNpMuAiu = pctNpMuAiu;
    	this.pctNpMu = pctNpMu;
    	this.pctPaMuAiu = pctPaMuAiu;
    	this.pctPaMu = pctPaMu;
    	this.pctHospitalsMuAiu = pctHospitalsMuAiu;
    	this.pctHospitalsMu = pctHospitalsMu;
    	this.pctCahSmallRuralMuAiu = pctCahSmallRuralMuAiu;
    	this.pctCahSmallRuralMu = pctCahSmallRuralMu;
}
    
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the regionCode
	 */
	public String getRegionCode() {
		return regionCode;
	}
	/**
	 * @param regionCode the regionCode to set
	 */
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	/**
	 * @return the period
	 */
	public int getPeriod() {
		return period;
	}
	/**
	 * @param period the period to set
	 */
	public void setPeriod(int period) {
		this.period = period;
	}
	/**
	 * @return the pctMdPaNpMuAiu
	 */
	public double getPctMdPaNpMuAiu() {
		return pctMdPaNpMuAiu;
	}
	/**
	 * @param pctMdPaNpMuAiu the pctMdPaNpMuAiu to set
	 */
	public void setPctMdPaNpMuAiu(double pctMdPaNpMuAiu) {
		this.pctMdPaNpMuAiu = pctMdPaNpMuAiu;
	}
	/**
	 * @return the pctMdPaNpMu
	 */
	public double getPctMdPaNpMu() {
		return pctMdPaNpMu;
	}
	/**
	 * @param pctMdPaNpMu the pctMdPaNpMu to set
	 */
	public void setPctMdPaNpMu(double pctMdPaNpMu) {
		this.pctMdPaNpMu = pctMdPaNpMu;
	}
	/**
	 * @return the pctMdMuAiu
	 */
	public double getPctMdMuAiu() {
		return pctMdMuAiu;
	}
	/**
	 * @param pctMdMuAiu the pctMdMuAiu to set
	 */
	public void setPctMdMuAiu(double pctMdMuAiu) {
		this.pctMdMuAiu = pctMdMuAiu;
	}
	/**
	 * @return the pctMdMu
	 */
	public double getPctMdMu() {
		return pctMdMu;
	}
	/**
	 * @param pctMdMu the pctMdMu to set
	 */
	public void setPctMdMu(double pctMdMu) {
		this.pctMdMu = pctMdMu;
	}
	/**
	 * @return the pctNpMuAiu
	 */
	public double getPctNpMuAiu() {
		return pctNpMuAiu;
	}
	/**
	 * @param pctNpMuAiu the pctNpMuAiu to set
	 */
	public void setPctNpMuAiu(double pctNpMuAiu) {
		this.pctNpMuAiu = pctNpMuAiu;
	}
	/**
	 * @return the pctNpMu
	 */
	public double getPctNpMu() {
		return pctNpMu;
	}
	/**
	 * @param pctNpMu the pctNpMu to set
	 */
	public void setPctNpMu(double pctNpMu) {
		this.pctNpMu = pctNpMu;
	}
	/**
	 * @return the pctPaMuAiu
	 */
	public double getPctPaMuAiu() {
		return pctPaMuAiu;
	}
	/**
	 * @param pctPaMuAiu the pctPaMuAiu to set
	 */
	public void setPctPaMuAiu(double pctPaMuAiu) {
		this.pctPaMuAiu = pctPaMuAiu;
	}
	/**
	 * @return the pctPaMu
	 */
	public double getPctPaMu() {
		return pctPaMu;
	}
	/**
	 * @param pctPaMu the pctPaMu to set
	 */
	public void setPctPaMu(double pctPaMu) {
		this.pctPaMu = pctPaMu;
	}
	/**
	 * @return the pctHospitalsMuAiu
	 */
	public double getPctHospitalsMuAiu() {
		return pctHospitalsMuAiu;
	}
	/**
	 * @param pctHospitalsMuAiu the pctHospitalsMuAiu to set
	 */
	public void setPctHospitalsMuAiu(double pctHospitalsMuAiu) {
		this.pctHospitalsMuAiu = pctHospitalsMuAiu;
	}
	/**
	 * @return the pctHospitalsMu
	 */
	public double getPctHospitalsMu() {
		return pctHospitalsMu;
	}
	/**
	 * @param pctHospitalsMu the pctHospitalsMu to set
	 */
	public void setPctHospitalsMu(double pctHospitalsMu) {
		this.pctHospitalsMu = pctHospitalsMu;
	}
	/**
	 * @return the pctCahSmallRuralMuAiu
	 */
	public double getPctCahSmallRuralMuAiu() {
		return pctCahSmallRuralMuAiu;
	}
	/**
	 * @param pctCahSmallRuralMuAiu the pctCahSmallRuralMuAiu to set
	 */
	public void setPctCahSmallRuralMuAiu(double pctCahSmallRuralMuAiu) {
		this.pctCahSmallRuralMuAiu = pctCahSmallRuralMuAiu;
	}
	/**
	 * @return the pctCahSmallRuralMu
	 */
	public double getPctCahSmallRuralMu() {
		return pctCahSmallRuralMu;
	}
	/**
	 * @param pctCahSmallRuralMu the pctCahSmallRuralMu to set
	 */
	public void setPctCahSmallRuralMu(double pctCahSmallRuralMu) {
		this.pctCahSmallRuralMu = pctCahSmallRuralMu;
	}

}
