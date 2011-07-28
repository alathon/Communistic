package com.cphse.time;

import java.util.concurrent.TimeUnit;

public final class TimeDelay {
	private final long duration;
	private final TimeUnit units;
	
	public TimeDelay( final long duration, final TimeUnit units ) {
		this.duration	= duration;
		this.units 		= units;
	}

	public long getDuration() {
		return duration;
	}

	public TimeUnit getUnits() {
		return units;
	}
}
