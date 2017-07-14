package kekwok.digital.deloitte.uk.com.demolitho.litho;

import android.text.TextUtils;
import android.widget.ImageView;

import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Image;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaEdge;

/**
 * Created by kekwok on 13/07/2017.
 */

@LayoutSpec
public class LithoListPicItemSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(ComponentContext context,
                                          @Prop int resId) {

        final Component footer = LithoListFooterItem.create(context).build();

        return Column.create(context)
                .child(createPicLayout(context, resId))
                .child(footer)
                .build();
    }

    /**
     * Create comment layout with margins
     */
    private static ComponentLayout createCommentLayout(ComponentContext context,
                                                       @Prop(optional = true) String comment) {

        return Column.create(context)
                .marginDip(YogaEdge.TOP, 8)
                .marginDip(YogaEdge.BOTTOM, 4)
                .child(
                        Text.create(context)
                                .text(TextUtils.isEmpty(comment) ? "This is a sample comment" : comment)
                                .textSizeSp(14)
                                .withLayout()
                )
                .build();
    }

    /**
     * Create layout with header, comment row and append image to it
     */
    private static ComponentLayout createPicLayout(ComponentContext c,
                                                   @Prop int resId) {
        return Column.create(c)
                .child(createHeadingLayout(c))
                .child(
                        Image.create(c)
                        .drawableRes(resId)
                        .scaleType(ImageView.ScaleType.FIT_XY)
                        .withLayout()
                )
                .build();
    }

    /**
     * Create layout with header and comment row
     */
    private static ComponentLayout createHeadingLayout(ComponentContext c) {
        final Component header = LithoListHeaderItem.create(c).build();

        return Column.create(c)
                .paddingDip(YogaEdge.ALL, 8)
                .child(header)
                .child(createCommentLayout(c, null))
                .build();
    }
}
