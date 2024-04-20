package com.college.app;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
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
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.AppBarLayout;
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
import de.hdodenhof.circleimageview.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class HomeActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	private HashMap<String, Object> map = new HashMap<>();
	private double count = 0;
	
	private ScrollView vscroll1;
	private LinearLayout background;
	private LinearLayout linear1;
	private LinearLayout page1;
	private LinearLayout page2;
	private LinearLayout page3;
	private LinearLayout page4;
	private ScrollView vscroll2;
	private LinearLayout linear1038;
	private ImageView imageview53;
	private LinearLayout linear1037;
	private LinearLayout linear1039;
	private LinearLayout linear1056;
	private LinearLayout linear1060;
	private LinearLayout linear1055;
	private LinearLayout linear3s;
	private LinearLayout linear1038s;
	private LinearLayout linear1039s;
	private LinearLayout linear91s;
	private LinearLayout linear92s;
	private LinearLayout notes;
	private LinearLayout questionbank;
	private LinearLayout cet;
	private ImageView imageview54;
	private TextView textview4;
	private ImageView imageview55;
	private TextView textview5;
	private ImageView imageview56;
	private TextView textview7;
	private LinearLayout gallery;
	private LinearLayout vedio;
	private LinearLayout callender;
	private ImageView imageview57;
	private TextView textview8;
	private ImageView imageview58;
	private TextView textview9;
	private ImageView imageview59;
	private TextView textview10;
	private LinearLayout faculty;
	private LinearLayout sports;
	private LinearLayout abtcollege;
	private ImageView imageview60;
	private TextView textview11;
	private ImageView imageview61;
	private TextView textview12;
	private ImageView imageview62;
	private TextView textview13;
	private LinearLayout notice;
	private LinearLayout website;
	private ImageView imageview63;
	private TextView textview14;
	private ImageView imageview65;
	private TextView textview15;
	private ScrollView vscroll3;
	private LinearLayout linear1061;
	private WebView webview1;
	private TextView textview2;
	private TextView textview1;
	private LinearLayout back2;
	private LinearLayout back;
	private LinearLayout back3;
	private LinearLayout back4;
	private LinearLayout b2;
	private LinearLayout above2;
	private ImageView img2;
	private TextView t2;
	private LinearLayout b1;
	private LinearLayout above;
	private ImageView amg1;
	private TextView t1;
	private LinearLayout b3;
	private LinearLayout above3;
	private ImageView img3;
	private TextView t3;
	private LinearLayout b4;
	private LinearLayout above4;
	private ImageView img4;
	private TextView t4;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear2;
	private LinearLayout _drawer_linear4;
	private LinearLayout _drawer_linear5;
	private LinearLayout _drawer_linear6;
	private LinearLayout _drawer_linear8;
	private LinearLayout _drawer_linear11;
	private LinearLayout _drawer_contactus;
	private LinearLayout _drawer_linear9;
	private LinearLayout _drawer_abtdev;
	private LinearLayout _drawer_linear10;
	private LinearLayout _drawer_linear12;
	private CircleImageView _drawer_circleimageview2;
	private LinearLayout _drawer_linear3;
	private TextView _drawer_name;
	private TextView _drawer_regnum;
	private TextView _drawer_email;
	private ImageView _drawer_imageview1;
	private TextView _drawer_profile;
	private ImageView _drawer_imageview2;
	private TextView _drawer_attendence;
	private ImageView _drawer_imageview3;
	private TextView _drawer_announcement;
	private ImageView _drawer_imageview5;
	private TextView _drawer_transportation;
	private ImageView _drawer_imageview8;
	private TextView _drawer_share;
	private ImageView _drawer_imageview10;
	private TextView _drawer_textview2;
	private ImageView _drawer_imageview6;
	private TextView _drawer_help;
	private ImageView _drawer_imageview9;
	private TextView _drawer_textview1;
	private ImageView _drawer_imageview7;
	private TextView _drawer_logout;
	private ImageView _drawer_insta;
	private ImageView _drawer_facebook;
	private ImageView _drawer_wtsap;
	private ImageView _drawer_telegram;
	private ImageView _drawer_mail;
	
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
	private DatabaseReference banner_image = _firebase.getReference("banner_image");
	private ChildEventListener _banner_image_child_listener;
	private TimerTask timer;
	private Intent i = new Intent();
	private Intent email = new Intent();
	private AlertDialog.Builder logout;
	private SharedPreferences web;
	private Intent whatsapp = new Intent();
	private Intent telegram = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
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
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(HomeActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		vscroll1 = findViewById(R.id.vscroll1);
		background = findViewById(R.id.background);
		linear1 = findViewById(R.id.linear1);
		page1 = findViewById(R.id.page1);
		page2 = findViewById(R.id.page2);
		page3 = findViewById(R.id.page3);
		page4 = findViewById(R.id.page4);
		vscroll2 = findViewById(R.id.vscroll2);
		linear1038 = findViewById(R.id.linear1038);
		imageview53 = findViewById(R.id.imageview53);
		linear1037 = findViewById(R.id.linear1037);
		linear1039 = findViewById(R.id.linear1039);
		linear1056 = findViewById(R.id.linear1056);
		linear1060 = findViewById(R.id.linear1060);
		linear1055 = findViewById(R.id.linear1055);
		linear3s = findViewById(R.id.linear3s);
		linear1038s = findViewById(R.id.linear1038s);
		linear1039s = findViewById(R.id.linear1039s);
		linear91s = findViewById(R.id.linear91s);
		linear92s = findViewById(R.id.linear92s);
		notes = findViewById(R.id.notes);
		questionbank = findViewById(R.id.questionbank);
		cet = findViewById(R.id.cet);
		imageview54 = findViewById(R.id.imageview54);
		textview4 = findViewById(R.id.textview4);
		imageview55 = findViewById(R.id.imageview55);
		textview5 = findViewById(R.id.textview5);
		imageview56 = findViewById(R.id.imageview56);
		textview7 = findViewById(R.id.textview7);
		gallery = findViewById(R.id.gallery);
		vedio = findViewById(R.id.vedio);
		callender = findViewById(R.id.callender);
		imageview57 = findViewById(R.id.imageview57);
		textview8 = findViewById(R.id.textview8);
		imageview58 = findViewById(R.id.imageview58);
		textview9 = findViewById(R.id.textview9);
		imageview59 = findViewById(R.id.imageview59);
		textview10 = findViewById(R.id.textview10);
		faculty = findViewById(R.id.faculty);
		sports = findViewById(R.id.sports);
		abtcollege = findViewById(R.id.abtcollege);
		imageview60 = findViewById(R.id.imageview60);
		textview11 = findViewById(R.id.textview11);
		imageview61 = findViewById(R.id.imageview61);
		textview12 = findViewById(R.id.textview12);
		imageview62 = findViewById(R.id.imageview62);
		textview13 = findViewById(R.id.textview13);
		notice = findViewById(R.id.notice);
		website = findViewById(R.id.website);
		imageview63 = findViewById(R.id.imageview63);
		textview14 = findViewById(R.id.textview14);
		imageview65 = findViewById(R.id.imageview65);
		textview15 = findViewById(R.id.textview15);
		vscroll3 = findViewById(R.id.vscroll3);
		linear1061 = findViewById(R.id.linear1061);
		webview1 = findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		textview2 = findViewById(R.id.textview2);
		textview1 = findViewById(R.id.textview1);
		back2 = findViewById(R.id.back2);
		back = findViewById(R.id.back);
		back3 = findViewById(R.id.back3);
		back4 = findViewById(R.id.back4);
		b2 = findViewById(R.id.b2);
		above2 = findViewById(R.id.above2);
		img2 = findViewById(R.id.img2);
		t2 = findViewById(R.id.t2);
		b1 = findViewById(R.id.b1);
		above = findViewById(R.id.above);
		amg1 = findViewById(R.id.amg1);
		t1 = findViewById(R.id.t1);
		b3 = findViewById(R.id.b3);
		above3 = findViewById(R.id.above3);
		img3 = findViewById(R.id.img3);
		t3 = findViewById(R.id.t3);
		b4 = findViewById(R.id.b4);
		above4 = findViewById(R.id.above4);
		img4 = findViewById(R.id.img4);
		t4 = findViewById(R.id.t4);
		_drawer_linear1 = _nav_view.findViewById(R.id.linear1);
		_drawer_linear2 = _nav_view.findViewById(R.id.linear2);
		_drawer_linear4 = _nav_view.findViewById(R.id.linear4);
		_drawer_linear5 = _nav_view.findViewById(R.id.linear5);
		_drawer_linear6 = _nav_view.findViewById(R.id.linear6);
		_drawer_linear8 = _nav_view.findViewById(R.id.linear8);
		_drawer_linear11 = _nav_view.findViewById(R.id.linear11);
		_drawer_contactus = _nav_view.findViewById(R.id.contactus);
		_drawer_linear9 = _nav_view.findViewById(R.id.linear9);
		_drawer_abtdev = _nav_view.findViewById(R.id.abtdev);
		_drawer_linear10 = _nav_view.findViewById(R.id.linear10);
		_drawer_linear12 = _nav_view.findViewById(R.id.linear12);
		_drawer_circleimageview2 = _nav_view.findViewById(R.id.circleimageview2);
		_drawer_linear3 = _nav_view.findViewById(R.id.linear3);
		_drawer_name = _nav_view.findViewById(R.id.name);
		_drawer_regnum = _nav_view.findViewById(R.id.regnum);
		_drawer_email = _nav_view.findViewById(R.id.email);
		_drawer_imageview1 = _nav_view.findViewById(R.id.imageview1);
		_drawer_profile = _nav_view.findViewById(R.id.profile);
		_drawer_imageview2 = _nav_view.findViewById(R.id.imageview2);
		_drawer_attendence = _nav_view.findViewById(R.id.attendence);
		_drawer_imageview3 = _nav_view.findViewById(R.id.imageview3);
		_drawer_announcement = _nav_view.findViewById(R.id.announcement);
		_drawer_imageview5 = _nav_view.findViewById(R.id.imageview5);
		_drawer_transportation = _nav_view.findViewById(R.id.transportation);
		_drawer_imageview8 = _nav_view.findViewById(R.id.imageview8);
		_drawer_share = _nav_view.findViewById(R.id.share);
		_drawer_imageview10 = _nav_view.findViewById(R.id.imageview10);
		_drawer_textview2 = _nav_view.findViewById(R.id.textview2);
		_drawer_imageview6 = _nav_view.findViewById(R.id.imageview6);
		_drawer_help = _nav_view.findViewById(R.id.help);
		_drawer_imageview9 = _nav_view.findViewById(R.id.imageview9);
		_drawer_textview1 = _nav_view.findViewById(R.id.textview1);
		_drawer_imageview7 = _nav_view.findViewById(R.id.imageview7);
		_drawer_logout = _nav_view.findViewById(R.id.logout);
		_drawer_insta = _nav_view.findViewById(R.id.insta);
		_drawer_facebook = _nav_view.findViewById(R.id.facebook);
		_drawer_wtsap = _nav_view.findViewById(R.id.wtsap);
		_drawer_telegram = _nav_view.findViewById(R.id.telegram);
		_drawer_mail = _nav_view.findViewById(R.id.mail);
		fauth = FirebaseAuth.getInstance();
		logout = new AlertDialog.Builder(this);
		web = getSharedPreferences("web", Activity.MODE_PRIVATE);
		
		notes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), WebsiteActivity.class);
				web.edit().putString("link", "https://drive.google.com/file/d/1Qkfl154sC9GbVaxDVrTQzTVdpWyLNBSP/view?usp=drivesdk").commit();
				startActivity(i);
			}
		});
		
		questionbank.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ManageQuestionActivity.class);
				startActivity(i);
			}
		});
		
		cet.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), WebsiteActivity.class);
				web.edit().putString("link", "https://www.rayvila.com/g.php/210215165941").commit();
				startActivity(i);
			}
		});
		
		gallery.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), WebsiteActivity.class);
				web.edit().putString("link", "https://www.anikethanaschool.in/index.php?&page=gallery").commit();
				startActivity(i);
			}
		});
		
		vedio.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), WebsiteActivity.class);
				web.edit().putString("link", "https://drive.google.com/file/d/1SiuFCQgt6dAmYmZa_ZbmqMiE0yqWIMx7/view?usp=drivesdk").commit();
				startActivity(i);
			}
		});
		
		callender.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), WebsiteActivity.class);
				web.edit().putString("link", "https://drive.google.com/file/d/1SQl2Plq8yOgKSph1_l6skK8bkNCjHFTI/view?usp=drivesdk").commit();
				startActivity(i);
			}
		});
		
		faculty.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), WebsiteActivity.class);
				web.edit().putString("link", "https://www.anikethanaschool.in/index.php?&page=faculties").commit();
				startActivity(i);
			}
		});
		
		abtcollege.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), AboutcollegeActivity.class);
				startActivity(i);
			}
		});
		
		notice.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), AnnouncementActivity.class);
				startActivity(i);
			}
		});
		
		website.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), WebsiteActivity.class);
				web.edit().putString("link", "https://anikethanaschool.in/").commit();
				startActivity(i);
			}
		});
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
		
		above2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ObjectAnimator anim = ObjectAnimator.ofFloat(t2, "ScaleY", 0, 1);
				anim.setInterpolator(new BounceInterpolator()); 
				anim.setDuration(1000);
				anim.start();
				above3.setBackgroundColor(Color.TRANSPARENT);
				above.setBackgroundColor(Color.TRANSPARENT);
				above4.setBackgroundColor(Color.TRANSPARENT);
				_rippleRoundStroke(above2, "#3affffff", "#40FFFFFF", 20, 0, "#000000");
				t2.setTextColor(0xFFFFFFFF);
				t3.setTextColor(0xFFE0E0E0);
				t1.setTextColor(0xFFE0E0E0);
				t4.setTextColor(0xFFE0E0E0);
				_Icon_Colour(img2, "#ffffff");
				_Icon_Colour(img3, "#e0e0e0");
				_Icon_Colour(amg1, "#e0e0e0");
				_Icon_Colour(img4, "#e0e0e0");
				t2.setVisibility(View.VISIBLE);
				t1.setVisibility(View.GONE);
				t3.setVisibility(View.GONE);
				t4.setVisibility(View.GONE);
				page1.setVisibility(View.VISIBLE);
				page2.setVisibility(View.GONE);
				page3.setVisibility(View.GONE);
				page4.setVisibility(View.GONE);
			}
		});
		
		above.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ObjectAnimator anim = ObjectAnimator.ofFloat(t1, "ScaleY", 0, 1);
				anim.setInterpolator(new BounceInterpolator()); 
				anim.setDuration(1000);
				anim.start();
				above2.setBackgroundColor(Color.TRANSPARENT);
				above3.setBackgroundColor(Color.TRANSPARENT);
				above4.setBackgroundColor(Color.TRANSPARENT);
				_rippleRoundStroke(above, "#3affffff", "#40FFFFFF", 20, 0, "#000000");
				t1.setTextColor(0xFFFFFFFF);
				t2.setTextColor(0xFFE0E0E0);
				t3.setTextColor(0xFFE0E0E0);
				t4.setTextColor(0xFFE0E0E0);
				_Icon_Colour(amg1, "#ffffff");
				_Icon_Colour(img2, "#e0e0e0");
				_Icon_Colour(img3, "#e0e0e0");
				_Icon_Colour(img4, "#e0e0e0");
				t1.setVisibility(View.VISIBLE);
				t3.setVisibility(View.GONE);
				t2.setVisibility(View.GONE);
				t4.setVisibility(View.GONE);
				page1.setVisibility(View.GONE);
				page2.setVisibility(View.VISIBLE);
				page3.setVisibility(View.GONE);
				page4.setVisibility(View.GONE);
			}
		});
		
		above3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ObjectAnimator anim = ObjectAnimator.ofFloat(t3, "ScaleY", 0, 1);
				anim.setInterpolator(new BounceInterpolator()); 
				anim.setDuration(1000);
				anim.start();
				above2.setBackgroundColor(Color.TRANSPARENT);
				above.setBackgroundColor(Color.TRANSPARENT);
				above4.setBackgroundColor(Color.TRANSPARENT);
				_rippleRoundStroke(above3, "#3affffff", "#3affffff", 20, 0, "#000000");
				t3.setTextColor(0xFFFFFFFF);
				t2.setTextColor(0xFFE0E0E0);
				t1.setTextColor(0xFFE0E0E0);
				t4.setTextColor(0xFFE0E0E0);
				_Icon_Colour(img3, "#ffffff");
				_Icon_Colour(img2, "#e0e0e0");
				_Icon_Colour(amg1, "#e0e0e0");
				_Icon_Colour(img4, "#e0e0e0");
				t3.setVisibility(View.VISIBLE);
				t1.setVisibility(View.GONE);
				t2.setVisibility(View.GONE);
				t4.setVisibility(View.GONE);
				page1.setVisibility(View.GONE);
				page2.setVisibility(View.GONE);
				page3.setVisibility(View.VISIBLE);
				page4.setVisibility(View.GONE);
			}
		});
		
		above4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ObjectAnimator anim = ObjectAnimator.ofFloat(t4, "ScaleY", 0, 1);
				anim.setInterpolator(new BounceInterpolator()); 
				anim.setDuration(1000);
				anim.start();
				above2.setBackgroundColor(Color.TRANSPARENT);
				above.setBackgroundColor(Color.TRANSPARENT);
				above3.setBackgroundColor(Color.TRANSPARENT);
				_rippleRoundStroke(above4, "#3affffff", "#40FFFFFF", 20, 0, "#000000");
				t4.setTextColor(0xFFFFFFFF);
				t2.setTextColor(0xFFE0E0E0);
				t1.setTextColor(0xFFE0E0E0);
				t3.setTextColor(0xFFE0E0E0);
				_Icon_Colour(img4, "#ffffff");
				_Icon_Colour(img2, "#e0e0e0");
				_Icon_Colour(amg1, "#e0e0e0");
				_Icon_Colour(img3, "#e0e0e0");
				t4.setVisibility(View.VISIBLE);
				t1.setVisibility(View.GONE);
				t2.setVisibility(View.GONE);
				t3.setVisibility(View.GONE);
				page1.setVisibility(View.GONE);
				page2.setVisibility(View.GONE);
				page3.setVisibility(View.GONE);
				page4.setVisibility(View.VISIBLE);
			}
		});
		
		_user_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childKey.equals(FirebaseAuth.getInstance().getCurrentUser().getUid())) {
					_drawer_name.setText(_childValue.get("name").toString());
					_drawer_regnum.setText(_childValue.get("register number").toString());
					_drawer_email.setText(_childValue.get("email").toString());
				}
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
		
		_banner_image_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								count = count;
								count++;
								if (count == 1) {
									_setCornerRadius(linear3s, 360, "#2196f3");
									_setCornerRadius(linear1038s, 360, "#616161");
									_setCornerRadius(linear1039s, 360, "#616161");
									_setCornerRadius(linear91s, 360, "#616161");
									_setCornerRadius(linear92s, 360, "#616161");
									_CircleImage(imageview53);
									Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("img1").toString())).into(imageview53);
								}
								if (count == 2) {
									_setCornerRadius(linear3s, 360, "#616161");
									_setCornerRadius(linear1038s, 360, "#2196f3");
									_setCornerRadius(linear1039s, 360, "#616161");
									_setCornerRadius(linear91s, 360, "#616161");
									_setCornerRadius(linear92s, 360, "#616161");
									_CircleImage(imageview53);
									Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("img2").toString())).into(imageview53);
								}
								if (count == 3) {
									_setCornerRadius(linear3s, 360, "#616161");
									_setCornerRadius(linear1038s, 360, "#616161");
									_setCornerRadius(linear1039s, 360, "#2196f3");
									_setCornerRadius(linear91s, 360, "#616161");
									_setCornerRadius(linear92s, 360, "#616161");
									_CircleImage(imageview53);
									Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("img3").toString())).into(imageview53);
								}
								if (count == 4) {
									_setCornerRadius(linear3s, 360, "#616161");
									_setCornerRadius(linear1038s, 360, "#616161");
									_setCornerRadius(linear1039s, 360, "#616161");
									_setCornerRadius(linear91s, 360, "#2196f3");
									_setCornerRadius(linear92s, 360, "#616161");
									_CircleImage(imageview53);
									Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("img4").toString())).into(imageview53);
								}
								if (count == 5) {
									_setCornerRadius(linear3s, 360, "#616161");
									_setCornerRadius(linear1038s, 360, "#616161");
									_setCornerRadius(linear1039s, 360, "#616161");
									_setCornerRadius(linear91s, 360, "#616161");
									_setCornerRadius(linear92s, 360, "#2196f3");
									_CircleImage(imageview53);
									Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("img5").toString())).into(imageview53);
									count = 0;
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(timer, (int)(0), (int)(4000));
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
		banner_image.addChildEventListener(_banner_image_child_listener);
		
		_drawer_linear4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ProfileActivity.class);
				startActivity(i);
			}
		});
		
		_drawer_linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				email.setClass(getApplicationContext(), AttendenceActivity.class);
				startActivity(email);
			}
		});
		
		_drawer_linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), WebsiteActivity.class);
				web.edit().putString("link", "https://drive.google.com/file/d/1ORajS_kvIUXfI_R8pZnbQFhs3FokEwUZ/view?usp=drivesdk").commit();
				startActivity(i);
			}
		});
		
		_drawer_linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				shareApplication();
			}
		});
		
		_drawer_contactus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), HelpActivity.class);
				startActivity(i);
			}
		});
		
		_drawer_linear9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				email.setAction(Intent.ACTION_VIEW);
				email.setData(Uri.parse("mailto:sdmentrepreneurs@gmail.com"));
				startActivity(email);
			}
		});
		
		_drawer_abtdev.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), AboutDeveloperActivity.class);
				startActivity(i);
			}
		});
		
		_drawer_linear10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				logout.setTitle("Anikethana");
				logout.setIcon(R.drawable.anikethana);
				logout.setMessage("Are you sure you want log out!! ");
				logout.setPositiveButton("Log out", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						FirebaseAuth.getInstance().signOut();
						finishAffinity();
					}
				});
				logout.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				logout.create().show();
			}
		});
		
		_drawer_insta.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), WebsiteActivity.class);
				web.edit().putString("link", "https://www.instagram.com/sdm_coders/").commit();
				startActivity(i);
			}
		});
		
		_drawer_facebook.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), WebsiteActivity.class);
				web.edit().putString("link", "https://m.facebook.com/100074718252889/").commit();
				startActivity(i);
			}
		});
		
		_drawer_wtsap.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				whatsapp.setAction(Intent.ACTION_VIEW);
				whatsapp.setData(Uri.parse("https://chat.whatsapp.com/G8uCfiTtvzzDm8VipDOcEY"));
				startActivity(whatsapp);
			}
		});
		
		_drawer_telegram.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				telegram.setAction(Intent.ACTION_VIEW);
				telegram.setData(Uri.parse("https://t.me/+OaL6V1V3UNA2MDI1"));
				startActivity(telegram);
			}
		});
		
		_drawer_mail.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				email.setAction(Intent.ACTION_VIEW);
				email.setData(Uri.parse("mailto:sdmentrepreneurs@gmail.com"));
				startActivity(email);
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
		_setcornerradius(_drawer_linear4, 10, 2, "#FFFFFF");
		_setcornerradius(_drawer_linear5, 10, 2, "#FFFFFF");
		_setcornerradius(_drawer_linear6, 10, 2, "#FFFFFF");
		_setcornerradius(_drawer_linear11, 10, 2, "#FFFFFF");
		_setcornerradius(_drawer_linear8, 10, 2, "#FFFFFF");
		_setcornerradius(_drawer_linear9, 10, 2, "#FFFFFF");
		_setcornerradius(_drawer_linear10, 10, 2, "#FFFFFF");
		_setcornerradius(_drawer_contactus, 10, 2, "#FFFFFF");
		_setcornerradius(_drawer_abtdev, 10, 2, "#FFFFFF");
		_setcornerradius(notes, 30, 1, "#4EA1F3");
		_setcornerradius(questionbank, 30, 1, "#4EA1F3");
		_setcornerradius(cet, 30, 1, "#4EA1F3");
		_setcornerradius(gallery, 30, 1, "#4EA1F3");
		_setcornerradius(vedio, 30, 1, "#4EA1F3");
		_setcornerradius(callender, 30, 1, "#4EA1F3");
		_setcornerradius(faculty, 30, 1, "#4EA1F3");
		_setcornerradius(sports, 30, 1, "#4EA1F3");
		_setcornerradius(abtcollege, 30, 1, "#4EA1F3");
		_setcornerradius(notice, 30, 1, "#4EA1F3");
		_setcornerradius(website, 30, 1, "#4EA1F3");
		above2.performClick();
		background.setElevation((float)30);
		_DARK_ICONS();
		_Icon_Colour(imageview54, "#FFFFFF");
		_Icon_Colour(imageview55, "#FFFFFF");
		_Icon_Colour(imageview56, "#FFFFFF");
		_Icon_Colour(imageview57, "#FFFFFF");
		_Icon_Colour(imageview58, "#FFFFFF");
		_Icon_Colour(imageview59, "#FFFFFF");
		_Icon_Colour(imageview60, "#FFFFFF");
		_Icon_Colour(imageview61, "#FFFFFF");
		_Icon_Colour(imageview62, "#FFFFFF");
		_Icon_Colour(imageview63, "#FFFFFF");
		_Icon_Colour(imageview65, "#FFFFFF");
		_Icon_Colour(_drawer_insta, "#FFFFFF");
		_Icon_Colour(_drawer_facebook, "#FFFFFF");
		_Icon_Colour(_drawer_wtsap, "#FFFFFF");
		_Icon_Colour(_drawer_telegram, "#FFFFFF");
		_Icon_Colour(_drawer_mail, "#FFFFFF");
		StrictMode.VmPolicy.Builder builder = 
		    new StrictMode.VmPolicy.Builder(); 
		    StrictMode.setVmPolicy(builder.build());
		    if(Build.VERSION.SDK_INT>=24){ 
			         try{
				        java.lang.reflect.Method m = 
				              StrictMode.class.getMethod(
				        "disableDeathOnFileUriExposure"); 
				              m.invoke(null); 
				       }
			      catch(Exception e){ 
				        showMessage(e.toString()); 
				       } 
			    }
		webview1.loadUrl("https://drive.google.com/file/d/0BxyMs1jY42NLMUhrTldRTVhlZFU/view?usp=drivesdk&resourcekey=0-ytps8x_JssBVysqd3qeXIg");
	}
	
	@Override
	public void onBackPressed() {
		finishAffinity();
	}
	public void _setcornerradius(final View _view, final double _radius, final double _shadow, final String _color) {
		//modified by ashishtechnozone
		android.graphics.drawable.GradientDrawable ab = new android.graphics.drawable.GradientDrawable();
		
		ab.setColor(Color.parseColor(_color));
		ab.setCornerRadius((float) _radius);
		_view.setElevation((float) _shadow);
		_view.setBackground(ab);
		
		
	}
	
	
	public void _DARK_ICONS() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
	}
	
	
	public void _Icon_Colour(final ImageView _iconview, final String _colour) {
		_iconview.getDrawable().setColorFilter(Color.parseColor(_colour), PorterDuff.Mode.SRC_IN);
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
	
	
	public void _setCornerRadius(final View _view, final double _value, final String _color) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((int)_value);
		_view.setBackground(gd);
	}
	
	
	public void _CircleImage(final ImageView _image) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable ();
		gd.setColor(android.R.color.transparent);
		gd.setCornerRadius(30);
		_image.setClipToOutline(true);
		_image.setBackground(gd);
	}
	
	
	public void _share() {
	}
	private void shareApplication() { 
		      android.content.pm.ApplicationInfo app = 
		      getApplicationContext().getApplicationInfo(); 
		      String filePath = app.sourceDir;
		      Intent intent = new Intent(Intent.ACTION_SEND); 
		      intent.setType("*/*"); 
		      java.io.File originalApk = new java.io.File(filePath); 
		      try {  
			        java.io.File tempFile = new java.io.File(getExternalCacheDir() + "/ExtractedApk"); 
			         if (!tempFile.isDirectory()) 
			         if (!tempFile.mkdirs()) 
			         return; 
			         tempFile = new java.io.File(tempFile.getPath() + "/" + 
			         "export.apk");
			         if (!tempFile.exists()) 
			          {
				           try{
					             if (!tempFile.createNewFile()) { 
						               return; }
					            }
				           catch (java.io.IOException e){} 
				          } 
			         java.io.InputStream in = new java.io.FileInputStream (originalApk);
			         java.io.OutputStream out = new java.io.FileOutputStream(tempFile);
			         byte[] buf = new byte[1024];
			         int len; 
			         while ((len = in.read(buf)) > 0) { 
				            out.write(buf, 0, len); 
				         } 
			         in.close(); 
			         out.close(); 
			         intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(tempFile));
			         startActivity(Intent.createChooser(intent, "Share app via"));
			      } 
		      catch (java.io.IOException e) 
		      { showMessage(e.toString()); 
			      } 
		   }
	{
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