package kekwok.digital.deloitte.uk.com.demolitho.litho;

import android.graphics.Typeface;
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

import kekwok.digital.deloitte.uk.com.demolitho.R;

/**
 * Created by kekwok on 13/07/2017.
 */

@LayoutSpec
public class LithoListLinkItemSpec {
    @OnCreateLayout
    static ComponentLayout onCreateLayout(ComponentContext context,
                                          @Prop(optional = true) String comment,
                                          @Prop int resId) {

        final Component header = LithoListHeaderItem.create(context).build();
        final Component footer = LithoListFooterItem.create(context).build();

        return Column.create(context)
                .paddingDip(YogaEdge.ALL, 8)
                .child(header)
                .child(createCommentLayout(context, comment))
                .child(createPicLayout(context, resId))
                .child(createLinkLayout(context))
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
                                .textSizeSp(18)
                                .textStyle(Typeface.BOLD)
                                .withLayout()
                )
                .build();
    }

    private static ComponentLayout createPicLayout(ComponentContext c,
                                                   @Prop int resId) {
        return Column.create(c)
                .child(
                        Image.create(c)
                                .drawableRes(resId)
                                .scaleType(ImageView.ScaleType.FIT_XY)
                                .withLayout()
                )
                .build();
    }

    private static ComponentLayout createLinkLayout(ComponentContext c) {
        return Column.create(c)
                .paddingDip(YogaEdge.ALL, 12)
                .backgroundRes(R.drawable.border)
                .child(
                        Text.create(c)
                            .textSizeSp(18)
                            .textStyle(Typeface.BOLD_ITALIC)
                            .text("Google UK")
                )
                .child(
                        Text.create(c)
                            .text("http://www.google.com")
                            .textSizeSp(12)
                )
                .build();
    }
}
