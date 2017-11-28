package com.example.android_tabhost;

import android.R.anim;
import android.app.ActivityGroup;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class TabspecIntent01 extends ActivityGroup {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabspec_intent);
		
		
		TabHost tab = (TabHost)findViewById(android.R.id.tabhost);
		
		//��ʼ��TabHost��ǩ
		LocalActivityManager localActivityManager = getLocalActivityManager();
		tab.setup(localActivityManager);
		
		//��TabHost������ǩ��Ȼ�����ã����⡢ͼ�ꡢ��ǩ����
		tab.addTab(tab.newTabSpec("tab1").setIndicator("��ǩ1",getResources().getDrawable(R.drawable.ic_launcher)).setContent(new Intent(this,Tab1.class)));
		tab.addTab(tab.newTabSpec("tab2").setIndicator("��ǩ2",null).setContent(new Intent(this,Tab2.class)));
		tab.addTab(tab.newTabSpec("tab3").setIndicator("��ǩ3",null).setContent(new Intent(this,Tab3.class)));
	}
	

}
