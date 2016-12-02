package id.sch.smktelkom_mlg.project.xirpl209182736.modulmoklet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {

    private List<ImageModel> mListImage;
    private Context mContext;


    public ImageAdapter(List<ImageModel> mListImage, Context mContext) {
        this.mListImage = mListImage;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mImageProduct.setImageResource(Integer.parseInt(mListImage.get(position).getmImage()));
        holder.mNameOfImage.setText(mListImage.get(position).getmImageName());
        holder.mNameOfOwner.setText(mListImage.get(position).getmImageOwnerName());
    }

    @Override
    public int getItemCount() {
        return mListImage.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView mImageProduct;
        public TextView mNameOfImage;
        public TextView mNameOfOwner;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageProduct = (ImageView) itemView.findViewById(R.id.imagedetail);
            mNameOfImage = (TextView) itemView.findViewById(R.id.name_of_picture);
            mNameOfOwner = (TextView) itemView.findViewById(R.id.name_of_owner);
            mImageProduct.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();

            ActivityOptionsCompat options =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                            ((Activity) mContext), mImageProduct, SecondActivity.TAG_IMAGE_NAME);
            Intent intent = new Intent(mContext, SecondActivity.class);
            intent.putExtra("image", mListImage.get(position).getmImage());
            intent.putExtra("name-image", mListImage.get(position).getmImageName());
            intent.putExtra("owner-name", mListImage.get(position).getmImageOwnerName());
            intent.putExtra("desc", mListImage.get(position).getmDesc());
            ActivityCompat.startActivity(((Activity) mContext), intent, options.toBundle());

        }
    }
}