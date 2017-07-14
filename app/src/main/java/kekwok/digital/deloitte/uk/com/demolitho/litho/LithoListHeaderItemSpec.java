package kekwok.digital.deloitte.uk.com.demolitho.litho;

import android.graphics.Typeface;

import com.facebook.litho.Column;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.Row;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.widget.Image;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaJustify;

import kekwok.digital.deloitte.uk.com.demolitho.R;

/**
 * Created by kekwok on 13/07/2017.
 */

@LayoutSpec
public class LithoListHeaderItemSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(ComponentContext context) {
        return createHeaderItem(context);
    }

    /**
     * Creates header text items (profile name and date)
     */
    private static ComponentLayout createHeaderTextItem(ComponentContext context) {
        return Column.create(context)
                .marginRes(YogaEdge.START, R.dimen.viewholder_header_left_margin)
                .heightDip(45)
                .justifyContent(YogaJustify.CENTER)
                .child(
                        Text.create(context)
                                .text("Profile Name")
                                .textSizeSp(16)
                                .textStyle(Typeface.BOLD)
                                .withLayout()
                )
                .child(
                        Text.create(context)
                                .text("11 July 2017 at 11:31 | London, United Kingdom")
                                .textSizeSp(12)
                                .withLayout()
                )
                .build();
    }

    /**
     * Creates header row profile pic and appends text items to the right
     */
    private static ComponentLayout createHeaderItem(ComponentContext context) {
        return Row.create(context)
                .marginRes(YogaEdge.RIGHT, R.dimen.viewholder_header_left_margin)
                .heightDip(45)
                .alignContent(YogaAlign.CENTER)
                .child(
                        Image.create(context)
                                .drawableRes(R.drawable.profile)
                                .withLayout()
                )
                .child(createHeaderTextItem(context))
                .build();
    }

}
