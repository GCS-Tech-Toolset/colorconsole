/****************************************************************************
 * Copyright (C) Kevin A. Goldstein R. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Kevin A. Goldstein, 2019
 *
 * FILE: LogbackColorConsoleTest.java
 * DSCRPT: 
 ****************************************************************************/





package com.gcs.utils.logging;





import org.junit.Test;



import com.gcs.utils.logging.LogbackColorConsole;



import ch.qos.logback.core.pattern.color.ANSIConstants;
import lombok.extern.slf4j.Slf4j;





@Slf4j
public class LogbackColorConsoleTest
{

    @Test
    public void test()
    {
        _logger.trace("test trace");
        _logger.debug("test debug");
        _logger.info("test info");
        _logger.warn("test warn");
        _logger.error("test error");
    }
    
    
    
    
    @Test
    public void testAlternateColors()
    {
    	LogbackColorConsole.TRACE = ANSIConstants.YELLOW_FG;
    	LogbackColorConsole.DEBUG = ANSIConstants.WHITE_FG;
    	LogbackColorConsole.ERROR = ANSIConstants.GREEN_FG;
    	
        _logger.trace("test trace");
        _logger.debug("test debug");
        _logger.info("test info");
        _logger.warn("test warn");
        _logger.error("test error");
    }

}
