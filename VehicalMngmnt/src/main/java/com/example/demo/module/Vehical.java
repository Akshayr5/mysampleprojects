package com.example.demo.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehical {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int vid;
	private String vname;
	private double vprice;
	private String vcolor;
	private int modal;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public double getVprice() {
		return vprice;
	}
	public void setVprice(double vprice) {
		this.vprice = vprice;
	}
	public String getVcolor() {
		return vcolor;
	}
	public void setVcolor(String vcolor) {
		this.vcolor = vcolor;
	}
	public int getModal() {
		return modal;
	}
	public void setModal(int modal) {
		this.modal = modal;
	}
	@Override
	public String toString() {
		return "Vehical [vid=" + vid + ", vname=" + vname + ", vprice=" + vprice + ", vcolor=" + vcolor + ", modal=" + modal
				+ "]";
	}
}
