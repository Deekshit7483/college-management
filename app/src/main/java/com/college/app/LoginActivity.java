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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class LoginActivity extends AppCompatActivity {
	
	private boolean emailVerified = false;
	
	private ScrollView scroll;
	private LinearLayout linear_main;
	private TextView tx_title;
	private LinearLayout l_email;
	private LinearLayout l_pass;
	private LinearLayout button_continue;
	private LinearLayout div;
	private LinearLayout button_mode;
	private ImageView im_email;
	private EditText tx_email;
	private ImageView im_pass;
	private EditText tx_password;
	private ImageView im_forget_pass;
	private TextView button_text;
	private LinearLayout devider1;
	private TextView tx_inf;
	private LinearLayout devider2;
	private TextView tx_mode;
	
	private Intent i = new Intent();
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
	
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.login);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		scroll = findViewById(R.id.scroll);
		linear_main = findViewById(R.id.linear_main);
		tx_title = findViewById(R.id.tx_title);
		l_email = findViewById(R.id.l_email);
		l_pass = findViewById(R.id.l_pass);
		button_continue = findViewById(R.id.button_continue);
		div = findViewById(R.id.div);
		button_mode = findViewById(R.id.button_mode);
		im_email = findViewById(R.id.im_email);
		tx_email = findViewById(R.id.tx_email);
		im_pass = findViewById(R.id.im_pass);
		tx_password = findViewById(R.id.tx_password);
		im_forget_pass = findViewById(R.id.im_forget_pass);
		button_text = findViewById(R.id.button_text);
		devider1 = findViewById(R.id.devider1);
		tx_inf = findViewById(R.id.tx_inf);
		devider2 = findViewById(R.id.devider2);
		tx_mode = findViewById(R.id.tx_mode);
		fauth = FirebaseAuth.getInstance();
		
		button_continue.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (tx_email.getText().toString().equals("")) {
					_setError(tx_email, "Enter email");
				}
				else {
					if (tx_password.getText().toString().equals("")) {
						_setError(tx_password, "Enter password");
					}
					else {
						fauth.signInWithEmailAndPassword(tx_email.getText().toString(), tx_password.getText().toString()).addOnCompleteListener(LoginActivity.this, _fauth_sign_in_listener);
					}
				}
			}
		});
		
		button_mode.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), RegisterActivity.class);
				startActivity(i);
			}
		});
		
		im_forget_pass.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ForgetPasswordActivity.class);
				startActivity(i);
			}
		});
		
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
				
			}
		};
		
		_fauth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				if (_success) {
					emailVerified = fauth.getCurrentUser().isEmailVerified();
					if (emailVerified) {
						i.setClass(getApplicationContext(), HomeActivity.class);
						startActivity(i);
					}
					else {
						final com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = new com.google.android.material.bottomsheet.BottomSheetDialog(LoginActivity.this);
						
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
						t2.setText("Your email not verified. Please verify your email id. ");
						b1.setText("exit");
						b2.setText("Check my email");
						_RoundAndBorder(i1, "#D50000", 0, "#D50000", 100);
						_rippleRoundStroke(bg, "#FFFFFF", "#000000", 15, 0, "#000000");
						_rippleRoundStroke(b1, "#FFFFFF", "#EEEEEE", 15, 2.5d, "#EEEEEE");
						_rippleRoundStroke(b2, "#D50000", "#40FFFFFF", 15, 0, "#000000");
						i1.setElevation((float)0.1d);
						_ICC(i1, "#FFFFFF", "#FFFFFF");
						b1.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
								bottomSheetDialog.dismiss();
								finishAffinity();
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
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), _errorMessage);
				}
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
		if ((FirebaseAuth.getInstance().getCurrentUser() != null)) {
			emailVerified = fauth.getCurrentUser().isEmailVerified();
			if (emailVerified) {
				i.setClass(getApplicationContext(), HomeActivity.class);
				startActivity(i);
			}
			else {
				
			}
		}
	}
	
	@Override
	public void onBackPressed() {
		finishAffinity();
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
	
	
	public void _UI() {
		_Shadow(0, 100, "#EEEEEE", l_email);
		_Shadow(0, 100, "#EEEEEE", l_pass);
		im_email.setColorFilter(0xFF000000, PorterDuff.Mode.MULTIPLY);
		im_pass.setColorFilter(0xFF000000, PorterDuff.Mode.MULTIPLY);
		im_forget_pass.setColorFilter(0xFF000000, PorterDuff.Mode.MULTIPLY);
		_rippleRoundStroke(button_continue, "#00BCD4", "#0097A7", 100, 0, "#00BCD4");
		_rippleRoundStroke(button_mode, "#EEEEEE", "#BDBDBD", 100, 0, "#EEEEEE");
		_rippleRoundStroke(im_forget_pass, "#EEEEEE", "#BDBDBD", 100, 0, "#EEEEEE");
	}
	
	
	public void _Shadow(final double _sadw, final double _cru, final String _wc, final View _widgets) {
		android.graphics.drawable.GradientDrawable wd = new android.graphics.drawable.GradientDrawable();
		wd.setColor(Color.parseColor(_wc));
		wd.setCornerRadius((int)_cru);
		_widgets.setElevation((int)_sadw);
		_widgets.setBackground(wd);
	}
	
	
	public void _setError(final View _v, final String _message) {
		try {
			EditText edit = (EditText)_v;
			edit.setError(_message);
		} catch(Exception e) {
			showMessage(e.toString());
		}
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