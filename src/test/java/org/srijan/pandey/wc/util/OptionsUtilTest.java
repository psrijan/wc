package org.srijan.pandey.wc.util;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OptionsUtilTest {

    @Test
    public void testOptionsUtil() {
        Options options = OptionsUtil.generateOptions();
        Assertions.assertNotNull(options);
    }

    @Test
    public void testHasHOption () {
        Options options = OptionsUtil.generateOptions();
        Assertions.assertTrue(options.hasOption("h"));
    }

}
