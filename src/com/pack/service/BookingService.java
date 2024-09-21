package com.pack.service;

import java.util.List;

import com.pack.beans.HistoryBean;
import com.pack.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
