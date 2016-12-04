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
        mList.add(new ImageModel(String.valueOf(R.drawable.a), "MODUL PPB", " Modul 1 \n Modul 2 \n Modul 3 \n Modul 4 \n Modul 5", "http://youtube.com"));
        mList.add(new ImageModel(String.valueOf(R.drawable.b), "MODUL PBO", " Modul 1 \n Modul 2 \n Modul 3 \n Modul 4 \n Modul 5", "."));
        mList.add(new ImageModel(String.valueOf(R.drawable.c), "MODUL PWD", " Modul 1 \n Modul 2 \n Modul 3 \n Modul 4 \n Modul 5", "This is the best drink in the world."));
        mList.add(new ImageModel(String.valueOf(R.drawable.d), "MODUL DESKTOP", " Modul 1 \n Modul 2 \n Modul 3 \n Modul 4 \n Modul 5", "This is the best drink in the world."));


        mAdapter = new ImageAdapter(mList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);
    }
}
