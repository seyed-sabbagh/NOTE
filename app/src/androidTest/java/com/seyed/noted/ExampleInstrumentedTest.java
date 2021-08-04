/*
 * *
 *  * Created by seyed on 8/4/21, 1:42 PM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 8/4/21, 12:35 PM
 *
 */

package com.seyed.noted;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.developerdepository.noted", appContext.getPackageName());
    }
}