package com.example.demo.classes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class ShowData
{

	LocalDate date ;
	LocalTime time ;
	Double price;
	Integer screenid ;
	Integer movieid;


	public ShowData() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public LocalTime getTime() {
		return time;
	}


	public void setTime(LocalTime time) {
		this.time = time;
	}


	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getScreenid() {
		return screenid;
	}
	public void setScreenid(Integer screenid) {
		this.screenid = screenid;
	}
	public Integer getMovieid() {
		return movieid;
	}
	public void setMovieid(Integer movieid) {
		this.movieid = movieid;
	}
	@Override
	public String toString() {
		return "ShowData [date=" + date + ", time=" + time + ", price=" + price + ", screenid=" + screenid
				+ ", movieid=" + movieid + "]";
	}


	public ShowData(LocalDate date, LocalTime time, Double price, Integer screenid, Integer movieid) {
		super();
		this.date = date;
		this.time = time;
		this.price = price;
		this.screenid = screenid;
		this.movieid = movieid;
	}



}
