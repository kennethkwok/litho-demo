package kekwok.digital.deloitte.uk.com.demolitho.litho;

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

@LayoutSpec
public class LithoListMultiParagraphItemSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(ComponentContext context,
                                          @Prop(optional = true) String paragraph1,
                                          @Prop(optional = true) String paragraph2,
                                          @Prop(optional = true) String paragraph3) {

        final Component header = LithoListHeaderItem.create(context).build();
        final Component footer = LithoListFooterItem.create(context).build();

        return Column.create(context)
                .paddingDip(YogaEdge.ALL, 8)
                .child(header)
                .child(createParagraphLayout(context, paragraph1))
                .child(createParagraphLayout(context, paragraph2))
                .child(createParagraphLayout(context, paragraph3))
                .child(footer)
                .build();
    }

    /**
     * Create paragraph layout with margins
     */
    private static ComponentLayout createParagraphLayout(ComponentContext context,
                                                         @Prop(optional = true) String paragraph) {
        return Column.create(context)
                .marginDip(YogaEdge.TOP, 8)
                .marginDip(YogaEdge.BOTTOM, 4)
                .child(
                        Text.create(context)
                                .text(TextUtils.isEmpty(paragraph) ? "This is a sample paragraph" : paragraph)
                                .textSizeSp(14)
                                .withLayout()
                )
                .build();
    }
}
