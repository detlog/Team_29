package com.example.mulatschaktracker

import android.content.Context
import androidx.test.InstrumentationRegistry.getTargetContext
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThat
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.mulatschaktracker", appContext.packageName)
    }
    @Test
    fun DataBaseIsPresent_isCorrect() {
        //->ShouldWork
        assert(true);
    }
    @Test
    fun CreateUserTest()
    {
        //->ShouldFail
        val test = UserObject();
        val appContext: Context = ApplicationProvider.getApplicationContext();
        val db = DataBaseHandler(appContext);
        val newUserId = db.createUser(test);
        assert(newUserId > 0);

    }

    @Test
    fun CreateUserTestExistingUser()
    {
        //->ShouldFail
        assert(false);
    }

    @Test
    fun CreateInvalidUserUserTest()
    {
        assert(false);
    }
    @Test
    fun  GetExitngUserTest()
    {
        assert(true);
    }
    @Test
    fun  GetInvalidUser()
    {
        assert(false);
    }
}