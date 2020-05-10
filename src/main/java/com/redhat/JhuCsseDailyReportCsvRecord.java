package com.redhat;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@XmlRootElement(name="jhu-csse-report")
@CsvRecord(separator = ",", skipField=true, quote="\"")
public class JhuCsseDailyReportCsvRecord {
	 @DataField(pos = 2)
	    private String admin2;
		  
		

	    @DataField(pos = 3)
	    private String provinceState;
		  
		  @DataField(pos = 4)
		  private String countryRegion;
		  
		  @DataField(pos = 5)
		  private String lastUpdate;
		  
		  @DataField(pos = 8)
	    private int confirmedCases;
		  
		  @DataField(pos = 9)
	    private int deaths;
	    
//	    @DataField(pos = 1)
//	    private String provinceState;
	//
//	    @DataField(pos = 2)
//	    private String countryRegion;
	//
//	    @DataField(pos = 3)
//	    private String lastUpdate;
	//
//		@DataField(pos = 4)
//		private int confirmedCases;
	//
//	    @DataField(pos = 5)
//	    private int deaths;
	    
	    private LocalDate reportDate;

	    public String getAdmin2() {
	      return admin2;
	    }

	    public void setAdmin2(String admin2) {
	      this.admin2 = admin2;
	    }

	    public String getProvinceState() {
	      return provinceState;
	    }

	    public void setProvinceState(String provinceState) {
	      this.provinceState = provinceState;
	    }

	    @XmlElement(name = "country")
	    public String getCountryRegion() {
	      return countryRegion;
	    }

	    public void setCountryRegion(String countryRegion) {
	      this.countryRegion = countryRegion;
	    }

	    public String getLastUpdate() {
	      return lastUpdate;
	    }

	    public void setLastUpdate(String lastUpdate) {
	      this.lastUpdate = lastUpdate;
	    }

	    public int getConfirmedCases() {
	      return confirmedCases;
	    }

	    public void setConfirmedCases(int confirmedCases) {
	      this.confirmedCases = confirmedCases;
	    }

	    public int getDeaths() {
	      return deaths;
	    }

	    public void setDeaths(int deaths) {
	      this.deaths = deaths;
	    }
	    
	    public LocalDate getReportDate() throws ParseException {
			return reportDate;
		}

		public void setReportDate(LocalDate reportDate) {
			this.reportDate = reportDate;
		}


}
