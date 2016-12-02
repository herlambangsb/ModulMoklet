package id.sch.smktelkom_mlg.project.xirpl209182736.modulmoklet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<ImageModel> mList;
    private ImageAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        mList = new ArrayList<>();
        mList.add(new ImageModel(String.valueOf(R.drawable.a), "Drink 1", " Putu Joli Artaguna", "This is the best drink in the world."));
        mList.add(new ImageModel(String.valueOf(R.drawable.b), "Drink 2", " putu guna", "This is the best drink in the world."));
        mList.add(new ImageModel(String.valueOf(R.drawable.c), "Drink 3", " Putu Guna", "This is the best drink in the world."));
        mList.add(new ImageModel(String.valueOf(R.drawable.d), "Drink 4", " Putu Guna", "This is the best drink in the world."));
        mList.add(new ImageModel(String.valueOf(R.drawable.e), "Drink 5", " Putu Guna", "This is the best drink in the world."));
        mList.add(new ImageModel(String.valueOf(R.drawable.f), "Packet 1", " putuguna.com", "This is the best packet in the world."));


        mAdapter = new ImageAdapter(mList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);
    }
}
