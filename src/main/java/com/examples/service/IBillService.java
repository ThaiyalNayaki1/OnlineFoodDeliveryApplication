package com.examples.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.examples.entities.Bill;

public interface IBillService {
	public Bill addBill(Bill bill);
	public Bill viewBill(Bill bill);
	public Bill updateBill(Bill bill);
	public Bill removeBill(Bill bill);

	public double CalculateTotalCost(Bill bill);
	
	public List<Bill> viewBills(Bill bill);
	
	public List<Bill> viewBills(LocalDateTime date);
}
