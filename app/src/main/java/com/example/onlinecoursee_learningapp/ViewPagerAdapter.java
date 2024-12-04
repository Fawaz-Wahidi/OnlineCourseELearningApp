package com.example.onlinecoursee_learningapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import com.example.onlinecoursee_learningapp.R;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;

    int[] images = {R.drawable.second, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background};
    String[] titles = {"Title 1", "Title 2", "Title 3"};
    String[] descriptions = {"Description 1", "Description 2", "Description 3"};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_slider, container, false);

        ImageView imageView = view.findViewById(R.id.sliderImage);
        TextView titleView = view.findViewById(R.id.sliderTitle);
        TextView descView = view.findViewById(R.id.sliderDesc);

        imageView.setImageResource(images[position]);
        titleView.setText(titles[position]);
        descView.setText(descriptions[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
