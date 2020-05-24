package com.example.dafyomilibrary;


import java.util.List;



public class DafHyomi {

	private List<SederItem> seder;

	private DafYomiDetails dafYomiDetails;

	public void setSeder(List<SederItem> seder){
		this.seder = seder;
	}

	public List<SederItem> getSeder(){
		return seder;
	}

	public void setDafYomiDetails(DafYomiDetails dafYomiDetails){
		this.dafYomiDetails = dafYomiDetails;
	}

	public DafYomiDetails getDafYomiDetails(){
		return dafYomiDetails;
	}
}