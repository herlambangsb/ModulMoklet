package id.sch.smktelkom_mlg.project.xirpl209182736.modulmoklet;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static String TAG_IMAGE_NAME = "tag_image_name";

    private ImageView mImage;
    private TextView mNameOfImage;
    private TextView mNameOfOwner;
    private TextView mDesc;
    private Button dwdbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_layout);

        mImage = (ImageView) findViewById(R.id.detail_image);
        mNameOfImage = (TextView) findViewById(R.id.name_image);
        mNameOfOwner = (TextView) findViewById(R.id.name_owner);
        mDesc = (TextView) findViewById(R.id.desc);
        dwdbutton = (Button) findViewById(R.id.download);

        String image = getIntent().getStringExtra("image");
        String imageName = getIntent().getStringExtra("name-image");
        String ownerName = getIntent().getStringExtra("owner-name");
        String desc = getIntent().getStringExtra("desc");

        findViewById(R.id.download).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage("http://www.google.com");
            }
        });

        ViewCompat.setTransitionName(mImage, TAG_IMAGE_NAME);

        mImage.setImageResource(Integer.parseInt(image));
        mNameOfImage.setText(imageName);
        mNameOfOwner.setText(ownerName);
        mDesc.setText(desc);
    }

    private void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) startActivity(intent);
    }
}
