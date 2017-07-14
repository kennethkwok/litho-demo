package kekwok.digital.deloitte.uk.com.demolitho.viewholder;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import kekwok.digital.deloitte.uk.com.demolitho.R;
import kekwok.digital.deloitte.uk.com.demolitho.model.NewsfeedItem;

/**
 * Created by kekwok on 12/07/2017.
 */

public class CommentViewHolder extends BaseViewHolder {
    @BindView(R.id.comment)
    TextView mComment;

    public CommentViewHolder(View view) {
        super(view);
    }

    @Override
    public void bindItem(NewsfeedItem item) {
        mComment.setText(item.getComment());
    }
}
