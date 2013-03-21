package com.fima.cardsui.objects;

import android.content.Context;
import android.view.View;

public abstract class AbstractCard {

	protected String title;
	
	protected int image;
	
	protected String desc;
	
	protected String ho;

	protected String hf;
	
	public abstract View getView(Context context);
	
	public abstract View getView(Context context, boolean swipable);
	
	
	public String getTitle() {
		return title;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getImage() {
		return image;
	}
	
	public String getHo() {
		return ho;
	}
	
	public String getHf() {
		return hf;
	}
	
}
