package com.example.photogallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    //Context variable to turn image reference ino imageview object
    private Context mContext;
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }
    public long getItemId(int position) {
        return 0;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }
        else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    //Keep all Imagein array
    public Integer[] mThumbIds = {
            R.drawable.image_0, R.drawable.image_1,
            R.drawable.image_2, R.drawable.image_3,
            R.drawable.image_4, R.drawable.image_5,
            R.drawable.image_0, R.drawable.image_1,
            R.drawable.image_2, R.drawable.image_3,
            R.drawable.image_4, R.drawable.image_5,
            R.drawable.image_0, R.drawable.image_1,
            R.drawable.image_2, R.drawable.image_3,
            R.drawable.image_4, R.drawable.image_5
    };
}
