package com.codingcalendar.codingcalendar.api.Services;


import com.codingcalendar.codingcalendar.api.Entities.Contest;


public interface ApiServices {

	public Iterable<Contest> getAllcontests();
	public Iterable<Contest> getby_platform_and_phase(String Platform,String Phase);
}
