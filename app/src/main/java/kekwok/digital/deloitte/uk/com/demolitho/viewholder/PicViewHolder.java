package kekwok.digital.deloitte.uk.com.demolitho.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import kekwok.digital.deloitte.uk.com.demolitho.R;
import kekwok.digital.deloitte.uk.com.demolitho.model.NewsfeedItem;

/**
 * Created by kekwok on 12/07/2017.
 */

public class PicViewHolder extends BaseViewHolder {

    @BindView(R.id.comment)
    TextView comment;

    @BindView(R.id.pic)
    ImageView pic;

    public PicViewHolder(View view) {
        super(view);
    }

    @Override
    public void bindItem(NewsfeedItem item) {
        comment.setText(item.getParagraph3());

        double random = Math.random();

        if (random < 0.25) {
            pic.setImageResource(R.drawable.fourbythree);
        } else if (random < 0.5) {
            pic.setImageResource(R.drawable.butterfly);
        } else if (random < 0.75) {
            pic.setImageResource(R.drawable.bridge);
        } else {
            pic.setImageResource(R.drawable.sixteenbynine);
        }
    }
}
