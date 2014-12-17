package com.example.imagegallery;


import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ImageGalleryActivity extends Activity {

	private Integer images [] = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image_gallery);
		addImagesToThegallery();
	}

	private void addImagesToThegallery() {
		LinearLayout imageGallery = (LinearLayout)findViewById(R.id.imageGallery);
		for(Integer image : images) {
			imageGallery.addView(getImageView(image));
		}
		
	}

	private View getImageView(Integer image) {
		ImageView imageView = new ImageView(getApplicationContext());
		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		lp.setMargins(0, 0, 10, 0);
		imageView.setLayoutParams(lp);
		imageView.setImageResource(image);
		return imageView;
	}

}
