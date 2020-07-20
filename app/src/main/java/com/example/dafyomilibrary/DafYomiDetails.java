package com.example.dafyomilibrary;


public class DafYomiDetails{

	private int allPages;

	private int dafStart;

	private int kinim;

	private int Midot;

	private String dateStart;

	private int tamid;


	public void setMidot(int midot) {
		Midot = midot;
	}

	public int getMidot() {
		return Midot;
	}

	public void setAllPages(int allPages){
		this.allPages = allPages;
	}

	public int getAllPages(){
		return allPages;
	}

	public void setDafStart(int dafStart){
		this.dafStart = dafStart;
	}

	public int getDafStart(){
		return dafStart;
	}

	public void setKinnim(int kinnim){
		this.kinim = kinnim;
	}

	public int getKinnim(){
		return kinim;
	}

	public void setDateStart(String dateStart){
		this.dateStart = dateStart;
	}

	public String getDateStart(){
		return dateStart;
	}

	public void setTamid(int tamid){
		this.tamid = tamid;
	}

	public int getTamid(){
		return tamid;
	}
}