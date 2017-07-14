package kekwok.digital.deloitte.uk.com.demolitho.litho;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.Row;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.yoga.YogaEdge;

import kekwok.digital.deloitte.uk.com.demolitho.R;

/**
 * Created by kekwok on 13/07/2017.
 */

@LayoutSpec
public class LithoListFooterItemSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(ComponentContext context) {
        return Row.create(context)
                .heightDip(2)
                .widthPercent(100)
                .marginDip(YogaEdge.TOP, 8)
                .backgroundRes(R.drawable.border)
                .build();
    }
}
