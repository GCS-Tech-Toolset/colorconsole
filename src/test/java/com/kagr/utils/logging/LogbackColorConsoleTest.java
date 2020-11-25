/****************************************************************************
 * Copyright (C) Kevin A. Goldstein R. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Kevin A. Goldstein, 2019
 *
 * FILE: LogbackColorConsoleTest.java
 * DSCRPT: 
 ****************************************************************************/





package com.kagr.utils.logging;





import org.junit.Test;

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

}
