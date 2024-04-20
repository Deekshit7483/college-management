package com.college.app;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.FirebaseApp;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class CetYearsActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private TextView textview1;
	private LinearLayout linear1;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	
	private Intent i = new Intent();
	private SharedPreferences web;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.cet_years);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		textview1 = findViewById(R.id.textview1);
		linear1 = findViewById(R.id.linear1);
		button1 = findViewById(R.id.button1);
		button2 = findViewById(R.id.button2);
		button3 = findViewById(R.id.button3);
		button4 = findViewById(R.id.button4);
		button5 = findViewById(R.id.button5);
		web = getSharedPreferences("web", Activity.MODE_PRIVATE);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (textview1.getText().toString().equals("Physics")) {
					i.setClass(getApplicationContext(), WebsiteActivity.class);
					web.edit().putString("link", "https://drive.google.com/file/d/1PD-LeHp15Gm4Ym08J0UzYU_PEjmzN0-r/view?usp=drivesdk").commit();
					startActivity(i);
				}
				else {
					if (textview1.getText().toString().equals("Chemistry")) {
						i.setClass(getApplicationContext(), WebsiteActivity.class);
						web.edit().putString("link", "").commit();
						startActivity(i);
					}
					else {
						if (textview1.getText().toString().equals("Mathes")) {
							i.setClass(getApplicationContext(), WebsiteActivity.class);
							web.edit().putString("link", "").commit();
							startActivity(i);
						}
						else {
							if (textview1.getText().toString().equals("Biology")) {
								i.setClass(getApplicationContext(), WebsiteActivity.class);
								web.edit().putString("link", "").commit();
								startActivity(i);
							}
						}
					}
				}
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (textview1.getText().toString().equals("Physics")) {
					i.setClass(getApplicationContext(), WebsiteActivity.class);
					web.edit().putString("link", "https://drive.google.com/file/d/1PD-LeHp15Gm4Ym08J0UzYU_PEjmzN0-r/view?usp=drivesdk").commit();
					startActivity(i);
				}
				else {
					if (textview1.getText().toString().equals("Chemistry")) {
						i.setClass(getApplicationContext(), WebsiteActivity.class);
						web.edit().putString("link", "").commit();
						startActivity(i);
					}
					else {
						if (textview1.getText().toString().equals("Mathes")) {
							i.setClass(getApplicationContext(), WebsiteActivity.class);
							web.edit().putString("link", "").commit();
							startActivity(i);
						}
						else {
							if (textview1.getText().toString().equals("Biology")) {
								i.setClass(getApplicationContext(), WebsiteActivity.class);
								web.edit().putString("link", "").commit();
								startActivity(i);
							}
						}
					}
				}
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (textview1.getText().toString().equals("Physics")) {
					i.setClass(getApplicationContext(), WebsiteActivity.class);
					web.edit().putString("link", "https://drive.google.com/file/d/1PD-LeHp15Gm4Ym08J0UzYU_PEjmzN0-r/view?usp=drivesdk").commit();
					startActivity(i);
				}
				else {
					if (textview1.getText().toString().equals("Chemistry")) {
						i.setClass(getApplicationContext(), WebsiteActivity.class);
						web.edit().putString("link", "").commit();
						startActivity(i);
					}
					else {
						if (textview1.getText().toString().equals("Mathes")) {
							i.setClass(getApplicationContext(), WebsiteActivity.class);
							web.edit().putString("link", "").commit();
							startActivity(i);
						}
						else {
							if (textview1.getText().toString().equals("Biology")) {
								i.setClass(getApplicationContext(), WebsiteActivity.class);
								web.edit().putString("link", "").commit();
								startActivity(i);
							}
						}
					}
				}
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (textview1.getText().toString().equals("Physics")) {
					i.setClass(getApplicationContext(), WebsiteActivity.class);
					web.edit().putString("link", "https://drive.google.com/file/d/1PD-LeHp15Gm4Ym08J0UzYU_PEjmzN0-r/view?usp=drivesdk").commit();
					startActivity(i);
				}
				else {
					if (textview1.getText().toString().equals("Chemistry")) {
						i.setClass(getApplicationContext(), WebsiteActivity.class);
						web.edit().putString("link", "").commit();
						startActivity(i);
					}
					else {
						if (textview1.getText().toString().equals("Mathes")) {
							i.setClass(getApplicationContext(), WebsiteActivity.class);
							web.edit().putString("link", "").commit();
							startActivity(i);
						}
						else {
							if (textview1.getText().toString().equals("Biology")) {
								i.setClass(getApplicationContext(), WebsiteActivity.class);
								web.edit().putString("link", "").commit();
								startActivity(i);
							}
						}
					}
				}
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (textview1.getText().toString().equals("Physics")) {
					i.setClass(getApplicationContext(), WebsiteActivity.class);
					web.edit().putString("link", "https://drive.google.com/file/d/1PD-LeHp15Gm4Ym08J0UzYU_PEjmzN0-r/view?usp=drivesdk").commit();
					startActivity(i);
				}
				else {
					if (textview1.getText().toString().equals("Chemistry")) {
						i.setClass(getApplicationContext(), WebsiteActivity.class);
						web.edit().putString("link", "").commit();
						startActivity(i);
					}
					else {
						if (textview1.getText().toString().equals("Mathes")) {
							i.setClass(getApplicationContext(), WebsiteActivity.class);
							web.edit().putString("link", "").commit();
							startActivity(i);
						}
						else {
							if (textview1.getText().toString().equals("Biology")) {
								i.setClass(getApplicationContext(), WebsiteActivity.class);
								web.edit().putString("link", "").commit();
								startActivity(i);
							}
						}
					}
				}
			}
		});
	}
	
	private void initializeLogic() {
		if (getIntent().getStringExtra("cet").equals("Physics")) {
			textview1.setText("Physics");
		}
		else {
			if (getIntent().getStringExtra("cet").equals("Chemistry")) {
				textview1.setText("Chemistry");
			}
			else {
				if (getIntent().getStringExtra("cet").equals("Mathes")) {
					textview1.setText("Mathes");
				}
				else {
					if (getIntent().getStringExtra("cet").equals("Biology")) {
						textview1.setText("Biology");
					}
				}
			}
		}
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}