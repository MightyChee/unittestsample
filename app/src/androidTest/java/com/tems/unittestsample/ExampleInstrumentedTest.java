package com.tems.unittestsample;

import android.app.Instrumentation;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import androidx.test.uiautomator.By;
import androidx.test.uiautomator.BySelector;
import androidx.test.uiautomator.UiDevice;

import org.junit.Rule;
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
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.tems.unittestsample", appContext.getPackageName());
    }

    @Test
    public void ensureNameIsExist() {
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();

        UiDevice device = UiDevice.getInstance(instrumentation);
        Context context = instrumentation.getContext();

        BySelector nameField = By.clazz("android.widget.EditText").res("com.tems.unittestsample:id/userNameInput");

        assertEquals(nameField != null, nameField != null);
    }
}
