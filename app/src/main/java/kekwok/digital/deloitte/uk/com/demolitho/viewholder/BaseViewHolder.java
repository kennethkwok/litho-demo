package kekwok.digital.deloitte.uk.com.demolitho.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;
import kekwok.digital.deloitte.uk.com.demolitho.model.NewsfeedItem;

/**
 * Created by kekwok on 11/07/2017.
 */

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    public BaseViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public abstract void bindItem(NewsfeedItem item);
}
