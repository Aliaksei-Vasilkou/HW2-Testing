package coyclab.github.com.hw_testing;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(
        constants = BuildConfig.class,
        sdk = 21
)
public class ConverterActivityTest {

    private Button convertButton;
    private TextView testTextView;
    private Activity converterActivity;

    @Before
    public void setUp() {
        ActivityController<ConverterActivity> activityController = Robolectric.buildActivity(ConverterActivity.class);
        activityController.create();
        activityController.start();
        activityController.resume();

        converterActivity = activityController.get();

        convertButton = (Button) converterActivity.findViewById(R.id.convert_button);
        testTextView = (TextView) converterActivity.findViewById(R.id.textView);
    }

    @Test
    public void checkActivityNotNull() throws Exception {
        assertNotNull(converterActivity);
    }

    @Test
    public void isTitleCorrect() {
        assertTrue(converterActivity.getTitle().toString().equals("Unit converter"));
    }

    @Test
    public void isTextViewTextCorrect() {
        assertTrue(testTextView.getText().toString().equals("Test activity"));
    }

    @Test
    public void isConvertButtonEnabled() {
        assertTrue(convertButton.isEnabled());
    }

}