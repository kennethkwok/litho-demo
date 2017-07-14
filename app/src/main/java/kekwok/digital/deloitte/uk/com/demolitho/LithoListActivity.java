package kekwok.digital.deloitte.uk.com.demolitho;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.OrientationHelper;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentInfo;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.LinearLayoutInfo;
import com.facebook.litho.widget.Recycler;
import com.facebook.litho.widget.RecyclerBinder;

import kekwok.digital.deloitte.uk.com.demolitho.litho.LithoListCommentItem;
import kekwok.digital.deloitte.uk.com.demolitho.litho.LithoListLinkItem;
import kekwok.digital.deloitte.uk.com.demolitho.litho.LithoListMultiParagraphItem;
import kekwok.digital.deloitte.uk.com.demolitho.litho.LithoListPicItem;

/**
 * Created by kekwok on 13/07/2017.
 */

public class LithoListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ComponentContext context = new ComponentContext(this);

        // Think of this as the adapter
        final RecyclerBinder recyclerBinder = new RecyclerBinder.Builder()
                .layoutInfo(new LinearLayoutInfo(this, OrientationHelper.VERTICAL, false))
                .build(context);

        final Component component = Recycler.create(context)
                .binder(recyclerBinder)
                .build();

        addContent(recyclerBinder, context);

        setContentView(LithoView.create(this, component));
    }

    private static void addContent(RecyclerBinder recyclerBinder, ComponentContext context) {
        for (int i = 0; i < 50; i++) {
            double random = Math.random();

            ComponentInfo.Builder componentInfoBuilder = ComponentInfo.create();

            Component component;

            /*
            Call non-spec class (auto generated by annotation processor)
             */
            if (random < 0.25) {
                component = LithoListCommentItem.create(context)
                        .comment("This is some short comment that I\'ve decided to add in here!")
                        .build();
            } else if (random < 0.5) {
                component = LithoListPicItem.create(context)
                        .resId(getRandomImage())
                        .build();
            } else if (random < 0.75) {
                component = LithoListLinkItem.create(context)
                        .resId(getRandomImage())
                        .comment("This is a very interesting linK!")
                        .build();
            } else {
                component = LithoListMultiParagraphItem.create(context)
                        .paragraph1("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. ")
                        .paragraph2("Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus.")
                        .paragraph3("Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum.")
                        .build();
            }
            componentInfoBuilder.component(component);
            recyclerBinder.insertItemAt(i, componentInfoBuilder.build());
        }
    }

    private static int getRandomImage() {
        double random = Math.random();
        if (random < 0.25) {
            return R.drawable.fourbythree;
        } else if (random < 0.5) {
            return R.drawable.butterfly;
        } else if (random < 0.75) {
            return R.drawable.bridge;
        } else {
            return R.drawable.sixteenbynine;
        }
    }
}
