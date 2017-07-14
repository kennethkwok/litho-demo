package kekwok.digital.deloitte.uk.com.demolitho;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.Text;

/**
 * Created by kekwok on 13/07/2017.
 */

public class LithoActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ComponentContext context = new ComponentContext(this);

        final Component component = Text.create(context)
                .text("Hello World")
                .textColor(Color.RED)
                .textStyle(Typeface.BOLD)
                .textSizeDip(50)
                .build();

        // LithoView is the bridge between Litho and Android View components
        setContentView(LithoView.create(context, component));
    }
}
