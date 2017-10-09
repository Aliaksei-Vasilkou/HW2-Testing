package coyclab.github.com.hw_testing;

import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Before
    public void setup() throws Exception {
        onView(withId(R.id.first_number_edit_text)).perform(clearText());
        onView(withId(R.id.second_number_edit_text)).perform(clearText());
    }

    @Test
    public void onClickAdd() throws Exception {
        onView(withId(R.id.first_number_edit_text)).perform(typeText("5"));
        onView(withId(R.id.second_number_edit_text)).perform(typeText("5"));
        onView(withId(R.id.add_button)).perform(click());
        onView(withId(R.id.result_text_view)).check(matches(withText("10")));
    }

    @Test
    public void onClickSub() throws Exception {
        onView(withId(R.id.first_number_edit_text)).perform(typeText("10"));
        onView(withId(R.id.second_number_edit_text)).perform(typeText("5"));
        onView(withId(R.id.sub_button)).perform(click());
        onView(withId(R.id.result_text_view)).check(matches(withText("5")));
    }

    @Test
    public void isNextButtonPresent(){
        onView(withId(R.id.next_button)).check(matches(isDisplayed())).check(matches(withText("next >")));
    }
}