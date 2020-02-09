package com.snsd.app.service;

import java.util.List;


import com.snsd.app.bean.Zone;

public interface Operations {
	public String hello();
	public String sayHello(String authString);
	public List<Zone> getZoneList(String authString);
}
