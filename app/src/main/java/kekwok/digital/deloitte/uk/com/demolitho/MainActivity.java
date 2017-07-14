package kekwok.digital.deloitte.uk.com.demolitho;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.recyclerview_button)
    public void onClickRecyclerViewButton() {
        startActivity(new Intent(this, RecyclerViewActivity.class));
    }

    @OnClick(R.id.litho_button)
    public void onClickLithoButton() {
        startActivity(new Intent(this, LithoActivity.class));
    }

    @OnClick(R.id.litho_list_button)
    public void onClickLithoListButton() {
        startActivity(new Intent(this, LithoListActivity.class));
    }
}
