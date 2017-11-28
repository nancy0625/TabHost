package com.example.android_tabhost;



import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabspecIntent extends TabActivity{


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabspec_intent);
		
		
		TabHost tabHost = getTabHost();
		
		TabSpec page1 = tabHost.newTabSpec("tab1").setIndicator("lll").setContent(R.id.one);
		tabHost.addTab(page1);
		TabSpec page2 = tabHost.newTabSpec("tab2").setIndicator("fda ").setContent(R.id.two);
		tabHost.addTab(page2);
		TabSpec page3 = tabHost.newTabSpec("tab3").setIndicator("err").setContent(R.id.three);
		tabHost.addTab(page3);
		
		//初始化TabHost标签
	
		
		
		//在TabHost创建标签，然后设置：标题、图标、标签布局
		/*tab.addTab(tab.newTabSpec("tab1").setIndicator("标签1",getResources().getDrawable(R.drawable.ic_launcher)).setContent(new Intent(this,Tab1.class)));
		tab.addTab(tab.newTabSpec("tab2").setIndicator("标签2",null).setContent(new Intent(this,Tab2.class)));
		tab.addTab(tab.newTabSpec("tab3").setIndicator("标签3",null).setContent(new Intent(this,Tab3.class)))*/;
	}
	

}
