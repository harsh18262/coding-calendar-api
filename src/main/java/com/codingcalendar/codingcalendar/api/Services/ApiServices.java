package com.codingcalendar.codingcalendar.api.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codingcalendar.codingcalendar.api.Entities.Contest;


public interface ApiServices {

	public Iterable<Contest> getAllcontests();
}
