package kekwok.digital.deloitte.uk.com.demolitho.viewholder;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import kekwok.digital.deloitte.uk.com.demolitho.R;
import kekwok.digital.deloitte.uk.com.demolitho.model.NewsfeedItem;

/**
 * Created by kekwok on 12/07/2017.
 */

public class MultiParagraphViewHolder extends BaseViewHolder {
    @BindView(R.id.paragraph1)
    TextView mParagraph1;

    @BindView(R.id.paragraph2)
    TextView mParagraph2;

    @BindView(R.id.paragraph3)
    TextView mParagraph3;

    public MultiParagraphViewHolder(View view) {
        super(view);
    }

    @Override
    public void bindItem(NewsfeedItem item) {
        mParagraph1.setText(item.getParagraph1());
        mParagraph2.setText(item.getParagraph2());
        mParagraph3.setText(item.getParagraph3());
    }
}
