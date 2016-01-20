package com.gaozhen.fruitbuyer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.gaozhen.fruitbuyer.R;
import com.gaozhen.fruitbuyer.adapter.FruitCategoryAdapter;
import com.gaozhen.fruitbuyer.adapter.FruitCategoryTwoAdapter;

public class CategoryFragment extends BaseFragment implements OnItemClickListener {

	private ListView classify;
	private ListView classifyTwo;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_fruit_classify, null);
		classify = (ListView) view.findViewById(R.id.classify);
		FruitCategoryAdapter fAdapter = new FruitCategoryAdapter(getActivity());
		classify.setAdapter(fAdapter);
		classify.setOnItemClickListener(this);
		classifyTwo = (ListView) view.findViewById(R.id.classify_two);

		return view;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		FruitCategoryTwoAdapter Adapter = new FruitCategoryTwoAdapter(getActivity());
		classifyTwo.setAdapter(Adapter);
	}

	@Override
	void setTopBar() {
		setLogoVisible();
		setLeft("", -1, null);
		setRight("", R.drawable.search, new OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});
	}
}
