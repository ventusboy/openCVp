package us.to.opti_grader.optigrader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity";

    static {
        if (!OpenCVLoader.initDebug()) {
            Log.d(TAG, "Failed to load OpenCV");
        } else {
            Log.d(TAG, "Loaded OpenCV");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.enter_id);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void CameraActivity(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, CameraActivity.class);
        //EditText editText = (EditText) findViewById(R.id.enter_id);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
}
