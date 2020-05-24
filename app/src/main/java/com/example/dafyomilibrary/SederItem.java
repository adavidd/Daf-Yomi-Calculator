package com.example.dafyomilibrary;


import java.util.List;


public class SederItem {

	private List<MasechtotItem> masechtot;

	private String name;

	public void setMasechtot(List<MasechtotItem> masechtot){
		this.masechtot = masechtot;
	}

	public List<MasechtotItem> getMasechtot(){
		return masechtot;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}