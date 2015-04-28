package com.falsetrue.titecs.activities;

import com.falsetrue.titecs.R;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FragmentAnswer extends Fragment {
	
	public static final int ANSWER_FALSE = 0;
	public static final int ANSWER_TRUTH = 1;
	
	public interface onSomeEventListener {
	    public void someEvent(int s);
	  }
	
	onSomeEventListener someEventListener;
	
	@Override
	  public void onAttach(Activity activity) {
	    super.onAttach(activity);
	        try {
	          someEventListener = (onSomeEventListener) activity;
	        } catch (ClassCastException e) {
	            throw new ClassCastException(activity.toString() + " must implement onSomeEventListener");
	        }
	  }
	 
	
	@Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
		 View v = inflater.inflate(R.layout.fragment_yesno_buttons, null);
		 
		 Button btnFalse = (Button) v.findViewById(R.id.btnFalse);
		 btnFalse.setOnClickListener(new OnClickListener() {
		      public void onClick(View v) {
		    	  someEventListener.someEvent(ANSWER_FALSE);
		      }
		    });
		 
		 
		 Button btnTruth = (Button) v.findViewById(R.id.btnTruth);
		 btnTruth.setOnClickListener(new OnClickListener() {
		      public void onClick(View v) {
		    	  someEventListener.someEvent(ANSWER_TRUTH);
		      }
		    });
	    return v;
	  }


}
