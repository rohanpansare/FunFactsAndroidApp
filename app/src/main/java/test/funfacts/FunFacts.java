package test.funfacts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFacts extends AppCompatActivity {
    public static  final String TAG = FunFacts.class.getSimpleName();
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout background ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
      //  getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign the Views from the layout file to the corresponding variables
        mFactTextView= (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        background = (RelativeLayout) findViewById(R.id.RelativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //The button was clicked ,so update the fact TextView with new fact

                 //Update a screen with dynamic fact

              //  FactBook obj = new FactBook();
                    String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();
                    mFactTextView.setText(fact);
                background.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);

            }
        };

        mShowFactButton.setOnClickListener(listener);
        Log.d(TAG,"We are logging from onCreate method.");
        //Toast.makeText(FunFacts.this, "Yay! Activity was created", Toast.LENGTH_SHORT).show();

    }


}
