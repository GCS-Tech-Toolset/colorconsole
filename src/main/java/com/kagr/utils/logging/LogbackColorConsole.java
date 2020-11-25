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





public class LogbackColorConsole extends ForegroundCompositeConverterBase<ILoggingEvent>
{

    @Override
    protected String getForegroundColorCode(ILoggingEvent event)
    {
        Level level = event.getLevel();
        switch (level.toInt())
        {
        case Level.ERROR_INT:
            return ANSIConstants.BOLD + ANSIConstants.RED_FG; 
        case Level.WARN_INT:
            return ANSIConstants.MAGENTA_FG;
        case Level.INFO_INT:
            return ANSIConstants.YELLOW_FG;
        case Level.DEBUG_INT:
            return ANSIConstants.BOLD + ANSIConstants.BLUE_FG;
        default:
            return ANSIConstants.BLUE_FG;
        }
    }
}
