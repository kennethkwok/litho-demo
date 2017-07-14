package kekwok.digital.deloitte.uk.com.demolitho;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import kekwok.digital.deloitte.uk.com.demolitho.model.NewsfeedItem;

public class RecyclerViewActivity extends AppCompatActivity {

    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerView;

    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);
        ButterKnife.bind(this);

        populateAdapter();

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void populateAdapter() {
        ArrayList<NewsfeedItem> newsfeedList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            double random = Math.random();

            if (random < 0.25) {
                newsfeedList.add(new NewsfeedItem(RecyclerViewAdapter.VIEW_TYPE_COMMENT));
            } else if (random < 0.5) {
                newsfeedList.add(new NewsfeedItem(RecyclerViewAdapter.VIEW_TYPE_PIC));
            } else if (random < 0.75) {
                newsfeedList.add(new NewsfeedItem(RecyclerViewAdapter.VIEW_TYPE_LINK));
            } else {
                newsfeedList.add(new NewsfeedItem(RecyclerViewAdapter.VIEW_TYPE_MULTI_PARAGRAPH));
            }
        }

        mAdapter = new RecyclerViewAdapter(newsfeedList);
    }
}
