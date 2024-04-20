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

public class SubjectYearsActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private TextView textview1;
	private LinearLayout linear2;
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
		setContentView(R.layout.subject_years);
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
		linear2 = findViewById(R.id.linear2);
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
					if (textview1.getText().toString().equals("Accountancy")) {
						i.setClass(getApplicationContext(), WebsiteActivity.class);
						web.edit().putString("link", "").commit();
						startActivity(i);
					}
					else {
						if (textview1.getText().toString().equals("Chemistry")) {
							i.setClass(getApplicationContext(), WebsiteActivity.class);
							web.edit().putString("link", "https://drive.google.com/file/d/1PR9tWfUrJqPyfwFpEaPH_B-NQjFalykz/view?usp=drivesdk").commit();
							startActivity(i);
						}
						else {
							if (textview1.getText().toString().equals("Business")) {
								i.setClass(getApplicationContext(), WebsiteActivity.class);
								web.edit().putString("link", "").commit();
								startActivity(i);
							}
							else {
								if (textview1.getText().toString().equals("Mathes")) {
									i.setClass(getApplicationContext(), WebsiteActivity.class);
									web.edit().putString("link", "https://drive.google.com/file/d/1PrVedHNqzoXh1Hf2hulFgjRnCyQnazgw/view?usp=drivesdk").commit();
									startActivity(i);
								}
								else {
									if (textview1.getText().toString().equals("Economics")) {
										i.setClass(getApplicationContext(), WebsiteActivity.class);
										web.edit().putString("link", "").commit();
										startActivity(i);
									}
									else {
										if (textview1.getText().toString().equals("Biology")) {
											i.setClass(getApplicationContext(), WebsiteActivity.class);
											web.edit().putString("link", "https://drive.google.com/file/d/1R9kIjXXDrVMkst48CY9nPNcQVQRjk5Nw/view?usp=drivesdk").commit();
											startActivity(i);
										}
										else {
											if (textview1.getText().toString().equals("Computer")) {
												i.setClass(getApplicationContext(), WebsiteActivity.class);
												web.edit().putString("link", "").commit();
												startActivity(i);
											}
										}
									}
								}
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
					web.edit().putString("link", "https://drive.google.com/file/d/1PHEgNrqwKdk2z2dkUy5-C8ZVFSep4Hf8/view?usp=drivesdk").commit();
					startActivity(i);
				}
				else {
					if (textview1.getText().toString().equals("Accountancy")) {
						i.setClass(getApplicationContext(), WebsiteActivity.class);
						web.edit().putString("link", "").commit();
						startActivity(i);
					}
					else {
						if (textview1.getText().toString().equals("Chemistry")) {
							i.setClass(getApplicationContext(), WebsiteActivity.class);
							web.edit().putString("link", "https://drive.google.com/file/d/1P_DABxJVmSAvacSQzHTN3CFGZpvf_uYh/view?usp=drivesdk").commit();
							startActivity(i);
						}
						else {
							if (textview1.getText().toString().equals("Business")) {
								i.setClass(getApplicationContext(), WebsiteActivity.class);
								web.edit().putString("link", "").commit();
								startActivity(i);
							}
							else {
								if (textview1.getText().toString().equals("Mathes")) {
									i.setClass(getApplicationContext(), WebsiteActivity.class);
									web.edit().putString("link", "https://drive.google.com/file/d/1Q4ogQaS7lSaltzAmojuZ5rD_ed2tLEhl/view?usp=drivesdk").commit();
									startActivity(i);
								}
								else {
									if (textview1.getText().toString().equals("Economics")) {
										i.setClass(getApplicationContext(), WebsiteActivity.class);
										web.edit().putString("link", "").commit();
										startActivity(i);
									}
									else {
										if (textview1.getText().toString().equals("Biology")) {
											i.setClass(getApplicationContext(), WebsiteActivity.class);
											web.edit().putString("link", "https://drive.google.com/file/d/1RWh0COCWrZ3sGoK335JWWzDmg-_Fvasy/view?usp=drivesdk").commit();
											startActivity(i);
										}
										else {
											if (textview1.getText().toString().equals("Computer")) {
												i.setClass(getApplicationContext(), WebsiteActivity.class);
												web.edit().putString("link", "").commit();
												startActivity(i);
											}
										}
									}
								}
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
					web.edit().putString("link", "https://drive.google.com/file/d/1PGfOGWcfTxmzTjfnv4ZNFxNyMHVtsNhr/view?usp=drivesdk").commit();
					startActivity(i);
				}
				else {
					if (textview1.getText().toString().equals("Accountancy")) {
						i.setClass(getApplicationContext(), WebsiteActivity.class);
						web.edit().putString("link", "").commit();
						startActivity(i);
					}
					else {
						if (textview1.getText().toString().equals("Chemistry")) {
							i.setClass(getApplicationContext(), WebsiteActivity.class);
							web.edit().putString("link", "https://drive.google.com/file/d/1PdrqA3K0y56bbia6GpaJSBpMDbGDGtLp/view?usp=drivesdk").commit();
							startActivity(i);
						}
						else {
							if (textview1.getText().toString().equals("Business")) {
								i.setClass(getApplicationContext(), WebsiteActivity.class);
								web.edit().putString("link", "").commit();
								startActivity(i);
							}
							else {
								if (textview1.getText().toString().equals("Mathes")) {
									i.setClass(getApplicationContext(), WebsiteActivity.class);
									web.edit().putString("link", "https://drive.google.com/file/d/1Pt1ZDWtiX0W5F7aNmSxC7vmjRzJb5oFL/view?usp=drivesdk").commit();
									startActivity(i);
								}
								else {
									if (textview1.getText().toString().equals("Economics")) {
										i.setClass(getApplicationContext(), WebsiteActivity.class);
										web.edit().putString("link", "").commit();
										startActivity(i);
									}
									else {
										if (textview1.getText().toString().equals("Biology")) {
											i.setClass(getApplicationContext(), WebsiteActivity.class);
											web.edit().putString("link", "https://drive.google.com/file/d/1RUOu2NxuEgETkj_hh3ELRN2wU90iHc76/view?usp=drivesdk").commit();
											startActivity(i);
										}
										else {
											if (textview1.getText().toString().equals("Computer")) {
												i.setClass(getApplicationContext(), WebsiteActivity.class);
												web.edit().putString("link", "").commit();
												startActivity(i);
											}
										}
									}
								}
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
					web.edit().putString("link", "https://drive.google.com/file/d/1PAbHAnImdwviPv06TKYrmwqwwwWudUN0/view?usp=drivesdk").commit();
					startActivity(i);
				}
				else {
					if (textview1.getText().toString().equals("Accountancy")) {
						i.setClass(getApplicationContext(), WebsiteActivity.class);
						web.edit().putString("link", "").commit();
						startActivity(i);
					}
					else {
						if (textview1.getText().toString().equals("Chemistry")) {
							i.setClass(getApplicationContext(), WebsiteActivity.class);
							web.edit().putString("link", "https://drive.google.com/file/d/1PPm2qhLxojT7aYLiVWBIuGezacT3bIWe/view?usp=drivesdk").commit();
							startActivity(i);
						}
						else {
							if (textview1.getText().toString().equals("Business")) {
								i.setClass(getApplicationContext(), WebsiteActivity.class);
								web.edit().putString("link", "").commit();
								startActivity(i);
							}
							else {
								if (textview1.getText().toString().equals("Mathes")) {
									i.setClass(getApplicationContext(), WebsiteActivity.class);
									web.edit().putString("link", "https://drive.google.com/file/d/1PqZh6pfDrM-JtLzf9yeP6jzbBTJmnBAW/view?usp=drivesdk").commit();
									startActivity(i);
								}
								else {
									if (textview1.getText().toString().equals("Economics")) {
										i.setClass(getApplicationContext(), WebsiteActivity.class);
										web.edit().putString("link", "").commit();
										startActivity(i);
									}
									else {
										if (textview1.getText().toString().equals("Biology")) {
											i.setClass(getApplicationContext(), WebsiteActivity.class);
											web.edit().putString("link", "https://drive.google.com/file/d/1Qbxk0EkNnSS6Ew6vwP6UODi83Mty0m6Q/view?usp=drivesdk").commit();
											startActivity(i);
										}
										else {
											if (textview1.getText().toString().equals("Computer")) {
												i.setClass(getApplicationContext(), WebsiteActivity.class);
												web.edit().putString("link", "").commit();
												startActivity(i);
											}
										}
									}
								}
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
					web.edit().putString("link", "https://drive.google.com/file/d/1P6ZRULKCXkmG4mJRvm89IxHfTfhC62_j/view?usp=drivesdk").commit();
					startActivity(i);
				}
				else {
					if (textview1.getText().toString().equals("Accountancy")) {
						i.setClass(getApplicationContext(), WebsiteActivity.class);
						web.edit().putString("link", "").commit();
						startActivity(i);
					}
					else {
						if (textview1.getText().toString().equals("Chemistry")) {
							i.setClass(getApplicationContext(), WebsiteActivity.class);
							web.edit().putString("link", "https://drive.google.com/file/d/1PN47769BBHRZxEGCz0ZFFiYNGq0ysHeW/view?usp=drivesdk").commit();
							startActivity(i);
						}
						else {
							if (textview1.getText().toString().equals("Business")) {
								i.setClass(getApplicationContext(), WebsiteActivity.class);
								web.edit().putString("link", "").commit();
								startActivity(i);
							}
							else {
								if (textview1.getText().toString().equals("Mathes")) {
									i.setClass(getApplicationContext(), WebsiteActivity.class);
									web.edit().putString("link", "https://drive.google.com/file/d/1PrMLiqt58W0K9oF87PwQQtn3Ty8tnUy9/view?usp=drivesdk").commit();
									startActivity(i);
								}
								else {
									if (textview1.getText().toString().equals("Economics")) {
										i.setClass(getApplicationContext(), WebsiteActivity.class);
										web.edit().putString("link", "").commit();
										startActivity(i);
									}
									else {
										if (textview1.getText().toString().equals("Biology")) {
											i.setClass(getApplicationContext(), WebsiteActivity.class);
											web.edit().putString("link", "https://drive.google.com/file/d/1Qkfl154sC9GbVaxDVrTQzTVdpWyLNBSP/view?usp=drivesdk").commit();
											startActivity(i);
										}
										else {
											if (textview1.getText().toString().equals("Computer")) {
												i.setClass(getApplicationContext(), WebsiteActivity.class);
												web.edit().putString("link", "").commit();
												startActivity(i);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		});
	}
	
	private void initializeLogic() {
		button1.setText("2016");
		button2.setText("2017");
		button3.setText("2018");
		button4.setText("2019");
		button5.setText("2020");
		if (getIntent().getStringExtra("Subject").equals("Physics")) {
			textview1.setText("Physics");
		}
		else {
			if (getIntent().getStringExtra("Subject").equals("Accountancy")) {
				textview1.setText("Accountancy");
			}
			else {
				if (getIntent().getStringExtra("Subject").equals("Chemistry")) {
					textview1.setText("Chemistry");
				}
				else {
					if (getIntent().getStringExtra("Subject").equals("Business")) {
						textview1.setText("Business");
					}
					else {
						if (getIntent().getStringExtra("Subject").equals("Mathes")) {
							textview1.setText("Mathes");
						}
						else {
							if (getIntent().getStringExtra("Subject").equals("Economics")) {
								textview1.setText("Economics");
							}
							else {
								if (getIntent().getStringExtra("Subject").equals("Biology")) {
									textview1.setText("Biology");
								}
								else {
									if (getIntent().getStringExtra("Subject").equals("Computer")) {
										textview1.setText("Computer");
									}
								}
							}
						}
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