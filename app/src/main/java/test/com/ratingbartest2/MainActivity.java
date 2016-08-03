package test.com.ratingbartest2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingbar);
/*        LayerDrawable layerDrawable2 = (LayerDrawable) ratingBar.getProgressDrawable();
        DrawableCompat.setTint(DrawableCompat.wrap(layerDrawable2.getDrawable(0)),
                ContextCompat.getColor(getApplicationContext(), android.R.color.background_dark));
        DrawableCompat.setTint(DrawableCompat.wrap(layerDrawable2.getDrawable(1)),
                ContextCompat.getColor(getApplicationContext(), R.color.colorAccent)); // Partial star
        DrawableCompat.setTint(DrawableCompat.wrap(layerDrawable2.getDrawable(2)),
                ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));*/
        ratingBar.setIsIndicator(false);
        ratingBar.setRating(3.6f);
        ratingBar.setStepSize(0.1f);
        ratingBar.invalidate();
        ratingBar.setIsIndicator(true);
    }
}
