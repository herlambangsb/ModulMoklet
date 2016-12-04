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
        mList.add(new ImageModel(String.valueOf(R.drawable.a), "MODUL PPB", " Modul 1 Instalasi Software \n Modul 2 New Android Project \n Modul 3 Setup Emulator Device  \n Modul 4 Version Control System \n Modul 5 Widget Dasar \n\n Link \n", "https://drive.google.com/file/d/0B8C9oWT_mlbkb0dvY2NORXVpMW8/view"));
        mList.add(new ImageModel(String.valueOf(R.drawable.b), "MODUL PBO", " Modul 1 Java \n Modul 2 Program Dasar \n Modul 3 Inheritance \n Modul 4 Encapsulation \n Modul 5 Polymorphism", "https://drive.google.com/file/d/0B4NTpcy8JM6KQUxsMElRenBFb2c/view"));
        mList.add(new ImageModel(String.valueOf(R.drawable.c), "MODUL PPKN", " Modul 1 Kasus Pelanggaran HAM \n Modul 2 Ketentuan Konstitusi Kehidupan Berbangsa & Bernegara \n Modul 3 Dinamika Demokrasi \n Modul 4 Penyelenggaraan Kekuasaan \n Modul 5 Penegakan Hukum Indonesia", "https://drive.google.com/file/d/0Bz1pdl-Hrw0uRkFUenB3VFlwNGM/view"));
        mList.add(new ImageModel(String.valueOf(R.drawable.d), "MODUL PWD", " Modul 1 Pengenalan PHP \n Modul 2 Eksplorasi PHP \n Modul 3 Array dan Operator \n Modul 4 Percabangan \n Modul 5 Boostrap", "https://drive.google.com/file/d/0ByWHzF_RxJqqN0dsaXpQYjZRTHc/view"));
        mList.add(new ImageModel(String.valueOf(R.drawable.e), "MODUL PWD", " Modul 1 Pengenalan PHP \n Modul 2 Eksplorasi PHP \n Modul 3 Array dan Operator \n Modul 4 Percabangan \n Modul 5 Boostrap", "https://drive.google.com/file/d/0ByWHzF_RxJqqN0dsaXpQYjZRTHc/view"));
        mList.add(new ImageModel(String.valueOf(R.drawable.f), "MODUL PWD", " Modul 1 Pengenalan PHP \n Modul 2 Eksplorasi PHP \n Modul 3 Array dan Operator \n Modul 4 Percabangan \n Modul 5 Boostrap", "https://drive.google.com/file/d/0ByWHzF_RxJqqN0dsaXpQYjZRTHc/view"));
        mList.add(new ImageModel(String.valueOf(R.drawable.g), "MODUL PWD", " Modul 1 Pengenalan PHP \n Modul 2 Eksplorasi PHP \n Modul 3 Array dan Operator \n Modul 4 Percabangan \n Modul 5 Boostrap", "https://drive.google.com/file/d/0ByWHzF_RxJqqN0dsaXpQYjZRTHc/view"));


        mAdapter = new ImageAdapter(mList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);
    }
}
