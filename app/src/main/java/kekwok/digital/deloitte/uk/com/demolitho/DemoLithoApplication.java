package kekwok.digital.deloitte.uk.com.demolitho;

import android.app.Application;

import com.facebook.soloader.SoLoader;

/**
 * Created by kekwok on 13/07/2017.
 */

public class DemoLithoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // sort out Litho's dependencies with Yoga
        SoLoader.init(this, false);
    }
}
