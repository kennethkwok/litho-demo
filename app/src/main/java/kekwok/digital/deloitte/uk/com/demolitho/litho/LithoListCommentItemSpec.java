package kekwok.digital.deloitte.uk.com.demolitho.litho;

import android.graphics.Typeface;
import android.text.TextUtils;

import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaEdge;

/**
 * Created by kekwok on 13/07/2017.
 */


// spec - think of this as a composite view on Android. It groups components into an immutable layout tree
@LayoutSpec
public class LithoListCommentItemSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(ComponentContext context,
                                          @Prop(optional = true) String comment) {

        final Component header = LithoListHeaderItem.create(context).build();
        final Component footer = LithoListFooterItem.create(context).build();

        return Column.create(context)
                .paddingDip(YogaEdge.ALL, 8)
                .child(header)
                .child(createCommentLayout(context, comment))
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
}
