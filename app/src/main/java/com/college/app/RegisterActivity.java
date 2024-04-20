package com.college.app;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
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
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class RegisterActivity extends AppCompatActivity {
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private HashMap<String, Object> map = new HashMap<>();
	private String collage_code = "";
	
	private ArrayList<String> chechreg = new ArrayList<>();
	private ArrayList<String> course = new ArrayList<>();
	private ArrayList<String> sec = new ArrayList<>();
	
	private ScrollView scroll;
	private LinearLayout linear_main;
	private LinearLayout l_name;
	private LinearLayout l_number;
	private LinearLayout l_code;
	private LinearLayout l_reg;
	private LinearLayout l_dob;
	private LinearLayout linear4;
	private LinearLayout l_email;
	private LinearLayout l_pass;
	private LinearLayout button_continue;
	private LinearLayout div;
	private LinearLayout button_mode;
	private ImageView im_name;
	private EditText tx_name;
	private ImageView imageview1;
	private EditText tx_number;
	private ImageView imageview2;
	private EditText tx_code;
	private ImageView imageview3;
	private EditText tx_reg;
	private ImageView imageview4;
	private EditText edittext_date;
	private ImageView image_click;
	private Spinner spinner1;
	private Spinner spinner2;
	private ImageView im_email;
	private EditText tx_email;
	private ImageView im_pass;
	private EditText tx_password;
	private TextView button_text;
	private LinearLayout devider1;
	private TextView tx_inf;
	private LinearLayout devider2;
	private TextView tx_mode;
	
	private FirebaseAuth fauth;
	private OnCompleteListener<AuthResult> _fauth_create_user_listener;
	private OnCompleteListener<AuthResult> _fauth_sign_in_listener;
	private OnCompleteListener<Void> _fauth_reset_password_listener;
	private OnCompleteListener<Void> fauth_updateEmailListener;
	private OnCompleteListener<Void> fauth_updatePasswordListener;
	private OnCompleteListener<Void> fauth_emailVerificationSentListener;
	private OnCompleteListener<Void> fauth_deleteUserListener;
	private OnCompleteListener<Void> fauth_updateProfileListener;
	private OnCompleteListener<AuthResult> fauth_phoneAuthListener;
	private OnCompleteListener<AuthResult> fauth_googleSignInListener;
	
	private DatabaseReference user = _firebase.getReference("user");
	private ChildEventListener _user_child_listener;
	private Intent i = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.register);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		scroll = findViewById(R.id.scroll);
		linear_main = findViewById(R.id.linear_main);
		l_name = findViewById(R.id.l_name);
		l_number = findViewById(R.id.l_number);
		l_code = findViewById(R.id.l_code);
		l_reg = findViewById(R.id.l_reg);
		l_dob = findViewById(R.id.l_dob);
		linear4 = findViewById(R.id.linear4);
		l_email = findViewById(R.id.l_email);
		l_pass = findViewById(R.id.l_pass);
		button_continue = findViewById(R.id.button_continue);
		div = findViewById(R.id.div);
		button_mode = findViewById(R.id.button_mode);
		im_name = findViewById(R.id.im_name);
		tx_name = findViewById(R.id.tx_name);
		imageview1 = findViewById(R.id.imageview1);
		tx_number = findViewById(R.id.tx_number);
		imageview2 = findViewById(R.id.imageview2);
		tx_code = findViewById(R.id.tx_code);
		imageview3 = findViewById(R.id.imageview3);
		tx_reg = findViewById(R.id.tx_reg);
		imageview4 = findViewById(R.id.imageview4);
		edittext_date = findViewById(R.id.edittext_date);
		image_click = findViewById(R.id.image_click);
		spinner1 = findViewById(R.id.spinner1);
		spinner2 = findViewById(R.id.spinner2);
		im_email = findViewById(R.id.im_email);
		tx_email = findViewById(R.id.tx_email);
		im_pass = findViewById(R.id.im_pass);
		tx_password = findViewById(R.id.tx_password);
		button_text = findViewById(R.id.button_text);
		devider1 = findViewById(R.id.devider1);
		tx_inf = findViewById(R.id.tx_inf);
		devider2 = findViewById(R.id.devider2);
		tx_mode = findViewById(R.id.tx_mode);
		fauth = FirebaseAuth.getInstance();
		
		button_continue.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (tx_name.getText().toString().equals("")) {
					_setError(tx_name, "Enter name");
				}
				else {
					if (tx_number.getText().toString().equals("")) {
						_setError(tx_number, "Enter number");
					}
					else {
						if (tx_code.getText().toString().equals("")) {
							_setError(tx_code, "Enter code");
						}
						else {
							if (tx_reg.getText().toString().equals("")) {
								_setError(tx_reg, "Enter Register no");
							}
							else {
								if (chechreg.contains(tx_reg.getText().toString())) {
									_setError(tx_reg, "Register number already exist");
								}
								else {
									if (edittext_date.getText().toString().equals("")) {
										_setError(edittext_date, "Enter date of birth");
									}
									else {
										if (tx_email.getText().toString().equals("")) {
											_setError(tx_email, "Enter email");
										}
										else {
											if (tx_password.getText().toString().equals("")) {
												_setError(tx_password, "Enter password");
											}
											else {
												if (collage_code.equals("")) {
													_setError(tx_code, "Invalid collage code");
												}
												else {
													if (tx_code.getText().toString().equals(collage_code)) {
														fauth.createUserWithEmailAndPassword(tx_email.getText().toString(), tx_password.getText().toString()).addOnCompleteListener(RegisterActivity.this, _fauth_create_user_listener);
													}
													else {
														_setError(tx_code, "Invalid collage code");
													}
												}
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
		
		button_mode.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		image_click.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				androidx.appcompat.app.AppCompatDialogFragment newFragment = new DatePickerFragment();
				
				newFragment.show(getSupportFragmentManager(), "Date Picker");
			}
		});
		
		_user_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				chechreg.add(_childValue.get("register number").toString());
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		user.addChildEventListener(_user_child_listener);
		
		fauth_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		fauth_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_fauth_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				if (_success) {
					fauth.getCurrentUser().sendEmailVerification() .addOnCompleteListener(new OnCompleteListener<Void>() {
						@Override
						public void onComplete(Task<Void> task) {
							if (task.isSuccessful()) {
								showMessage("Email sent."); } else {
								showMessage ("Error sending email");}
						} });
					map = new HashMap<>();
					map.put("name", tx_name.getText().toString());
					map.put("number", tx_number.getText().toString());
					map.put("register number", tx_reg.getText().toString());
					map.put("dob", edittext_date.getText().toString());
					map.put("email", tx_email.getText().toString());
					map.put("password", tx_password.getText().toString());
					map.put("admin", "false");
					map.put("verification", "false");
					map.put("banned", "false");
					map.put("uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
					map.put("course", course.get((int)(spinner1.getSelectedItemPosition())));
					map.put("sec", course.get((int)(spinner2.getSelectedItemPosition())));
					user.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).updateChildren(map);
					map.clear();
					final com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = new com.google.android.material.bottomsheet.BottomSheetDialog(RegisterActivity.this);
					
					View bottomSheetView; bottomSheetView = getLayoutInflater().inflate(R.layout.bottom_sheet_p5,null );
					bottomSheetDialog.setContentView(bottomSheetView);
					
					bottomSheetDialog.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
					TextView t1 = (TextView) bottomSheetView.findViewById(R.id.t1);
					
					TextView t2 = (TextView) bottomSheetView.findViewById(R.id.t2);
					
					TextView b1 = (TextView) bottomSheetView.findViewById(R.id.b1);
					
					TextView b2 = (TextView) bottomSheetView.findViewById(R.id.b2);
					
					ImageView i1 = (ImageView) bottomSheetView.findViewById(R.id.i1);
					
					LinearLayout bg = (LinearLayout) bottomSheetView.findViewById(R.id.bg);
					i1.setImageResource(R.drawable.thumb_1);
					t1.setText("Anikethana");
					t2.setText("Verification link sent to your email address");
					b1.setText("cancel");
					b2.setText("Check my email");
					_RoundAndBorder(i1, "#D50000", 0, "#D50000", 100);
					_rippleRoundStroke(bg, "#FFFFFF", "#000000", 15, 0, "#000000");
					_rippleRoundStroke(b1, "#FFFFFF", "#EEEEEE", 15, 2.5d, "#EEEEEE");
					_rippleRoundStroke(b2, "#D50000", "#40FFFFFF", 15, 0, "#000000");
					i1.setElevation((float)0.1d);
					_ICC(i1, "#FFFFFF", "#FFFFFF");
					b1.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
							bottomSheetDialog.dismiss();
							i.setClass(getApplicationContext(), LoginActivity.class);
							startActivity(i);
						}
					});
					b2.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
							bottomSheetDialog.dismiss();
							i.setAction(Intent.ACTION_VIEW);
							i.setData(Uri.parse("https://mail.google.com/mail/u/0/#inbox"));
							startActivity(i);
						}
					});
					bottomSheetDialog.setCancelable(false);
					bottomSheetDialog.show();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), _errorMessage);
				}
			}
		};
		
		_fauth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_fauth_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	
	private void initializeLogic() {
		_UI();
		collage_code = "pp158";
		course.add("Select Combination");
		course.add("pcmb");
		course.add("pcmcs");
		course.add("commerce");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, course));
		((ArrayAdapter)spinner1.getAdapter()).notifyDataSetChanged();
		sec.add("Select Class and section");
		sec.add("1st A sec");
		sec.add("1st B sec");
		sec.add("1st C sec");
		sec.add("1st D sec");
		sec.add("2nd A sec");
		sec.add("2nd B sec");
		sec.add("2nd C sec");
		sec.add("2nd D sec");
		sec.add("2nd E sec");
		spinner2.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, sec));
		((ArrayAdapter)spinner2.getAdapter()).notifyDataSetChanged();
	}
	
	public void _UI() {
		_Shadow(0, 100, "#EEEEEE", l_name);
		_Shadow(0, 100, "#EEEEEE", l_number);
		_Shadow(0, 100, "#EEEEEE", l_code);
		_Shadow(0, 100, "#EEEEEE", l_reg);
		_Shadow(0, 100, "#EEEEEE", l_dob);
		_Shadow(0, 100, "#EEEEEE", l_email);
		_Shadow(0, 100, "#EEEEEE", l_pass);
		im_email.setColorFilter(0xFF000000, PorterDuff.Mode.MULTIPLY);
		im_pass.setColorFilter(0xFF000000, PorterDuff.Mode.MULTIPLY);
		im_name.setColorFilter(0xFF000000, PorterDuff.Mode.MULTIPLY);
		_rippleRoundStroke(button_continue, "#00BCD4", "#0097A7", 100, 0, "#00BCD4");
		_rippleRoundStroke(button_mode, "#EEEEEE", "#BDBDBD", 100, 0, "#EEEEEE");
	}
	
	
	public void _Shadow(final double _sadw, final double _cru, final String _wc, final View _widgets) {
		android.graphics.drawable.GradientDrawable wd = new android.graphics.drawable.GradientDrawable();
		wd.setColor(Color.parseColor(_wc));
		wd.setCornerRadius((int)_cru);
		_widgets.setElevation((int)_sadw);
		_widgets.setBackground(wd);
	}
	
	
	public void _rippleRoundStroke(final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}
	
	
	public void _ICC(final ImageView _img, final String _c1, final String _c2) {
		_img.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor(_c1), Color.parseColor(_c2)}));
	}
	
	
	public void _RoundAndBorder(final View _view, final String _color1, final double _border, final String _color2, final double _round) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color1));
		gd.setCornerRadius((int) _round);
		gd.setStroke((int) _border, Color.parseColor(_color2));
		_view.setBackground(gd);
	}
	
	
	public void _setError(final View _v, final String _message) {
		try {
			EditText edit = (EditText)_v;
			edit.setError(_message);
		} catch(Exception e) {
			showMessage(e.toString());
		}
	}
	
	
	public void _Extra() {
	}
	public static class DatePickerFragment extends androidx.appcompat.app.AppCompatDialogFragment implements DatePickerDialog.OnDateSetListener {
		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {
			final Calendar c = Calendar.getInstance();
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH);
			int day = c.get(Calendar.DAY_OF_MONTH);
			return new DatePickerDialog(getActivity(), AlertDialog.THEME_DEVICE_DEFAULT_DARK , this, year, month, day);
		}
		public void onDateSet(DatePicker view, int year, int month, int day) {
			int mon = month +1;
			String date = day + "/" + mon + "/" + year;
			EditText edittext_date = (EditText) getActivity().findViewById(R.id.edittext_date);
			edittext_date.setText(date);
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