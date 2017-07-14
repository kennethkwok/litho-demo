package kekwok.digital.deloitte.uk.com.demolitho;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import kekwok.digital.deloitte.uk.com.demolitho.model.NewsfeedItem;
import kekwok.digital.deloitte.uk.com.demolitho.viewholder.BaseViewHolder;
import kekwok.digital.deloitte.uk.com.demolitho.viewholder.CommentViewHolder;
import kekwok.digital.deloitte.uk.com.demolitho.viewholder.LinkViewHolder;
import kekwok.digital.deloitte.uk.com.demolitho.viewholder.MultiParagraphViewHolder;
import kekwok.digital.deloitte.uk.com.demolitho.viewholder.PicViewHolder;

/**
 * Created by kekwok on 11/07/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    public static final int VIEW_TYPE_COMMENT = 0;
    public static final int VIEW_TYPE_PIC = 1;
    public static final int VIEW_TYPE_MULTI_PARAGRAPH = 2;
    public static final int VIEW_TYPE_LINK = 3;

    private List<NewsfeedItem> mNewsfeedList;

    public RecyclerViewAdapter(List<NewsfeedItem> newsfeedList) {
        mNewsfeedList = newsfeedList;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case VIEW_TYPE_PIC:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.viewholder_type_pic, parent, false);
                return new PicViewHolder(view);
            case VIEW_TYPE_MULTI_PARAGRAPH:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.viewholder_type_multiparagraph, parent, false);
                return new MultiParagraphViewHolder(view);
            case VIEW_TYPE_LINK:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.viewholder_type_link, parent, false);
                return new LinkViewHolder(view);
            default:
            case VIEW_TYPE_COMMENT:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.viewholder_type_comment, parent, false);
                return new CommentViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bindItem(mNewsfeedList.get(position));
    }

    @Override
    public int getItemCount() {
        return mNewsfeedList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mNewsfeedList.get(position).getType();
    }
}
