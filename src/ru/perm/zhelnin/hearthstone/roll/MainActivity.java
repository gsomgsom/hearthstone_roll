package ru.perm.zhelnin.hearthstone.roll;

import java.util.Random;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	Button buttonRoll;
	ImageView image1;
	ImageView image2;
	TextView text1;
	TextView text2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListenerOnButton();
		Roll();
	}

	public void addListenerOnButton() {
		image1 = (ImageView) findViewById(R.id.imageViewPlayer1);
		image2 = (ImageView) findViewById(R.id.imageViewPlayer2);
		text1 = (TextView) findViewById(R.id.textViewPlayer1);
		text2 = (TextView) findViewById(R.id.textViewPlayer2);

		buttonRoll = (Button) findViewById(R.id.btnRoll);

		buttonRoll.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Roll();
			}

		});

	}

	private void Roll() {
		Random randInt = new Random();
		String imgName;
		String textName;
		int classRand;
		int id;

		classRand = randInt.nextInt(9) + 1;
		imgName = "class" + String.valueOf(classRand);
		id = getResources()
				.getIdentifier(imgName, "drawable", getPackageName());
		image1.setImageResource(id);
		textName = "class" + String.valueOf(classRand) + "_name";
		id = getResources().getIdentifier(textName, "string", getPackageName());
		text1.setText(id);

		classRand = randInt.nextInt(9) + 1;
		imgName = "class" + String.valueOf(classRand);
		id = getResources()
				.getIdentifier(imgName, "drawable", getPackageName());
		image2.setImageResource(id);
		textName = "class" + String.valueOf(classRand) + "_name";
		id = getResources().getIdentifier(textName, "string", getPackageName());
		text2.setText(id);
	}

}
