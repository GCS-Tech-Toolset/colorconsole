/****************************************************************************
 * Copyright (C) Kevin A. Goldstein R. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Kevin A. Goldstein, 2019
 *
 * FILE: LogbackColorConsole.java
 * DSCRPT: 
 ****************************************************************************/





package com.gcs.utils.logging;





import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.color.ANSIConstants;
import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;
import lombok.Getter;
import lombok.Setter;





public class LogbackColorConsole extends ForegroundCompositeConverterBase<ILoggingEvent>
{
	@Getter @Setter public static String	_ERROR	= ANSIConstants.BOLD + ANSIConstants.RED_FG;
	@Getter @Setter public static String	_WARN	= ANSIConstants.MAGENTA_FG;
	@Getter @Setter public static String	_INFO	= ANSIConstants.YELLOW_FG;
	@Getter @Setter public static String	_DEBUG	= ANSIConstants.BOLD + ANSIConstants.BLUE_FG;
	@Getter @Setter public static String	_TRACE	= ANSIConstants.BLUE_FG;

	@Override
	protected final String getForegroundColorCode(final ILoggingEvent event_)
	{
		Level level = event_.getLevel();
		switch (level.toInt())
		{
		case Level.ERROR_INT:
			return _ERROR;
		case Level.WARN_INT:
			return _WARN;
		case Level.INFO_INT:
			return _INFO;
		case Level.DEBUG_INT:
			return _DEBUG;
		case Level.TRACE_INT:
			return _TRACE;
		default:
			return ANSIConstants.WHITE_FG;
		}
	}
}
