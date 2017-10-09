package coyclab.github.com.hw_testing;

import android.widget.Button;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class ConverterActivityTest {

    private Button convertButton;
    private TextView testTextView;
    private ConverterActivity mActivity;

    @Before
    public void setUp() throws Exception {
        mActivity = Robolectric.setupActivity(ConverterActivity.class);
        convertButton = (Button) mActivity.findViewById(R.id.convert_button);
        testTextView = (TextView) mActivity.findViewById(R.id.textView);
    }

    @Test
    public void checkActivityNotNull() throws Exception {
        assertNotNull(mActivity);
    }

    @Test
    public void isTitleCorrect() {
        assertTrue(mActivity.getTitle().toString().equals("Unit converter"));
    }

    @Test
    public void isTextViewTextCorrect() {
        assertTrue(testTextView.getText().toString().equals("Test activity"));
    }

    @Test
    public void isConvertButtonDisplay() {
        assertNotNull(convertButton.getText());
    }

}