/****************************************************************************
 * Copyright (C) Kevin A. Goldstein R. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Kevin A. Goldstein, 2019
 *
 * FILE: LogbackColorConsole.java
 * DSCRPT: 
 ****************************************************************************/





package com.kagr.utils.logging;





import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.color.ANSIConstants;
import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;
import lombok.Getter;
import lombok.Setter;





public class LogbackColorConsole extends ForegroundCompositeConverterBase<ILoggingEvent>
{
	@Getter @Setter public static String	ERROR	= ANSIConstants.BOLD + ANSIConstants.RED_FG;
	@Getter @Setter public static String	WARN	= ANSIConstants.MAGENTA_FG;
	@Getter @Setter public static String	INFO	= ANSIConstants.YELLOW_FG;
	@Getter @Setter public static String	DEBUG	= ANSIConstants.BOLD + ANSIConstants.BLUE_FG;
	@Getter @Setter public static String	TRACE	= ANSIConstants.BLUE_FG;

	@Override
	protected final String getForegroundColorCode(final ILoggingEvent event)
	{
		Level level = event.getLevel();
		switch (level.toInt())
		{
		case Level.ERROR_INT:
			return ERROR;
		case Level.WARN_INT:
			return WARN;
		case Level.INFO_INT:
			return INFO;
		case Level.DEBUG_INT:
			return DEBUG;
		case Level.TRACE_INT:
			return TRACE;
		default:
			return ANSIConstants.WHITE_FG;
		}
	}
}
