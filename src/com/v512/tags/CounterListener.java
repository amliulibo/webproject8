package com.v512.tags;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class CounterListener implements HttpSessionListener {

	private static long onlineNumber=0;
	@Override
	public void sessionCreated(HttpSessionEvent se) {

		onlineNumber++;
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		onlineNumber--;
		
	}
	
	public static long getOnlineNumber()
	{
		return onlineNumber;
	}

}
