package com.example.lesson6;

import android.content.Context;

import androidx.test.espresso.ViewAction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.lesson6", appContext.getPackageName());
    }
    @Test
    public  void addTest(){
        onView(withId(R.id.first_num)).perform(typeText("4"));
        onView(withId(R.id.second_num)).perform(typeText("4"));
        onView(withId(R.id.btn_addition)).perform(click());
        onView(withId(R.id.first_num)).perform(typeText("8"));

    } @Test
    public  void subTest(){
        onView(withId(R.id.first_num)).perform(typeText("6"));
        onView(withId(R.id.second_num)).perform(typeText("4"));
        onView(withId(R.id.btn_addition)).perform(click());
        onView(withId(R.id.first_num)).perform(typeText("2"));

    } @Test
    public  void mulTest(){
        onView(withId(R.id.first_num)).perform(typeText("4"));
        onView(withId(R.id.second_num)).perform(typeText("4"));
        onView(withId(R.id.btn_addition)).perform(click());
        onView(withId(R.id.first_num)).perform(typeText("16"));

    } @Test
    public  void divTest(){
        onView(withId(R.id.first_num)).perform(typeText("10"));
        onView(withId(R.id.second_num)).perform(typeText("5"));
        onView(withId(R.id.btn_addition)).perform(click());
        onView(withId(R.id.first_num)).perform(typeText("2"));

    }



}